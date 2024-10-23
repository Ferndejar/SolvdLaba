package com.solvd.dao;

import com.solvd.model.ContactInfo;
import com.solvd.model.Teacher;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITeacherDao extends IBaseDao<Teacher>{


    @Select(
            "select * from mydb.Teachers where id = #{index}")
    @Results(value = {
            @Result(property="firstName", column = "Firstname"),
            @Result(property="lastName", column = "LastName"),
            @Result(property="carId", column = "Cars_idCars")
    })

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
