package Employee;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {
		int attendance;
		int dailywage = 0;
		int employee_type;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8; 
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		
		System.out.println("Welcome to Employee Wage computation program");
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
					dailywage = WAGE_PER_HR * FULL_DAY_HR;
				break;
			}
			
			System.out.println("Employee wage = "+dailywage);
			break;
		}

	}

}
