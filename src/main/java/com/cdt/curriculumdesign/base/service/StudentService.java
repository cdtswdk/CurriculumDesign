package com.cdt.curriculumdesign.base.service;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.common.DatatableInfo;
import com.cdt.curriculumdesign.base.mapper.*;
import com.cdt.curriculumdesign.base.model.*;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private ManagerMapper managerMapper;
    @Autowired
    private StucourseMapper stucourseMapper;
    @Autowired
    private ClscourseMapper clscourseMapper;
    @Autowired
    private CourseMapper courseMapper;


    public DatatableInfo<Stucourse> listStuCourseByStuId(DatatableInfo<Stucourse> datatableInfo, Long stuId) {
        StucourseExample example = new StucourseExample();
        StucourseExample.Criteria criteria = example.createCriteria();
        if (stuId != null) {
            criteria.andStudentidEqualTo(stuId);
        }
        example.setOffset(datatableInfo.getOffset());
        example.setLimit(datatableInfo.getPageSize());
        example.setOrderByClause("CourseId asc");
        datatableInfo.setData(this.stucourseMapper.selectByExample(example));
        datatableInfo.setRecordsTotal((int) this.stucourseMapper.countByExample(example));
        return datatableInfo;
    }

    public DatatableInfo<Clscourse> listStuClassByStuId(DatatableInfo<Clscourse> datatableInfo, Long stuId) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria studentExampleCriteria = studentExample.createCriteria();
        studentExampleCriteria.andStudentidEqualTo(stuId);
        List<Student> Students = this.studentMapper.selectByExample(studentExample);
        if (CollectionUtils.isNotEmpty(Students)) {
            Student tbStudent = Students.get(0);
            Long classId = tbStudent.getClassid();
            ClscourseExample clscourseExample = new ClscourseExample();
            ClscourseExample.Criteria criteria = clscourseExample.createCriteria();
            clscourseExample.setOffset(datatableInfo.getOffset());
            clscourseExample.setLimit(datatableInfo.getPageSize());
            criteria.andClassidEqualTo(classId);
            List<Clscourse> clscourses = this.clscourseMapper.selectByExample(clscourseExample);

            datatableInfo.setData(clscourses);
            datatableInfo.setRecordsTotal((int) this.clscourseMapper.countByExample(clscourseExample));
            return datatableInfo;
        }
        return null;
    }

    public DatatableInfo<Stucourse> listStuGradeByStuId(DatatableInfo<Stucourse> datatableInfo, Long stuId) {
        StucourseExample example = new StucourseExample();
        StucourseExample.Criteria criteria = example.createCriteria();
        if (stuId != null) {
            criteria.andStudentidEqualTo(stuId);
        }
        //已结课
        criteria.andCoursestatusEqualTo("1");
        example.setOffset(datatableInfo.getOffset());
        example.setLimit(datatableInfo.getPageSize());
        datatableInfo.setData(this.stucourseMapper.selectByExample(example));
        datatableInfo.setRecordsTotal((int) this.stucourseMapper.countByExample(example));
        return datatableInfo;
    }

    public DatatableInfo<Course> listAllCourseByStuId(DatatableInfo<Course> datatableInfo, Long stuId) {
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();
        courseExample.setOffset(datatableInfo.getOffset());
        courseExample.setLimit(datatableInfo.getPageSize());

        List<Course> courses = this.courseMapper.selectByExample(courseExample);
        datatableInfo.setData(courses);
        datatableInfo.setRecordsTotal((int) this.courseMapper.countByExample(courseExample));

        return datatableInfo;
    }


    public DataResult<Course> getCourseByCourseId(DatatableInfo<Course> datatableInfo, Long courseId) {

        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();
        criteria.andCourseidEqualTo(courseId);

        List<Course> courses = this.courseMapper.selectByExample(courseExample);

        datatableInfo.setData(courses);
        return DataResult.success(courses.get(0));
    }

    public DataResult<DatatableInfo<Course>> selectCourseByCourseId(DatatableInfo<Course> datatableInfo, Long courseId, Long stuId) {

        //从课程表中查询该课程
        Course course = this.courseMapper.selectByPrimaryKey(courseId);

        //从学生表中查询有没有这门课
        StucourseExample stucourseExample = new StucourseExample();
        StucourseExample.Criteria criteria = stucourseExample.createCriteria();
        criteria.andCourseidEqualTo(courseId);
        List<Stucourse> stucourses = this.stucourseMapper.selectByExample(stucourseExample);

        //已经选了这门课
        if (CollectionUtils.isNotEmpty(stucourses)) {
            return DataResult.serverError("已经选择了这门课，无需再选！");
        } else {
            StucourseExample stucourseExample1 = new StucourseExample();
            List<Stucourse> stucourseList = this.stucourseMapper.selectByExample(stucourseExample1);
            if (CollectionUtils.isNotEmpty(stucourseList)) {
                for (Stucourse stucourse : stucourseList) {
                    if ("0".equals(stucourse.getCoursestatus()) && stucourse.getCourseweek().equals(course.getCourseweek())
                            && stucourse.getCoursedaynum().equals(course.getCoursedaynum())
                    ) {
                        return DataResult.serverError("所选课程与课程表中其他课程存在时间冲突！");
                    }
                }
            }
        }
        //增加课程
        Stucourse stucourse = new Stucourse();
        stucourse.setStudentid(stuId);
        BeanUtils.copyProperties(course, stucourse);
        this.stucourseMapper.insertSelective(stucourse);
        return DataResult.success(datatableInfo, "选课成功！");
    }

    public DataResult<DatatableInfo<Course>> dropCourseByCourseId(DatatableInfo<Course> datatableInfo, Long courseId, Long stuId) {
        StucourseExample stucourseExample = new StucourseExample();
        StucourseExample.Criteria criteria = stucourseExample.createCriteria();
        criteria.andStudentidEqualTo(stuId).andCourseidEqualTo(courseId);

        List<Stucourse> stucourseList = this.stucourseMapper.selectByExample(stucourseExample);
        if (CollectionUtils.isNotEmpty(stucourseList)) {
            Stucourse stucourse = stucourseList.get(0);
            if ("1".equals(stucourse.getCoursetype())) {
                return DataResult.serverError("该课程为必修课，无法推选！");
            } else {
                this.stucourseMapper.deleteByExample(stucourseExample);
                return DataResult.success(datatableInfo, "退课成功！");
            }
        }
        return DataResult.serverError("退课失败！");
    }
}