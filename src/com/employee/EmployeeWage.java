package com.employee;

public class EmployeeWage {

    public static void wagesofEmployees(String company, int wageperhour, int maxworkingDays, int maxworkingHrs){
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        System.out.println("COMPANY name                             :" + company);
        System.out.println("WAGE per hour                            :" + wageperhour);
        System.out.println("MAXWORKDAYS maximum working days         :" + maxworkingDays);
        System.out.println("MAXIMUMWORKHRS maximum working hours     :" + maxworkingHrs);

        int empHrs=0, empWagePerMonth = 0, totalWorkingDays=0, totalEmpHours = 0;

        while(totalEmpHours <= maxworkingHrs && totalWorkingDays < maxworkingDays) {

            totalWorkingDays ++;
            int empType = (int)Math.floor(Math.random() * 10) % 3;

            switch (empType) {
                case IS_FULL_TIME -> {
                    empHrs = 8;

                }
                case IS_PART_TIME -> {
                    empHrs = 4;
                }
                default -> {
                    empHrs = 0;
                }
            }

            totalEmpHours += empHrs;
            int empWagePerDay = empHrs * wageperhour ;
            empWagePerMonth += empWagePerDay;

        }

        System.out.println("TOTALEMPHRS total emp hours              :" + totalEmpHours);
        System.out.println("WAGEPERMONTH emp Wage Per Month          :" + empWagePerMonth);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation program");
        wagesofEmployees("BCG",20,24 ,100);
        wagesofEmployees("MCKINESY",30,20,100);
        wagesofEmployees("E&Y",40,20 , 100);
    }
}