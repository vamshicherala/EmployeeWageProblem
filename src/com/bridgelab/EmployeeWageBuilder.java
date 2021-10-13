package com.bridgelab;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int IS_PRESENT = 1;
    public static void main(String[] args) {
        System.out.println("**Welcome to Employee Wage Computation Program On Master Branch**");
        Random rand = new Random();
        int empcheck = (int) (rand.nextFloat()*10)%2;
        if (empcheck == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

    }
}
