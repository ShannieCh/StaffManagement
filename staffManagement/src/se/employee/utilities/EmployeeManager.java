package se.employee.utilities;

import se.employee.models.*;
import java.util.*;

import se.employee.enums.Gender;
import static se.employee.utilities.Utilities.*;

public class EmployeeManager {

    private static List<Employee> arrayOfDifferentStaffs = new ArrayList<>();

    public void setArrayOfDifferentStaffs(Employee x) {

        this.arrayOfDifferentStaffs.add(x);

    }

    public List<Employee> getListOf(Class c) { // Get list of specific group,ex:Programmer consult etc
        List<Employee> temp = new ArrayList<>();

        for (Employee e : arrayOfDifferentStaffs) {
            if (e.getClass().equals(c)) {
                temp.add(e);
            }
        }
        return temp;
    }

//   
    public List<Employee> listOfMembers() {//Send Copy of list and not the list
        return new ArrayList<>(arrayOfDifferentStaffs);
    }

    public boolean addEmploee(Employee newStaff) { // To add employee
        return arrayOfDifferentStaffs.add(newStaff);
    }

    public boolean deleteEmployeeById(int id) {
        return arrayOfDifferentStaffs.remove(findById(id));
    }

    public void showList(List<Employee> listOf) {
        for (Employee e : listOf) {
            System.out.println(e);
        }
    }

    public Employee findById(int id) {
        for (Employee e : arrayOfDifferentStaffs) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void uppdate(Employee emp) {
        int ch = 1;
        endloop:
        do {
            ch = nextInt("1:name\n2:email\n3:age\n0:exit");
            switch (ch) {
                case 1:
                    emp.setName(nextLine("new name"));
                    break;
                case 2:
                    System.out.println(emp.getEmail());
                    emp.setEmail(nextLine("new Email:"));
                    break;
                case 3:
                    emp.setAge(nextInt("new Age"));
                    break;
                default:
                    break endloop;
            }
        } while ((ch != 0));
    }

    public double averageSalary() {
        int num = arrayOfDifferentStaffs.size();
        double count = 0.0;
        for (Employee e : arrayOfDifferentStaffs) {
            count = e.getSalary();

        }
        return (count / num);

    }

    public double maxSalary() {

        double max = 0.0;
        for (Employee e : arrayOfDifferentStaffs) {
            if (e.getSalary() > max) {
                max = e.getSalary();
            }
        }
        return max;

    }

    public double minSalary() {
        double min = arrayOfDifferentStaffs.get(0).getSalary();
        for (Employee e : arrayOfDifferentStaffs) {
            if (e.getSalary() < min) {
                min = e.getSalary();
            }

        }
        return min;

    }

    public double calculateTotalBonus() {
        double total = 0.0;
        for (Employee e : arrayOfDifferentStaffs) {
            total = total + e.bonus();

        }
        return total;

    }

    public double womanPercentage() {
        int count=0;
        for (Employee e : arrayOfDifferentStaffs) {
           
            if(e.getGender().equals(Gender.FEMAIL)){
            count++;
            }
           
            
        }
        return count*100/arrayOfDifferentStaffs.size()*1.0;
    }
        
        

    
}
