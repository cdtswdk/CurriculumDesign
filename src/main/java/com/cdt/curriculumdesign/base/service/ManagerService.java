package com.cdt.curriculumdesign.base.service;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.common.DatatableInfo;
import com.cdt.curriculumdesign.base.mapper.*;
import com.cdt.curriculumdesign.base.model.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class ManagerService {
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

    public DatatableInfo<Manager> getPersonInfo(DatatableInfo<Manager> datatableInfo, Long managerId) {
        ManagerExample managerExample = new ManagerExample();
        ManagerExample.Criteria criteria = managerExample.createCriteria();
        criteria.andManageridEqualTo(managerId);
        List<Manager> managers = this.managerMapper.selectByExample(managerExample);
        managerExample.setOffset(datatableInfo.getOffset());
        managerExample.setLimit(datatableInfo.getPageSize());
        datatableInfo.setData(managers);
        datatableInfo.setRecordsTotal((int) this.managerMapper.countByExample(managerExample));

        return datatableInfo;
    }

    public DatatableInfo<Student> listAllStuByManagerId(DatatableInfo<Student> datatableInfo, Long managerId) {

        Manager manager = this.managerMapper.selectByPrimaryKey(managerId);
        Long managerdeptid = manager.getManagerdeptid();
        if (managerdeptid != null) {
            StudentExample studentExample = new StudentExample();
            StudentExample.Criteria criteria = studentExample.createCriteria();
            criteria.andDeptidEqualTo(managerdeptid);
            studentExample.setOffset(datatableInfo.getOffset());
            studentExample.setLimit(datatableInfo.getPageSize());

            datatableInfo.setData(this.studentMapper.selectByExample(studentExample));
            datatableInfo.setRecordsTotal((int) this.studentMapper.countByExample(studentExample));
        }
        return datatableInfo;
    }

    public DatatableInfo<Teacher> listAllTeaByManagerId(DatatableInfo<Teacher> datatableInfo, Long managerId) {

        Manager manager = this.managerMapper.selectByPrimaryKey(managerId);
        Long managerdeptid = manager.getManagerdeptid();
        if (managerdeptid != null) {
            TeacherExample teacherExample = new TeacherExample();
            TeacherExample.Criteria criteria = teacherExample.createCriteria();
            criteria.andDeptidEqualTo(managerdeptid);
            teacherExample.setOffset(datatableInfo.getOffset());
            teacherExample.setLimit(datatableInfo.getPageSize());

            datatableInfo.setData(this.teacherMapper.selectByExample(teacherExample));
            datatableInfo.setRecordsTotal((int) this.teacherMapper.countByExample(teacherExample));
        }
        return datatableInfo;
    }

    public DatatableInfo<Course> listAllCourseByManagerId(DatatableInfo<Course> datatableInfo, Long managerId) {

        Manager manager = this.managerMapper.selectByPrimaryKey(managerId);
        Long managerdeptid = manager.getManagerdeptid();
        if (managerdeptid != null) {
            CourseExample courseExample = new CourseExample();
            CourseExample.Criteria criteria = courseExample.createCriteria();
            criteria.andDeptidEqualTo(managerdeptid);
            courseExample.setOffset(datatableInfo.getOffset());
            courseExample.setLimit(datatableInfo.getPageSize());

            datatableInfo.setData(this.courseMapper.selectByExample(courseExample));
            datatableInfo.setRecordsTotal((int) this.courseMapper.countByExample(courseExample));
        }
        return datatableInfo;
    }

    public DatatableInfo<Course> queryCourseByCondition(DatatableInfo<Course> datatableInfo, Course course) {

        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();

        if (course.getCourseid() != null) {
            criteria.andCourseidEqualTo(course.getCourseid());
        }
        if (StringUtils.isNotEmpty(course.getCoursename())) {
            criteria.andCoursenameLike("%".concat(course.getCoursename().concat("%")));
        }
        if (StringUtils.isNotEmpty(course.getAuditstatus())) {
            criteria.andAuditstatusEqualTo(course.getAuditstatus());
        }
        courseExample.setOffset(datatableInfo.getOffset());
        courseExample.setLimit(datatableInfo.getPageSize());

        datatableInfo.setData(this.courseMapper.selectByExample(courseExample));
        datatableInfo.setRecordsTotal((int) this.courseMapper.countByExample(courseExample));

        return datatableInfo;
    }

    public DataResult<DatatableInfo<Integer>> addCourse(DatatableInfo<Integer> datatableInfo, Course course,Long managerId) {
        if (course != null && managerId!=null) {

            Manager manager = this.managerMapper.selectByPrimaryKey(managerId);

            course.setCoursecreatetime(new Date());
            course.setDeptid(manager.getManagerdeptid());
            course.setDeptname(manager.getDeptname());
            course.setMajorid(manager.getManagermajorid());
            course.setMajorname(manager.getMajorname());

            //查询教师名字
            if(course.getTeacherid()!=null){
                Teacher teacher = this.teacherMapper.selectByPrimaryKey(course.getTeacherid());
                course.setTeachername(teacher.getTeachername());
            }

            int i = this.courseMapper.insertSelective(course);
            datatableInfo.setData(Collections.singletonList(i));
            return DataResult.success(datatableInfo);
        }
        return DataResult.serverError("增加失败！");
    }
}