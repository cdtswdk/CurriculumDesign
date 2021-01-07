package com.cdt.curriculumdesign.base.service;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.mapper.*;
import com.cdt.curriculumdesign.base.model.*;
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
    private TbStudentMapper studentMapper;
    @Autowired
    private TbTeacherMapper teacherMapper;
    @Autowired
    private TbManagerMapper managerMapper;
    @Autowired
    private TbStucourseMapper stucourseMapper;


    public DataResult<List<TbStucourse>> getStuCourseById(String studentNum) {
        TbStucourseExample example = new TbStucourseExample();
        TbStucourseExample.Criteria criteria = example.createCriteria();
        criteria.andStudentnumEqualTo(studentNum);
        List<TbStucourse> tbStucourses = this.stucourseMapper.selectByExample(example);
        return DataResult.success(tbStucourses,"success");
    }
}