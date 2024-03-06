package fr.epita.practice.datamodel;

public class Person {
    private String name;
    private Character sex;
    private Integer age;
    private Integer height;
    private Integer weight;

    public Person(String name, Character sex, Integer age, Integer height, Integer weight) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
    }

    public String toString(){
        return "Person [name=\""+ this.getName()+"\", weight=\""+this.getWeight()+"\"]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
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
}
