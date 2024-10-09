package com.solvd.dao;

import com.solvd.model.ContactInfo;
import com.solvd.model.Teacher;

import java.util.List;

public interface ITeacherDao extends IBaseDao<Teacher>{
    @Override
    Teacher getEntityById(int index);

    @Override
    List<Teacher> getEntities();

    @Override
    void insert(Teacher teacher);

    @Override
    void delete(int index);

    @Override
    void update(int index, Teacher teacher);
}
