package com.cdt.curriculumdesign.base.controller;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.common.DatatableInfo;
import com.cdt.curriculumdesign.base.model.Course;
import com.cdt.curriculumdesign.base.model.Manager;
import com.cdt.curriculumdesign.base.model.Student;
import com.cdt.curriculumdesign.base.model.Teacher;
import com.cdt.curriculumdesign.base.service.ManagerService;
import com.cdt.curriculumdesign.base.service.TeacherService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;


    @RequestMapping("/getPersonInfo")
    public DataResult<DatatableInfo<Manager>> getPersonInfo(DatatableInfo<Manager> datatableInfo, Long managerId) {
        if (managerId != null) {
            return DataResult.success(this.managerService.getPersonInfo(datatableInfo, managerId));
        }
        return DataResult.notfound("查询不到信息!");
    }

    @RequestMapping("/listAllStuByManagerId")
    public DataResult<DatatableInfo<Student>> listAllStuByManagerId(DatatableInfo<Student> datatableInfo, Long managerId) {
        if (managerId != null) {
            return DataResult.success(this.managerService.listAllStuByManagerId(datatableInfo, managerId));
        }
        return DataResult.notfound("查询不到信息!");
    }

    @RequestMapping("/listAllTeaByManagerId")
    public DataResult<DatatableInfo<Teacher>> listAllTeaByManagerId(DatatableInfo<Teacher> datatableInfo, Long managerId) {
        if (managerId != null) {
            return DataResult.success(this.managerService.listAllTeaByManagerId(datatableInfo, managerId));
        }
        return DataResult.notfound("查询不到信息!");
    }

    @RequestMapping("/listAllCourseByManagerId")
    public DataResult<DatatableInfo<Course>> listAllCourseByManagerId(DatatableInfo<Course> datatableInfo, Long managerId) {
        if (managerId != null) {
            return DataResult.success(this.managerService.listAllCourseByManagerId(datatableInfo, managerId));
        }
        return DataResult.notfound("查询不到信息!");
    }

    @RequestMapping("/queryCourse")
    public DataResult<DatatableInfo<Course>> queryCourseByCondition(DatatableInfo<Course> datatableInfo, Course course) {
        if (course != null) {
            return DataResult.success(this.managerService.queryCourseByCondition(datatableInfo, course));
        }
        return DataResult.notfound("查询不到信息!");
    }

    @PostMapping("/addCourse")
    public DataResult<DatatableInfo<Integer>> addCourse(DatatableInfo<Integer> datatableInfo,Course course){
        return this.managerService.addCourse(datatableInfo,course);
    }
}
