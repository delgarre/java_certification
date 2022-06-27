package com.javacert.functionalinterfaces;

import com.javacert.functionalinterfaces.Employee;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee delenis = new Employee("Delenis Garrett", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red Ridinghood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(delenis);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        printEmployeesByAge(employees,"Employees over 30", employee -> employee.getAge()>30);
        printEmployeesByAge(employees,"\nEmployees 30 and under", employee -> employee.getAge()<=30);

    }
        private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> agecondition){
            System.out.println(ageText);
            System.out.println("=================================");
            for (Employee employee: employees){
                if (agecondition.test(employee)){
                    System.out.println(employee.getName());
                }
            }
        }
}
