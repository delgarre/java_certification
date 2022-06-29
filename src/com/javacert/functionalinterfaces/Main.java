package com.javacert.functionalinterfaces;

import com.javacert.functionalinterfaces.Employee;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

        Function<Employee, String> getLastName = (Employee employee) ->{
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };
        String lasName = getLastName.apply(employees.get(1));
        //System.out.println(lasName);

        Function<Employee, String> getFirstName = (Employee employee) ->{
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        Random random1 = new Random();
        for (Employee employee: employees){
            if (random1.nextBoolean()){
                System.out.println(getAName(getFirstName, employee));
            }else{
                System.out.println(getAName(getLastName, employee));
            }
        }
    }
    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
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
