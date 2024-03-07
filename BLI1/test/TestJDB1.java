import fr.epita.practice.datamodel.Person;

import java.sql.*;
import java.time.LocalDate;

public class TestJDB1 {
    public static void main(String[] args) throws SQLException {
        Person person = new Person();
        person.setAge(1234);
        person.setName("toto");

        Connection connection = DriverManager.getConnection("jdbc:h2:mem:whatever");
        createPatient(person, connection);
        ResultSet resultSet = connection.prepareStatement("SELECT age, name FROM Person").executeQuery();


        while (resultSet.next()){
            System.out.println( resultSet.getString("name"));
        }
    }

    private static void createPatient(Person person, Connection connection) throws SQLException {
        connection.prepareStatement("CREATE TABLE PERSON(age int, name varchar)").execute();
        PreparedStatement insert = connection.prepareStatement("INSERT INTO PERSON(age, name) values (?, ?)");
        insert.setInt(1, person.getAge());
        insert.setString(2, person.getName());
        insert.execute();
    }
}
