package com.noirix.repository.impl;

import com.noirix.domain.Car;
import com.noirix.repository.CarRepository;
import org.apache.commons.lang3.StringUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarRepositoryImpl implements CarRepository {
    public static final String POSTRGES_DRIVER_NAME = "org.postgresql.Driver";
    public static final String DATABASE_URL = "jdbc:postgresql://localhost:";
    public static final int DATABASE_PORT = 5433;
    public static final String DATABASE_NAME = "/webinar";
    public static final String DATABASE_LOGIN = "postgres";
    public static final String DATABASE_PASSWORD = "root";

    private static final String ID = "id";
    private static final String MODEL = "MODEL";
    private static final String COLOR = "COLOR";
    private static final String CREATION_YEAR = "Creation_year";
    private static final String PRICE = "PRICE";

    @Override
    public List<Car> search(String query) {
        return null;
    }

    @Override
    public Car save(Car object) {
        return null;
    }

    @Override
    public List<Car> findAll() {
        final String findAllQuery = "select * from m_cars order by id";

        List<Car> result = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet rs;

        try {
            Class.forName(POSTRGES_DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver Cannot be loaded!");
            throw new RuntimeException("JDBC Driver Cannot be loaded!");
        }

        String jdbcURL = StringUtils.join(DATABASE_URL, DATABASE_PORT, DATABASE_NAME);

        try {
            connection = DriverManager.getConnection(jdbcURL, DATABASE_LOGIN, DATABASE_PASSWORD);
            statement = connection.createStatement();
            rs = statement.executeQuery(findAllQuery);

            while (rs.next()) {
                Car car = new Car();
                car.setId(rs.getLong(ID));
                car.setModel(rs.getString(MODEL));
                car.setColor(rs.getString(COLOR));
                car.setCreation_year(rs.getInt(CREATION_YEAR));
                car.setPrice(rs.getDouble(PRICE));

                result.add(car);
            }

            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException("SQL Issues!");
        }
    }

    @Override
    public Car findById(Long key) {
        return null;
    }

    @Override
    public Optional<Car> findOne(Long key) {
        return Optional.empty();
    }

    @Override
    public Car update(Car object) {
        return null;
    }

    @Override
    public Long delete(Car object) {
        return null;
    }
}