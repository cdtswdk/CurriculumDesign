package com.cdt.curriculumdesign.base.controller;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.common.DatatableInfo;
import com.cdt.curriculumdesign.base.model.*;
import com.cdt.curriculumdesign.base.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/getPersonInfo")
    public DataResult<DatatableInfo<Teacher>> getPersonInfo(DatatableInfo<Teacher> datatableInfo, Long teacherId) {
        if (teacherId != null) {
            return DataResult.success(this.teacherService.getPersonInfo(datatableInfo, teacherId));
        }
        return DataResult.notfound("查询不到信息!");
    }

    @RequestMapping("/listCourseByTeaId")
    public DataResult<DatatableInfo<Course>> listTeaCourseByTeaId(DatatableInfo<Course> datatableInfo, Long teacherId) {
        datatableInfo = this.teacherService.listTeaCourseByStuId(datatableInfo, teacherId);
        return DataResult.success(datatableInfo);
    }

    @RequestMapping("/listSelCourseByCourseIdAndTeacherId")
    public DataResult<DatatableInfo<Stucourse>> listSelCourseByCourseIdAndTeacherId(DatatableInfo<Stucourse> datatableInfo,Long courseId,Long teacherId){
        if(courseId!=null && teacherId!=null){
            return DataResult.success(this.teacherService.listSelCourseByCourseIdAndTeacherId(datatableInfo,courseId,teacherId));
        }
        return DataResult.success(datatableInfo);
    }

    @PostMapping("/updateStuCourseGrade")
    public DataResult<DatatableInfo<Stucourse>> updateStuCourseGrade(DatatableInfo<Stucourse> datatableInfo,Stucourse stucourse){
        if(stucourse!=null){
            return DataResult.success(this.teacherService.updateStuCourseGrade(datatableInfo,stucourse));
        }
        return DataResult.serverError("登分失败！");
    }
}
