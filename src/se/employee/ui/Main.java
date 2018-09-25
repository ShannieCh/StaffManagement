package se.employee.ui;


import se.employee.utilities.*;
import se.employee.models.*;
import se.employee.enums.*;
import static se.employee.utilities.Utilities.*;

public class Main {

    static boolean program = true;
    static String stringChoice;

    public static void main(String[] args) {
        Initial.start();
        EmployeeManager eM = new EmployeeManager();
//        eM.addEmploee(new Consult("Nina", "stringChjkdfhgkjoice", 0, "stringChoice",20.0, Gender.MALE));
//        eM.showList(eM.getListOf(Consult.class));

        while (program) {

            switch (displayMenu()) {
                case 0:

                    break;
                case 1:// go to employeeManagementMenu
                    switch (nextInt(" 1:Programmer\n 2: Tec \n 3: Con \n 4: Secr")) {
                        case 1://Add programmer
                            eM.addEmploee(new Programmer(nextLine("Insert name"), nextLine("Insert email"), nextInt("Insert age"), nextLine("Insert tel"),
                                    nextInt("Years of expriences \n"), EducationsLevel.valueOf(nextLine("Education level? BACHELOR,MASTER,DR")), 0.0, Gender.MALE));
                            eM.showList(eM.listOfMembers());
                            break;
                        case 2:// Add Technician
                            eM.addEmploee(new Technician(nextInt("Call Time"), nextLine("name"), nextLine("email"), nextInt("age\n"), nextLine("tel\n"), nextDouble("Salary"),
                                    Gender.valueOf(nextLine("Gender"))));
                            eM.showList(eM.listOfMembers());
                            break;
                        case 3://Add Consult
                            eM.addEmploee(new Consult(nextLine("name"), nextLine("Insert email"), nextInt("age\n"), nextLine("tel\n"), nextDouble("Salary"), Gender.valueOf(nextLine("Gender"))));
                            eM.showList(eM.listOfMembers());
                        case 4://Add  Secretor
                            eM.addEmploee(new Secretor(nextInt("Number of language"), nextLine("name"), nextLine("email"), nextInt("age\n"), nextLine("TelNumber\n"), nextDouble("Salary"), Gender.valueOf(nextLine("Gender"))));
                            eM.showList(eM.listOfMembers());
                            break;
                        default:

                            System.out.println("You don't add any employee!! ");
                            break;
                    }
                    break;
                case 2:// remove
                    eM.showList(eM.listOfMembers());
                    eM.deleteEmployeeById(nextInt("Whitch ID?"));
                    break;
                case 3:// uppdate
                    eM.showList(eM.listOfMembers());
                    eM.uppdate(eM.findById(nextInt("Whitch Id?")));
                    eM.showList(eM.listOfMembers());

                    break;
                case 4:// Mathematic operation
                    switch (nextInt(" 1:Calculate average\n 2:Max Salary \n 3:Min salary \n 4: Total bonus\n 5: Persentage of women")) {

                        case 1: //Calculate average
                            System.out.println("The average of the salary in the company" + eM.averageSalary());

                        case 2:// Max Calculate
                            System.out.println("Maximum salary is: " + eM.maxSalary());
                        case 3: // Min salary

                            System.out.println("Minimun salary is: " + eM.minSalary());
                        case 4: //Calculate total bonus
                            System.out.println("Total bonus: " + eM.calculateTotalBonus());
                        case 5: //Calculate the percentage of women 
                            System.out.println("Percentage of women : " + eM.womanPercentage());

                    }
                    break;

                default:
                    System.out.println("Choose a valid number!!!");
                    System.out.println();

            }
        }
    }

    public static int displayMenu() {

        System.out.println("\nWelcome to the employment managment system");
        System.out.println("What would you like to do?\n");

        System.out.println("1: Add employee");
        System.out.println("2: Delete employee");
        System.out.println("3: Update employee information");
        System.out.println("4: Matematic Opration:");

        System.out.println("0: Return to main menu");

        return nextInt("Please enter a number:");

    }

    public static int matematicDisplay() {

        System.out.println("\nWhat would you like to do?\n");

        System.out.println("1: Calculate average salary");
        System.out.println("2: Return maximum salary in the company");
        System.out.println("3: Return min salary in the company");
        System.out.println("4: Calculate total bonus in the company");
        System.out.println("5: Calculate the percentage of women in the company");
        System.out.println("0: Return to main menu");

        return nextInt("Please enter a number:");
    }
}
