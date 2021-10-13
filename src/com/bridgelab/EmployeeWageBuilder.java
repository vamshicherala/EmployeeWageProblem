package com.bridgelab;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int IS_PRESENT = 1;
    public static final int IS_PARTTIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_DAY_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("**Welcome to Employee Wage Computation Program On Master Branch**");
        Random rand = new Random();
        int empcheck = (int) (rand.nextFloat()*10)%3;
        int calcEmpWage = 0;
        int empHrs = 0;
        switch (empcheck){
            case IS_PRESENT :
                empHrs = FULL_DAY_HOUR;
                System.out.println("Employee Fulltime");
                break;
            case IS_PARTTIME:
                empHrs = PART_DAY_HOUR;
                System.out.println("Employee Parttime");
                break;
            default:
                empHrs = 0;
                System.out.println("Employe is Absent");
        }
        calcEmpWage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee Wage :"+calcEmpWage);
            }
}
