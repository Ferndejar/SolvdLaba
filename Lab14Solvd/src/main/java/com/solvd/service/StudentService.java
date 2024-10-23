package com.solvd.service;

import com.solvd.dao.ITeacherDao;
;
import com.solvd.dao.mybatis.TeacherDAO;

import java.util.ResourceBundle;

public class StudentService {

    public static ITeacherDao getStudentSelect() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
        if  (resourceBundle.getString("type").equals("jdbc")){
            return new TeacherDAO();
        } else {
            return new TeacherDAO();
        }
    }
}
