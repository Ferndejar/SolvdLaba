package com.solvd.dao.jdbc;

import com.solvd.dao.IContactInfoDao;
import com.solvd.model.Car;
import com.solvd.model.ContactInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static com.solvd.dao.jdbc.CarDao.connectionPool;

public class ContactInfoDao implements IContactInfoDao {
    @Override
    public ContactInfo getEntityById(int index) {
        ContactInfo contactInfo = new ContactInfo();
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            String query = "SELECT * FROM `students`.`contact info` where `idContact info` = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, index);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                contactInfo.setCity(resultSet.getString("City"));
                contactInfo.setStreet(resultSet.getString("Street"));
                contactInfo.setPhone(resultSet.getInt("Phone"));
                contactInfo.setEmail(resultSet.getString("Email"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR");
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return contactInfo;
    }

    @Override
    public List<ContactInfo> getEntities() {
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
    public void insert(ContactInfo contactInfo) {
        String query ="INSERT INTO `students`.`contact info`(`City,`Street`,`Phone`,`Email`) VALUES (?,?,?,?)";
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, contactInfo.getCity());
            preparedStatement.setString(2, contactInfo.getStreet());
            preparedStatement.setInt(3, contactInfo.getPhone());
            preparedStatement.setString(4, contactInfo.getEmail());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }

    @Override
    public void delete(int index) {
        String query ="SELECT * FROM DELETE FROM `students`.`contact info` WHERE `idContact info` = ?";
        ContactInfo contactInfo = new ContactInfo();
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, index);
            preparedStatement.setString(2, contactInfo.getCity());
            preparedStatement.setString(3, contactInfo.getStreet());
            preparedStatement.setInt(4, contactInfo.getPhone());
            preparedStatement.setString(5, contactInfo.getEmail());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }

    @Override
    public void update(int index, ContactInfo contactInfo) {
        String query ="UPDATE ``students`.`contact info`(`City,`Street`,`Phone`,`Email`) VALUES (?,?,?,?) WHERE `idContact info` = ?";
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, index);
            preparedStatement.setString(2, contactInfo.getCity());
            preparedStatement.setString(3, contactInfo.getStreet());
            preparedStatement.setInt(4, contactInfo.getPhone());
            preparedStatement.setString(5, contactInfo.getEmail());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }

    }
}
