package fr.epita.practice.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSER1 {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        test();
    }

    public static void test() throws IOException {
        /* *
        * Read all the lines from the file
        * and will display the 2nd line of
        * the file in the console
        * */
        Path csvPath = Path.of("SER1/src/fr/epita/practice/subject/data.csv");
        System.out.println(csvPath.toAbsolutePath());

        List<String> subjectData = Files.readAllLines(csvPath);
        // print to console without trimming
        System.out.println(subjectData.get(2));

        // print to console with trimming
        System.out.println(Arrays.toString(subjectData.get(2).split("\\s*,\\s*")));

    }
}
