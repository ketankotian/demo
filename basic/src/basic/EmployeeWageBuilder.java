package basic;

import java.util.Random;

public class EmployeeWageBuilder {
	public static void main(String[] args) {

		Random r = new Random();
		int result = r.nextInt(3);
		present(result);
	}

	static void present(int result) {
		int wagePerHour = 20, fullHour = 8, dailyWage = 0, monthyDays = 20, monthlyWage = 0;

		switch (result) {

		case 0:
			System.out.println("Employee is Absent ");
			System.out.println("Daily Wage : " + dailyWage);
			System.out.println("Monthly Wage : " + monthlyWage);
			break;

		case 1:
			dailyWage = wagePerHour * fullHour;
			monthlyWage = dailyWage * monthyDays;
			System.out.println("Part Time Employee is Present ");
			System.out.println("Daily Wage : " + dailyWage);
			if (wagePerHour * 20 >= 100 && monthyDays == 20) {
				System.out.println("Monthly Wage : " + monthlyWage);
			}
			break;

		case 2:
			dailyWage = wagePerHour * fullHour;
			monthlyWage = dailyWage * monthyDays;
			System.out.println("Full Time Employee is Present ");
			System.out.println("Daily Wage : " + dailyWage);
			if (wagePerHour * 20 >= 100 && monthyDays == 20) {
				System.out.println("Monthly Wage : " + monthlyWage);
			}
			break;
		}

	}

}
