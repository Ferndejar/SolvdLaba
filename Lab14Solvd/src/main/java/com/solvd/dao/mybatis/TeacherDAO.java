package com.solvd.dao.mybatis;

import com.solvd.MyBatisConf;
import com.solvd.dao.ITeacherDao;
import com.solvd.model.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class TeacherDAO implements ITeacherDao {
    static SqlSessionFactory sqlSessionFactory
            = MyBatisConf.buldFactoryXml();

    @Override
    public Teacher getEntityById(int index) {
        //Interface
//        try(SqlSession session = sqlSessionFactory.openSession()) {
//            Student student = session.selectOne("com.solvd.dao.IStudentDao.getEntityById", index);
//            return student;
//        }

        //XML
        try(SqlSession session = sqlSessionFactory.openSession()) {
            Teacher teacher = session.selectOne("StudentMapper.getEntityById", index);
            return teacher;
        }
    }

    @Override
    public List<Teacher> getEntities() {
        return null;
    }

    @Override
    public void insert(Teacher student) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(int index, Teacher student) {

    }
}
