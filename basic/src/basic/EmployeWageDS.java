package basic;

public class EmployeWageDS {

	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;

	private final String company;
	private final int employeeRatePerHour;
	private final int numberOfWorkingDays;
	private final int maxHoursPerMonth;

	public EmployeWageDS(String company, int empRate, int numOfDays, int maxHrs) {
		this.company = company;
		this.employeeRatePerHour = empRate;
		this.numberOfWorkingDays = numOfDays;
		this.maxHoursPerMonth = maxHrs;
	}

	public static void main(String[] args) {
		EmployeeWageOOP dmart = new EmployeeWageOOP("DMart", 20, 2, 10);
		dmart.calclulateWage();
		EmployeeWageOOP relaince = new EmployeeWageOOP("Relaince", 15, 3, 20);
		relaince.calclulateWage();
	}

	public void calclulateWage() {
		int empHrs = 0, empWage = 0, totalWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numberOfWorkingDays) {

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case FULL_TIME:
				empHrs = 8;
				break;

			case PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;

			}
			totalWorkingDays++;
			totalEmpHrs += empHrs;
			System.out.println("Days : " + totalWorkingDays + "  Emp hrs: " + empHrs);
			totalWage = totalEmpHrs * employeeRatePerHour;
			System.out.println("Total Emp Wage for company - " + company + " : " + totalWage);
		}
	}

}
