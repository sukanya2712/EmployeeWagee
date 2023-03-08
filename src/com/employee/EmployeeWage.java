package com.employee;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAMME");
        System.out.println(" Check whether Employee is present or absent");
        int IS_PRESENT = 1;
        int EMP_WAGE_PER_HOUR = 20;

        int empHrs, empWage;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == IS_PRESENT){
            System.out.println("Employee is Present");
            empHrs = 8;
        }
        else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }
        //calculation
        empWage = empHrs * EMP_WAGE_PER_HOUR;
        System.out.println("Emp Hours : "+empHrs);
        System.out.println("Emp Wage : "+empWage);
    }
}
