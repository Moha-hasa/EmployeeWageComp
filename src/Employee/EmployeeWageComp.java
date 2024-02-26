package Employee;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {
		int attendance = 0;
		System.out.println("Welcome to Employee Wage computation");
		Random random = new Random();
		attendance = random.nextInt(9) % 2; 
		if(attendance == 0) {
			System.out.println("Employee is absent");
		}
		else {
			System.out.println("Employee is present");
		}

	}

}
