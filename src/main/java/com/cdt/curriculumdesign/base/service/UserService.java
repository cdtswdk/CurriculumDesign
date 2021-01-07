package com.cdt.curriculumdesign.base.service;

import com.cdt.curriculumdesign.base.common.DataResult;
import com.cdt.curriculumdesign.base.mapper.LoginuserMapper;
import com.cdt.curriculumdesign.base.mapper.TbManagerMapper;
import com.cdt.curriculumdesign.base.mapper.TbStudentMapper;
import com.cdt.curriculumdesign.base.mapper.TbTeacherMapper;
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
    private TbStudentMapper studentMapper;
    @Autowired
    private TbTeacherMapper teacherMapper;
    @Autowired
    private TbManagerMapper managerMapper;

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


    public TbStudent checkStuLogin(TbStudent student) {
        if(student!=null){
            if(StringUtils.isNotEmpty(student.getStudentnum())){
                TbStudent tbStudent = this.studentMapper.selectByPrimaryKey(student.getStudentnum());
                if(tbStudent!=null){
                    if(tbStudent.getStudentpassword().equals(student.getStudentpassword())){
                        return tbStudent;
                    }else {
                        return null;
                    }
                }else {
                    return null;
                }
            }else {
                return null;
            }
        }
        return null;
    }

    public TbTeacher checkTeaLogin(TbTeacher teacher) {
        if(teacher!=null){
            if(StringUtils.isNotEmpty(teacher.getDeptnum())){
                TbTeacher tbTeacher = this.teacherMapper.selectByPrimaryKey(teacher.getTeachernum());
                if(tbTeacher!=null){
                    if(tbTeacher.getTeacherpassword().equals(teacher.getTeacherpassword())){
                        return tbTeacher;
                    }else {
                        return null;
                    }
                }else {
                    return null;
                }
            }else {
                return null;
            }
        }
        return null;
    }
    public TbManager checkManLogin(TbManager manager) {
        if(manager!=null){
            if(StringUtils.isNotEmpty(manager.getManagernum())){
                TbManager tbManager = this.managerMapper.selectByPrimaryKey(manager.getManagernum());
                if(tbManager!=null){
                    if(tbManager.getManagerpassword().equals(manager.getManagerpassword())){
                        return tbManager;
                    }else {
                        return null;
                    }
                }else {
                    return null;
                }
            }else {
                return null;
            }
        }
        return null;
    }
}