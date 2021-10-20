package com.employeewage;

//EmpLoyee Wage Builder

public class EmpWageBuilder {

	public static void main(String args[]) {

		// constant
		int is_full_time = 1;
		int empRatePerHr = 20;

		int empHours = 0;
		int empWage = 0;

		// Generate random value to check employee present or absent
		double empcheck = Math.floor(Math.random() * 10) % 2;

		// Condition statement
		if (is_full_time == empcheck)
			empHours = 8;
		else
			empHours = 0;

		// Calculat employee wage
		empWage = empHours * empRatePerHr;
		System.out.println("Employee Wage : " + empWage);
	}
}