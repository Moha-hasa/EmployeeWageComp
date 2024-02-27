package Employee;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {
		int attendance;
		int dailywage;
		int employee_type;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8; 
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		
		System.out.println("Welcome to Employee Wage computation");
		Random random = new Random();
		attendance = random.nextInt(9) % 2; 
		if(attendance == 0) {
			System.out.println("Employee is absent");
		}
		else {
			System.out.println("Employee is present");
				employee_type = random.nextInt(9) % 2;
			
			if(employee_type == 0){
				
				System.out.println("Employee is part time");
				dailywage = WAGE_PER_HR * PART_TIME_HR;
				
			}
			else {
				System.out.println("Employee is full time");
				dailywage = WAGE_PER_HR * FULL_DAY_HR;
			}
			
			System.out.println("Employee wage = "+dailywage);
		}

	}

}
