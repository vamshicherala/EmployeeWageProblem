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
        if (empcheck == IS_PRESENT) {
            System.out.println("Employee is Present");
            calcEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        } else if (empcheck == IS_PARTTIME) {
            System.out.println("Employee is Parttime");
            calcEmpWage = WAGE_PER_HOUR * PART_DAY_HOUR;
        }else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Employee Wage :"+calcEmpWage);
    }
}
