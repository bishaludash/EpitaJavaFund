package fr.epita.practice.service;

import fr.epita.practice.datamodel.Person;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class PersonDataService {
    public int averageAge(List<Person> persons){
        int ageSum = 0;
        
        for (Person person : persons){
            ageSum += person.getAge();
        }

        System.out.println("Average age is : "+ ageSum/persons.size());
        return ageSum/persons.size();
    }

    public List<Person> filter(List<Person> persons, int thresholdAge){
        ArrayList<Person> personArrayList = new ArrayList<>();

        System.out.println("Given threshold :" + thresholdAge);
        for (Person person : persons){
            if (person.getAge() > thresholdAge){
                personArrayList.add(person);
            }
        }
        System.out.println(personArrayList);
        return personArrayList;
    }

    public int calculateYearOfBirth(Person person){
        System.out.println(person);
        int year = Year.now().getValue();
        int yearOfBirth= year - person.getAge();
        System.out.println("yearOfBirth : "+ yearOfBirth);
        return yearOfBirth;
    }
}
