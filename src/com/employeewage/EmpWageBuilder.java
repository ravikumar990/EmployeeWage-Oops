package com.employeewage;

//EmpLoyee Wage Builder

public class EmpWageBuilder {
	// constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	// main method
	public static void main(String args[]) {
		computeEmpWage();
	}

	// Wage Computation method
	public static int computeEmpWage() {

		// variables
		int empHours = 0;
		int totalWorkingDay = 0;
		int totalEmpHours = 0;

		while (totalEmpHours <= MAX_HRS_IN_MONTH && totalWorkingDay <= NUM_OF_WORKING_DAYS) {
			totalWorkingDay++;
			// Generate random value to check employee do work full time, part time or
			// absent
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;

			// Condition statement switch case
			switch (empcheck) {
			case IS_FULL_TIME:
				empHours = 8;
				break;
			case IS_PART_TIME:
				empHours = 4;
				break;
			default:
				empHours = 0;
			}

			// calculate hours
			totalEmpHours += empHours;
			System.out.println("Working day : " + totalWorkingDay + " and Employee Hours : " + empHours);
		}

		int totalEmpWage = totalEmpHours * EMP_RATE_PER_HR;
		System.out.println("Monthly Employee Wage is " + totalEmpWage);
		return totalEmpWage;
	}
}