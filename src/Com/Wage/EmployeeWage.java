package Com.Wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		int empWagePerHour = 20;
		int fullDayHour = 8;
		int halfDayHour = 4;
		int salary = 0;
		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random();
		int empCheck = random.nextInt(3);
		if(empCheck == 1)
		{
			System.out.println("Employee is Present.");
			salary = empWagePerHour * fullDayHour ;
		}
		else if(empCheck == 2)
		{
			System.out.println("Present for Half Day");
			salary = empWagePerHour * halfDayHour ;
		}
		else
		{
			System.out.println("Employee is Absent.");
		}
		System.out.println("random: "+empCheck);
		System.out.println("Salary is: "+salary);
		
	}

}
