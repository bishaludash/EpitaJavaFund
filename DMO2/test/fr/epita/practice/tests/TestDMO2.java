package fr.epita.practice.tests;

import fr.epita.practice.datamodel.Person;

public class TestDMO2 {
    public static void main(String[] args) {
        System.out.println("here");
        test();
    }

    private static void test(){
        Person person = new Person("Bishal", 'M', 28, 179, 83);
        System.out.println(person);
    }


}
