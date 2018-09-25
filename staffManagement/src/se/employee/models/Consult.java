package se.employee.models;

import se.employee.enums.Gender;
import se.employee.models.Employee;

public class Consult extends Employee {

    public Consult( String name, String email, int age, String telNumber, Double salary, Gender gender) {
        super( name, email, age, telNumber, salary, gender);
    }

    public double bonus() {
        return 0.0;

    }

    @Override
    public String toString() {
        return "Consult: "+super.toString(); 
    }
    
    
}
