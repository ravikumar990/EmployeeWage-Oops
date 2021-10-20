package com.employeewage;

//EmpLoyee Wage Builder
public class EmpWageBuilder {

	public static void main(String args[]) {

		// constant
		int is_full_time = 1;
		int is_part_time = 2;
		int empRatePerHr = 20;

		// variables
		int empHours = 0;
		int empWage = 0;

		// Generate random value to check employee do work full time, part time or
		// absent
		double empcheck = Math.floor(Math.random() * 10) % 3;

		// Condition statement
		if (is_full_time == empcheck)
			empHours = 8;
		else if (is_part_time == empcheck)
			empHours = 4;
		else
			empHours = 0;

		// Calculat employee wage
		empWage = empHours * empRatePerHr;
		System.out.println("Employee Wage : " + empWage);
	}
}