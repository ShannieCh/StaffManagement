package se.employee.models;

import se.employee.enums.*;
import se.employee.models.*;

public class Secretor extends Employee {

    private int numberOfLanguage;

    public Secretor(int numberOfLanguage, String name, String email, int age, String telNumber, Double salary, Gender gender) {
        super(name, email, age, telNumber, salary, gender);
        this.numberOfLanguage = numberOfLanguage;
    }

   @Override
    public double bonus() {
        return numberOfLanguage * 1000; // For each language 1000 kr bonus

    }

    public int getNumberOfLanguage() {
        return numberOfLanguage;
    }

    public static int getStaffId() {
        return staffId;
    }

    public void setNumberOfLanguage(int numberOfLanguage) {
        this.numberOfLanguage = numberOfLanguage;
    }

    public static void setStaffId(int staffId) {
        Employee.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Secretor " + super.toString();
    }

}
