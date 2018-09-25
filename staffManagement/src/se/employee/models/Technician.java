package se.employee.models;

import se.employee.enums.*;

public class Technician extends Employee {

    int numberOfCallTime;

    public Technician(int numberOfCallTime, String name, String email, int age, String telNumber, Double salary, Gender gender) {
        super(name, email, age, telNumber, salary, gender);
        this.numberOfCallTime = numberOfCallTime;
    }

    @Override
    public double bonus() {
        return numberOfCallTime * 200;

    }

    public int getNumberOfCallTime() {
        return numberOfCallTime;
    }

    public static int getStaffId() {
        return staffId;
    }

    @Override
    public String toString() {
        return " Technician " + super.toString();
    }

}
