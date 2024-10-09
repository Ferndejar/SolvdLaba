package com.solvd.dao.jdbc;

import com.solvd.BasicConnectionPool;
import com.solvd.dao.ICarDao;
import com.solvd.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CarDao implements ICarDao {


    static BasicConnectionPool connectionPool = BasicConnectionPool.create();

    @Override
    public Car getEntityById(int index) {
        Car car = new Car();
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            String query = "SELECT * FROM `students`.`cars` where idCars = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, index);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                car.setBrand(resultSet.getString("Brand"));
                car.setModel(resultSet.getString("Model"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR");
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return car;
    }

    @Override
    public List<Car> getEntities() {
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
    public void insert(Car car) {
        String query ="INSERT INTO `students`.`cars`(`Brand,`Model`) VALUES (?,?)";
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, car.getBrand());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }


    @Override
    public void delete(int index) {

        String query ="SELECT * FROM DELETE FROM `students`.`cars` WHERE idCars = ?";
        Car car = new Car();
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, index);
            preparedStatement.setString(2, car.getBrand());
            preparedStatement.setString(3, car.getModel());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }


    @Override
    public void update(int index, Car car) {
        String query ="UPDATE `students`.`cars`(`Brand,`Model`) VALUES (?,?) WHERE idCars = ?";
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, index);
            preparedStatement.setString(2, car.getBrand());
            preparedStatement.setString(3, car.getModel());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
}
