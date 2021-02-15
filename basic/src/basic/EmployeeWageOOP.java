package basic;

public class EmployeeWageOOP {

	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;

	private final String company;
	private final int employeeRatePerHour;
	private final int numberOfWorkingDays;
	private final int maxHoursPerMonth;

	public EmployeeWageOOP(String company, int empRate, int numOfDays, int maxHrs) {
		this.company = company;
		this.employeeRatePerHour = empRate;
		this.numberOfWorkingDays = numOfDays;
		this.maxHoursPerMonth = maxHrs;
	}

	public static void main(String[] args) {
		EmployeeWageOOP dmart = new EmployeeWageOOP("DMart", 20, 2, 10);

		int empHrs = 0, empWage = 0, totalWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;

		while (totalEmpHrs <= dmart.maxHoursPerMonth && totalWorkingDays < dmart.numberOfWorkingDays) {

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
			totalWage = totalEmpHrs * dmart.employeeRatePerHour;
			System.out.println("Total Emp Wage for company - " + dmart.company + " : " + totalWage);
		}
	}

}