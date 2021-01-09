package com.cdt.curriculumdesign.base.controller;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.model.*;
import com.cdt.curriculumdesign.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    public Loginuser GetUser(@PathVariable int id) {
        return this.userService.getUserById(id);
    }

    @RequestMapping("/getAllUser")
    public DataResult<List<Loginuser>> listAll() {
        return this.userService.listAll();
    }

    @PostMapping("/login")
    public DataResult<Loginuser> checkLogin(Login login) {
        if (login != null) {
            if (login.getUserType() != null) {
                Integer userType = login.getUserType();
                if (userType == 1) {
                    Student student = new Student();
                    student.setStudentid(login.getUsername());
                    student.setStudentpassword(login.getPassword());
                    Student student1 = this.userService.checkStuLogin(student);
                    Loginuser user = new Loginuser(student1.getStudentid(), student1.getStudentpassword(), userType.toString());
                    return DataResult.success(user, "success");
                } else if (userType == 2) {
                    Teacher teacher = new Teacher();
                    teacher.setTeacherid(login.getUsername());
                    teacher.setTeacherpassword(login.getPassword());
                    Teacher teacher1 = this.userService.checkTeaLogin(teacher);
                    Loginuser user = new Loginuser(teacher1.getTeacherid(), teacher1.getTeacherpassword(), userType.toString());
                    return DataResult.success(user, "success");
                } else if (userType == 3) {
                    Manager manager = new Manager();
                    manager.setManagerid(login.getUsername());
                    manager.setManagerpassword(login.getPassword());
                    Manager manager1 = this.userService.checkManLogin(manager);
                    Loginuser user = new Loginuser(manager1.getManagerid(), manager1.getManagerpassword(), userType.toString());
                    return DataResult.success(user, "success");
                } else {
                    return DataResult.notfound("fail:userType无法匹配");
                }
            } else {
                return DataResult.notfound("fail:userType为空");
            }
        }
        return DataResult.notfound("fail:login为空");
    }
}