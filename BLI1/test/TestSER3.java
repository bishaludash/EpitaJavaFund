import fr.epita.practice.datamodel.Person;
import fr.epita.practice.service.PersonCDVDAO;

import java.io.IOException;
import java.util.ArrayList;

public class TestSER3 {
    public static void main(String[] args) throws Exception {
        test();
    }

    public static void test() throws Exception {
        PersonCDVDAO personCDVDAO = new PersonCDVDAO();
        ArrayList<Person> personArrayList = personCDVDAO.readAll();
        personCDVDAO.writeAll(personArrayList);
    }
}
