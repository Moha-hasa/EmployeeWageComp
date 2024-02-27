package Employee;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {
		int attendance;
		int dailywage = 0;
		int total_wage = 0;
		int total_working_hr = 0;
		int total_working_days = 1;
		int employee_type;
		final int WAGE_PER_HR = 20; 
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WORKING_DAYS = 20;
		
		System.out.println("Welcome to Employee Wage computation program");
		
		for(int i=0; i<=WORKING_DAYS; i++) {
			System.out.println("Day="+i);
			Random random = new Random();
			attendance = random.nextInt(9) % 2; 
		
		
				switch(attendance) {
				case 0:
					System.out.println("Employee is absent");
					break;
			
				case 1:
					System.out.println("Employee is present");
					employee_type = random.nextInt(9) % 2;
			
			
				switch(employee_type) {
				case 0:
					System.out.println("Employee is part time");
					dailywage = WAGE_PER_HR * PART_TIME_HR;
				break;
				
				case 1:
					System.out.println("Employee is full time");
					dailywage = WAGE_PER_HR * FULL_TIME_HR;
				break;
			}
				total_wage += dailywage;
				System.out.println("Employee wage = "+dailywage);
				break;
			}
		
				System.out.println("*********************");
		}		
		
			System.out.println("Total monthly wage="+total_wage);
	}
	

}
