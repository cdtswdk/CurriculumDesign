package com.cdt.curriculumdesign.base.service;

import com.cdt.curriculumdesign.base.common.DatatableInfo;
import com.cdt.curriculumdesign.base.mapper.*;
import com.cdt.curriculumdesign.base.model.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class TeacherService {
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


    public DatatableInfo<Teacher> getPersonInfo(DatatableInfo<Teacher> datatableInfo, Long teacherId) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeacheridEqualTo(teacherId);
        List<Teacher> teachers = this.teacherMapper.selectByExample(teacherExample);
        teacherExample.setOffset(datatableInfo.getOffset());
        teacherExample.setLimit(datatableInfo.getPageSize());
        datatableInfo.setData(teachers);
        datatableInfo.setRecordsTotal((int) this.teacherMapper.countByExample(teacherExample));

        return datatableInfo;
    }

    public DatatableInfo<Course> listTeaCourseByStuId(DatatableInfo<Course> datatableInfo, Long teacherId) {
        CourseExample example = new CourseExample();
        CourseExample.Criteria criteria = example.createCriteria();
        if (teacherId != null) {
            criteria.andTeacheridEqualTo(teacherId);
        }
        example.setOffset(datatableInfo.getOffset());
        example.setLimit(datatableInfo.getPageSize());
        datatableInfo.setData(this.courseMapper.selectByExample(example));
        datatableInfo.setRecordsTotal((int) this.courseMapper.countByExample(example));
        return datatableInfo;
    }

    public DatatableInfo<Stucourse> listSelCourseByCourseIdAndTeacherId(DatatableInfo<Stucourse> datatableInfo, Long courseId, Long teacherId) {
        StucourseExample stucourseExample = new StucourseExample();
        StucourseExample.Criteria criteria = stucourseExample.createCriteria();

        criteria.andCourseidEqualTo(courseId).andTeacheridEqualTo(teacherId);

        stucourseExample.setOffset(datatableInfo.getOffset());
        stucourseExample.setLimit(datatableInfo.getPageSize());

        List<Stucourse> stucourseList = this.stucourseMapper.selectByExample(stucourseExample);

        datatableInfo.setData(stucourseList);
        datatableInfo.setRecordsTotal((int) this.stucourseMapper.countByExample(stucourseExample));

        return datatableInfo;
    }

    public DatatableInfo<Stucourse> updateStuCourseGrade(DatatableInfo<Stucourse> datatableInfo, Stucourse stucourse) {

        StucourseExample stucourseExample = new StucourseExample();
        StucourseExample.Criteria criteria = stucourseExample.createCriteria();

        if (stucourse.getStucourseid() != null) {
            Stucourse stucourse1 = this.stucourseMapper.selectByPrimaryKey(stucourse.getStucourseid());
            //更新成绩
            stucourse1.setGrade(stucourse.getGrade());
            stucourse1.setGradepoint(stucourse.getGradepoint());
            this.stucourseMapper.updateByPrimaryKeySelective(stucourse1);
        }
        return datatableInfo;
    }
}