package com.cdt.curriculumdesign.base.controller;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.model.TbStucourse;
import com.cdt.curriculumdesign.base.service.StudentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getCourse/{StudentNum}")
    public DataResult<List<TbStucourse>> getStuCourseById(@PathVariable("StudentNum") String StudentNum){
        if(StringUtils.isNotEmpty(StudentNum)){
            return this.studentService.getStuCourseById(StudentNum);
        }
        return DataResult.serverError("学生编号为空！");
    }
}
