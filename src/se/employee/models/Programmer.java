package se.employee.models;

import se.employee.enums.Gender;
import se.employee.models.Employee;

public class Programmer extends Employee {

    int yearsOfExperience;
    Enum educationsLevel;

    public Programmer(String name, String email, int age, String telNumber,int yearsOfExperience, Enum educationsLevel, Double salary, Gender gender) {
        super(name, email, age, telNumber, salary, gender);
        this.yearsOfExperience = yearsOfExperience;
        this.educationsLevel = educationsLevel;
    }

    public static void setStaffId(int staffId) {
        Employee.staffId = staffId;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setEducationsLevel(Enum educationsLevel) {
        this.educationsLevel = educationsLevel;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public Enum getEducationsLevel() {
        return educationsLevel;
    }



    public double bonus() {
        return yearsOfExperience * 350;

    }

    @Override
    public String toString() {
        return "Programmers"+super.toString(); 
    }



}
