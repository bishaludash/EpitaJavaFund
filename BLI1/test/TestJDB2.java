import fr.epita.practice.datamodel.Person;
import fr.epita.practice.service.PersonCDVDAO;
import fr.epita.practice.service.PersonDataService;

import java.io.IOException;
import java.sql.*;
import java.util.List;

public class TestJDB2 {
    public static void main(String[] args) throws IOException {
        System.out.println("test");
        test();
    }

    public static void test() throws IOException {
        PersonCDVDAO personCDVDAO = new PersonCDVDAO();
        List<Person> personList = personCDVDAO.readAll();

        PersonDataService personDataService = new PersonDataService();
        personDataService.averageAge(personList);

        personDataService.filter(personList, 32);

        personDataService.calculateYearOfBirth(personList.get(1));
    }
    //
    //public static void main(String[] args) throws SQLException {
    //    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/club_data","root", "");
    //    PreparedStatement preparedStatement = connection.prepareStatement("SELECT surname, firstname, address, zipcode FROM members");
    //    ResultSet resultSet = preparedStatement.executeQuery();
    //    while (resultSet.next()){
    //        String surname = resultSet.getString("surname");
    //        String firstname = resultSet.getString("firstname");
    //        String address = resultSet.getString("address");
    //        String zipcode = resultSet.getString("zipcode");
    //        System.out.println("surname: " + surname +", firstname: "+ firstname);
    //    }
    //
    //}
}
