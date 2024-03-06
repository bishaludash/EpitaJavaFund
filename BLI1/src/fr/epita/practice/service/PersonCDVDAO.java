package fr.epita.practice.service;


import fr.epita.practice.datamodel.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonCDVDAO {
    public ArrayList<Person> readAll() throws IOException {
        /* *
         * Read all the lines from the file
         * and will display the 2nd line of
         * the file in the console
         * */
        Path csvPath = Path.of("SER1/src/fr/epita/practice/subject/data.csv");
        System.out.println(csvPath.toAbsolutePath());

        List<String> personData = Files.readAllLines(csvPath);
        // print to console without trimming
        System.out.println(personData.get(2));

        // print to console with trimming
        System.out.println(Arrays.toString(personData.get(2).split("\\s*,\\s*")));

        // remove first row of CSV as it is column
        personData.remove(0);

        ArrayList<Person> personList = new ArrayList<>();
        for (String line : personData){
            String[] item = line.split(",");

            Person person = extractPersonData(line);
            personList.add(person);
        }
        System.out.println( personList.size());

        //Sorting the Person arraylist by their height
        sortPersonData(personList);
        return personList;
    }

    public void writeAll(ArrayList<Person> personArrayList) throws Exception {
        Path newCsvFile = Path.of("SER3/src/fr/epita/practice/data/data_output.csv");
        String newPersonsCsv = "";

        newPersonsCsv += "\"Name\", \"Height (in)\", \"Weight (lbs)\", \"Age\", \"Sex\"";
        newPersonsCsv += System.getProperty("line.separator");
        for(Person person : personArrayList){
            newPersonsCsv += person.getName()+"," ;
            newPersonsCsv += person.getHeight()+",";
            newPersonsCsv += person.getWeight()+",";
            newPersonsCsv += person.getAge()+",";
            newPersonsCsv += person.getSex()+",";
            newPersonsCsv += System.getProperty("line.separator");
        }

        try {
            Files.write(newCsvFile, newPersonsCsv.getBytes(), StandardOpenOption.WRITE);
        } catch (IOException e){
            throw new Exception(e);
        }



    }

    public static Person extractPersonData(String line){
        String[] item = line.split(",");

        Person person = new Person();
        person.setName(item[0]);
        person.setSex(item[1]);
        person.setAge(Integer.parseInt(item[2].trim()));
        person.setHeight(Integer.parseInt(item[3].trim()));
        person.setWeight(Integer.parseInt(item[4].trim()));
        return person;
    }

    public static void sortPersonData(ArrayList<Person> personList){
        //Sorting the Person arraylist by their height
        System.out.println("--- before");
        System.out.println(Arrays.asList(personList));

        System.out.println("--- After sort");
        Collections.sort(personList);
        System.out.println(Arrays.asList(personList));
    }

}
