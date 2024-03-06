package fr.epita.practice.datamodel;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String name;
    private String sex;
    private Integer age;
    private Integer height;
    private Integer weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Person [name=\""+ this.getName()+"\", height=\""+this.getHeight()+"\"] \n";
    }

    @Override
    public int compareTo(Person o) {
        if (this.getHeight() != o.getHeight()) {
            return this.getHeight() - o.getHeight();
        }
        return this.getHeight().compareTo(o.getHeight());
    }
}
