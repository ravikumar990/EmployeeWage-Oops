package com.employeewage;

//EmpLoyee Wage Builder

public class EmpWageBuilder {

	public static void main(String args[]) {

		// constant
		int is_full_time = 1;

		// Generate random value to check employee present or absent
		double empcheck = Math.floor(Math.random() * 10) % 2;

		// Condition statement
		if (is_full_time == empcheck)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
