import fr.epita.practice.service.PersonCDVDAO;

import java.io.IOException;

public class TestSER2 {
    public static void main(String[] args) throws IOException {
        test();
    }

    public static void test() throws IOException {
        PersonCDVDAO personCDVDAO = new PersonCDVDAO();
        personCDVDAO.readAll();
    }
}
