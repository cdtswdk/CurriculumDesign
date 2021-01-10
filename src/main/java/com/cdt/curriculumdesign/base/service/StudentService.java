package com.cdt.curriculumdesign.base.service;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.common.DatatableInfo;
import com.cdt.curriculumdesign.base.mapper.*;
import com.cdt.curriculumdesign.base.model.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
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
        if(stuId!=null){
            criteria.andStudentidEqualTo(stuId);
        }
        example.setOffset(datatableInfo.getOffset());
        example.setLimit(datatableInfo.getPageSize());
        datatableInfo.setData(this.stucourseMapper.selectByExample(example));
        datatableInfo.setRecordsTotal((int) this.stucourseMapper.countByExample(example));
        return datatableInfo;
    }

    public DatatableInfo<Clscourse> listStuClassByStuId(DatatableInfo<Clscourse> datatableInfo, Long stuId) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria studentExampleCriteria = studentExample.createCriteria();
        studentExampleCriteria.andStudentidEqualTo(stuId);
        List<Student> Students = this.studentMapper.selectByExample(studentExample);
        if(CollectionUtils.isNotEmpty(Students)){
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
        if(stuId!=null){
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


    public DataResult<DatatableInfo<Course>> getCourseByCourseId(DatatableInfo<Course> datatableInfo, Long courseId) {

        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();
        criteria.andCourseidEqualTo(courseId);

        List<Course> courses = this.courseMapper.selectByExample(courseExample);

        datatableInfo.setData(courses);
        return DataResult.success(datatableInfo);
    }
}