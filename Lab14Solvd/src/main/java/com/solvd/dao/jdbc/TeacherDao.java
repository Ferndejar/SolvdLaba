package com.solvd.dao.jdbc;

import com.solvd.dao.ITeacherDao;
import com.solvd.model.Car;
import com.solvd.model.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static com.solvd.dao.jdbc.CarDao.connectionPool;


public class TeacherDao implements ITeacherDao {
    @Override
    public Teacher getEntityById(int index) {
       Teacher teacher = new Teacher();
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            String query = "SELECT * FROM `students`.`teachers` where `idTeachers` = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, index);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                teacher.setFirstName(resultSet.getString("FirstName"));
                teacher.setLastName(resultSet.getString("LastName"));
                teacher.setSalary(resultSet.getInt("Salary"));
                teacher.setCarID(resultSet.getInt("`Cars_idCars`"));
                teacher.setContact_InfoID(resultSet.getInt("`Contact_info_fk`"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR");
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return teacher;
    }

    @Override
    public List<Teacher> getEntities() {
        Connection connection = connectionPool.getConnection();
        System.out.println("Thread");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        connectionPool.releaseConnection(connection);
        return null;
    }

    @Override
    public void insert(Teacher teacher) {
        String query ="INSERT INTO `students`.`teachers`(`FirstName,`LastName`,`Salary`,`Cars_idCars`," +
                "`Contact_info_fk`) VALUES (?,?,?,?,?)";
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, teacher.getFirstName());
            preparedStatement.setString(2, teacher.getFirstName());
            preparedStatement.setInt(3, teacher.getSalary());
            preparedStatement.setInt(4, teacher.getCarID());
            preparedStatement.setInt(5, teacher.getContact_InfoID());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }

    @Override
    public void delete(int index) {
        String query ="SELECT * FROM DELETE FROM `students`.`teachers` WHERE `idTeachers` = ?";
        Teacher teacher = new Teacher();
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, index);
            preparedStatement.setString(2, teacher.getFirstName());
            preparedStatement.setString(3, teacher.getFirstName());
            preparedStatement.setInt(4, teacher.getSalary());
            preparedStatement.setInt(5, teacher.getCarID());
            preparedStatement.setInt(6, teacher.getContact_InfoID());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }

    @Override
    public void update(int index, Teacher teacher) {
        String query ="UPDATE ``students`.`teachers`(`FirstName,`LastName`,`Salary`,`Cars_idCars`," +
                "`Contact_info_fk) VALUES (?,?,?,?,?) WHERE `idTeachers` = ?";
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, index);
            preparedStatement.setString(2, teacher.getFirstName());
            preparedStatement.setString(3, teacher.getFirstName());
            preparedStatement.setInt(4, teacher.getSalary());
            preparedStatement.setInt(5, teacher.getCarID());
            preparedStatement.setInt(6, teacher.getContact_InfoID());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
}
