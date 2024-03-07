package fr.epita.practice.service;

import fr.epita.practice.datamodel.Person;

import java.sql.*;

public class PersonJDBCDAO {
    public void create(Person patient) throws Exception {
        try(Connection connection = DriverManager.getConnection("jdbc:h2:mem:whatever");) {
            connection.prepareStatement("CREATE TABLE PATIENTS(healthcareNumber int, lastName varchar, subscriptionDate date)").execute();
            PreparedStatement insert = connection.prepareStatement("INSERT INTO PATIENTS(healthcareNumber, lastName) values (?, ?)");
            insert.setString(2, patient.getName());
            insert.setInt(1, patient.getAge());
            insert.execute();

        }catch (SQLException sqlException){
            throw new Exception(sqlException);
        }
    }
}
