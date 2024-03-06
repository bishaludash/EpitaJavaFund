import fr.epita.practice.datamodel.Person;
import fr.epita.practice.service.PersonCDVDAO;
import fr.epita.practice.service.PersonDataService;

import java.io.IOException;
import java.util.List;

public class TestBLI1 {
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
}
