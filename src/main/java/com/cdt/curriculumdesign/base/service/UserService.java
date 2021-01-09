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
public class UserService {
    @Autowired
    private LoginuserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private ManagerMapper managerMapper;

    public Loginuser getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public DataResult<List<Loginuser>> listAll() {
        LoginuserExample example = new LoginuserExample();
        LoginuserExample.Criteria criteria = example.createCriteria();
        List<Loginuser> users = this.userMapper.selectByExample(example);
        DataResult<List<Loginuser>> dataResult = new DataResult<>();
        dataResult.setCode(0);
        dataResult.setMessage("success");
        dataResult.setData(users);
        return dataResult;
    }


    public Student checkStuLogin(Student student) {
        if (student != null) {
            if (student.getStudentid() != null) {
                Student student1 = this.studentMapper.selectByPrimaryKey(student.getStudentid());
                if (student1 != null) {
                    if (student1.getStudentpassword().equals(student.getStudentpassword())) {
                        return student1;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public Teacher checkTeaLogin(Teacher teacher) {
        if (teacher != null) {
            if (teacher.getTeacherid() != null) {
                Teacher teacher1 = this.teacherMapper.selectByPrimaryKey(teacher.getTeacherid());
                if (teacher1 != null) {
                    if (teacher1.getTeacherpassword().equals(teacher.getTeacherpassword())) {
                        return teacher1;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public Manager checkManLogin(Manager manager) {
        if (manager != null) {
            if (manager.getManagerid() != null) {
                Manager manager1 = this.managerMapper.selectByPrimaryKey(manager.getManagerid());
                if (manager1 != null) {
                    if (manager1.getManagerpassword().equals(manager.getManagerpassword())) {
                        return manager1;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        return null;
    }
}