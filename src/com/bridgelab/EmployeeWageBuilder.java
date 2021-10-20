package com.bridgelab;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int IS_PRESENT = 1;
    public static final int IS_PARTTIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_DAY_HOUR = 4;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("**Welcome to Employee Wage Computation Program On Master Branch**");
        employeeWage();
    }
    static void employeeWage(){
        int calcEmpWage = 0;
        int empHrs = 0;
        int totalEmpHours = 0,totalWorkingDays = 0,totalEmpWage = 0;
        Random rand = new Random();
        while (totalEmpHours<=MAX_WORKING_HOURS && totalWorkingDays < NO_OF_WORKING_DAYS){
            totalWorkingDays++;
            int empcheck = (int) (rand.nextFloat() * 10) % 3;
            switch (empcheck) {
                case IS_PRESENT:
                    empHrs = FULL_DAY_HOUR;
                    break;
                case IS_PARTTIME:
                    empHrs = PART_DAY_HOUR;
                    break;
                default:
                    empHrs = 0;
            }
            calcEmpWage = empHrs * WAGE_PER_HOUR;
            totalEmpWage = totalEmpWage + calcEmpWage;
            totalEmpHours = totalEmpHours + empHrs;
            System.out.println("days:"+totalWorkingDays+"hours:"+totalEmpHours);
        }
            System.out.println("Employee Wage :" + totalEmpWage);

    }
}
