package basic;

class Company {

	private final String company;
	private final int employeeRatePerHour;
	private final int numberOfWorkingDays;
	private final int maxHoursPerMonth;

	public Company(String company, int empRate, int numOfDays, int maxHrs) {
		this.company = company;
		this.employeeRatePerHour = empRate;
		this.numberOfWorkingDays = numOfDays;
		this.maxHoursPerMonth = maxHrs;
	}
}

public class EmployeWageDS {

	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;

	private int numOfCompany = 0;
	private Company[] companyArray;

	public EmployeWageDS() {
		companyArray = new Company[5];
	}

	private void addCompany(String company, int empRate, int numOfDays, int maxHrs) {
		companyArray[numOfCompany] = new Company(company, empRate, numOfDays, maxHrs);
		numOfCompany++;
	}

	public static int wage(String company, int empRate, int numOfDays, int maxHrs) {
		int empHrs = 0, empWage = 0, totalWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		while (totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays) {
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
			System.out.println("Days : " + totalWorkingDays + "  Emp hrs: " + empHrs);

			totalEmpHrs += empHrs;
			totalWage = totalEmpHrs * empRate;
			System.out.println("Total Emp Wage for company - " + company + " : " + totalWage);

		}
		return totalWage;

	}

	public static void main(String[] args) {

		EmployeWageDS obj = new EmployeWageDS();
		obj.addCompany("DMart", 20, 2, 4);
		obj.addCompany("Star", 10, 2, 2);

	}

}
