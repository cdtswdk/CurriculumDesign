package com.cdt.curriculumdesign.base.service;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.mapper.UserMapper;
import com.cdt.curriculumdesign.base.model.User;
import com.cdt.curriculumdesign.base.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserById(int id){
        return userMapper.selectByPrimaryKey(id);
    }

    public DataResult<List<User>> listAll() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        List<User> users = this.userMapper.selectByExample(example);
        DataResult<List<User>> dataResult = new DataResult<>();
        dataResult.setCode(0);
        dataResult.setMessage("success");
        dataResult.setData(users);
        return dataResult;
    }
}