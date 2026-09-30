package com.cs.lab1;


public class EmployeeCalculator {

  
    static int employeeCount = 0;

  
    static double calculateAverageSalary(double[] salaries) {

        if (salaries.length == 0) {
            return 0;
        }

        double total = 0;

        for (int i = 0; i < salaries.length; i++) {
            total += salaries[i];
        }

       
        return total / salaries.length;
    }

    
    static void displaySalaries(double[] salaries) {
        System.out.println("Employee Salaries:");

        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }
    }

  
    static void countEmployees(double[] salaries) {
        for (int i = 0; i < salaries.length; i++) {
            employeeCount++;
        }
    }

  
    static double calculateBonus(double salary) {
       
        return calculateBonus(salary, 10);
    }

 
    static double calculateBonus(double salary, double percentage) {
    
        return salary * percentage / 100;
    }

  
    public static void main(String[] args) {

        double[] salaries = {
            55000,
            62000,
            71000,
            48000,
            85000
        };

        displaySalaries(salaries);

        countEmployees(salaries);

        double average = calculateAverageSalary(salaries);
        System.out.println();
        System.out.println("Average Salary: " + average);

        
        System.out.println();
        System.out.println("10% Bonus: " + calculateBonus(salaries[0]));

        
        System.out.println();
        System.out.println("15% Bonus: " + calculateBonus(salaries[1], 15));

        System.out.println();
        System.out.println("Total Employees: " + employeeCount);
    }
}