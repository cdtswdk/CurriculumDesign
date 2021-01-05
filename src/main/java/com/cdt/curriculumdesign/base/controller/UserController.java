package com.cdt.curriculumdesign.base.controller;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.model.User;
import com.cdt.curriculumdesign.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public User GetUser(@PathVariable int id){
        return this.userService.getUserById(id);
    }

    @RequestMapping("/getAllUser")
    public DataResult<List<User>> listAll(){
        return this.userService.listAll();
    }
}