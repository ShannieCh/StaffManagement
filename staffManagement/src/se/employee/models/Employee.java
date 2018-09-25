package se.employee.models;

import se.employee.enums.Gender;

public abstract class Employee {// Super class(Parent)
    public static int staffId = 0;
    
    private int age;
    private int id;
    private String name;
    private String email;
    private String telNumber;
    private double salary;
    private Gender gender;

//    public Staff() {
//    }

    public Employee(String name, String email, int age, String telNumber, Double salary, Gender gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.telNumber = telNumber;
        this.gender = gender;
        this.id = ++staffId;
    }

    public abstract double bonus();
    //public abstract double salary();

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  id + "/" + " Name: " + name + "/" + " Age:" + age + "/" + " Email: " + email + "/" + " Tellefon nummber: " + this.telNumber + "/" + " Gender:" + gender + "/" + " Salary:" + salary;

    }

}
