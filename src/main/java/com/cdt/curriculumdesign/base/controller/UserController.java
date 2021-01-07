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
    public User GetUser(@PathVariable int id) {
        return this.userService.getUserById(id);
    }

    @RequestMapping("/getAllUser")
    public DataResult<List<User>> listAll() {
        return this.userService.listAll();
    }

    @PostMapping("/login")
    public DataResult<User> checkLogin(Login login) {
        if (login != null) {
            if (login.getUserType() != null) {
                Integer userType = login.getUserType();
                if (userType == 1) {
                    TbStudent tbStudent = new TbStudent();
                    tbStudent.setStudentnum(login.getUsername());
                    tbStudent.setStudentpassword(login.getPassword());
                    TbStudent tbStudent1 = this.userService.checkStuLogin(tbStudent);
                    User user = new User(tbStudent1.getStudentnum(), tbStudent1.getStudentpassword());
                    return DataResult.success(user,"success");
                } else if (userType == 2) {
                    TbTeacher tbTeacher = new TbTeacher();
                    tbTeacher.setTeachernum(login.getUsername());
                    tbTeacher.setTeacherpassword(login.getPassword());
                    TbTeacher tbTeacher1 = this.userService.checkTeaLogin(tbTeacher);
                    User user = new User(tbTeacher1.getTeachernum(), tbTeacher1.getTeacherpassword());
                    return DataResult.success(user,"success");
                } else if (userType == 3) {
                    TbManager tbManager = new TbManager();
                    tbManager.setManagernum(login.getUsername());
                    tbManager.setManagerpassword(login.getPassword());
                    TbManager tbManager1 = this.userService.checkManLogin(tbManager);
                    User user = new User(tbManager1.getManagernum(), tbManager1.getManagerpassword());
                    return DataResult.success(user,"success");
                } else {
                    return DataResult.notfound("fail");
                }
            }else {
                return DataResult.notfound("fail");
            }
        }
        return DataResult.notfound("fail");
    }
}