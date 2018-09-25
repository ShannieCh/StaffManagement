
package se.employee.ui;

import se.employee.models.*;
import se.employee.utilities.*;
import se.employee.enums.*;

public class Initial {// Database

    public static void start() {
        EmployeeManager sF = new EmployeeManager();

        sF.addEmploee(new Programmer("Maliheh", "malih@gmail.com", 37, "0739031071", 4, EducationsLevel.BACHELOR, 32000.34, Gender.FEMAIL));
        sF.addEmploee(new Secretor(2, "Anna", "anna@hotmail.com", 32, "0738846538", 22008.234, Gender.FEMAIL));
        sF.addEmploee(new Secretor(5, "Micheal", "micheal@hotmail.com", 44, "0738811138", 22008.234, Gender.MALE));
        sF.addEmploee(new Consult("Max", "max@hotmail.com", 33, "0764824910", 25900.88, Gender.MALE));
        sF.addEmploee(new Consult("Björn", "bjorn@hotmail.com", 29, "07632825550", 23440.89, Gender.MALE));
        sF.addEmploee(new Technician(12, "Alex", "alex@hotmail.com", 33, "07337709873", 27700.44, Gender.MALE));
        sF.addEmploee(new Technician(10, "Kalle", "kalle@hotmail.com", 33, "073117700073", 29866.04, Gender.MALE));
        sF.addEmploee(new Programmer("Miriam", "Miriam@gmail.com", 43, "0739000071", 4, EducationsLevel.MASTER, 33000.34, Gender.FEMAIL));

    }
}
