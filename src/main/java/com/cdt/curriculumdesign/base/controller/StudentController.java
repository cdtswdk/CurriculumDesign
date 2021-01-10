package com.cdt.curriculumdesign.base.controller;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.common.DatatableInfo;
import com.cdt.curriculumdesign.base.model.Clscourse;
import com.cdt.curriculumdesign.base.model.Stucourse;
import com.cdt.curriculumdesign.base.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/listCourseByStuId")
    public DataResult<DatatableInfo<Stucourse>> listStuCourseByStuId(DatatableInfo<Stucourse> datatableInfo, Long stuId) {
        datatableInfo = this.studentService.listStuCourseByStuId(datatableInfo, stuId);
        return DataResult.success(datatableInfo);
    }

    @RequestMapping("/listClassByStuId")
    public DataResult<DatatableInfo<Clscourse>> listStuClassByStuId(DatatableInfo<Clscourse> datatableInfo, Long stuId) {
        datatableInfo = this.studentService.listStuClassByStuId(datatableInfo, stuId);
        if (datatableInfo != null) {
            return DataResult.success(datatableInfo);
        }
        return DataResult.serverError("查询不到信息!");
    }

    @RequestMapping("/listGradeByStuId")
    public DataResult<DatatableInfo<Stucourse>> listStuGradeByStuId(DatatableInfo<Stucourse> datatableInfo, Long stuId) {
        datatableInfo = this.studentService.listStuGradeByStuId(datatableInfo, stuId);
        if (datatableInfo != null) {
            return DataResult.success(datatableInfo);
        }
        return DataResult.serverError("查询不到信息!");
    }
}
