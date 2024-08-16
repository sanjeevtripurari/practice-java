package net.sanjeev.classex4.encapsulation;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        this.name = "John Doe";
        this.age = 25;
        this.gender = "Male";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
            return true;
        }
        return false;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
