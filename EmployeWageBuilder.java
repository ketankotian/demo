	public class EmployeWageBuilder {

        public static final int fullTime=1;
        public static final int partTime=2;
        public static final int ratePerHour=20;
	public static final int workingDays=20;
	public static final int maxHrs=100;

	public static void main(String[] args) {
	int empHrs=0, empWage=0, totalWage=0, totalWorkingDays=0, totalEmpHrs=0;

	while(totalEmpHrs<=maxHrs && totalWorkingDays < workingDays){
	int empCheck=(int) Math.floor(Math.random() * 10 ) % 3 ;

	switch (empCheck) {
	case fullTime :
		empHrs=8;
 	break;

	case partTime :
		empHrs=4;
 	break;
	default :
		empHrs=0;
 	break;
}
	 totalEmpHrs +=empHrs;
	 empWage=empHrs*ratePerHour;
	 totalWage +=empWage;
  	 System.out.println("Employee wage : "+empWage);
}
         System.out.println("Total Employee wage : "+totalWage);

	}

}
