
public class UC6 {
	
	public static void main(String[] args) {

	int Wage_per_Hour = 20;
	int Working_Day_In_Month = 20;
	int Max_Working_Hrs = 100;
	
	int monthlyWage = 0;
	int empHrs = 0;
	int totalEmpHrs = 0;
	int total_Working_Days = 0;

	while (totalEmpHrs < Max_Working_Hrs && total_Working_Days < Working_Day_In_Month) {
	    total_Working_Days++;
	    int empCheck = (int)Math.floor(Math.random() * 3);
	    switch(empCheck) {
	    case 2:
	        empHrs = 4;
	        break;
	    case 1:
	        empHrs = 8;
	        break;
	    default:
	        empHrs = 0;
	        break;
	    }
	    totalEmpHrs = totalEmpHrs + empHrs;
	}

	monthlyWage = totalEmpHrs * Wage_per_Hour;
	System.out.println("Total Employee Hours" + totalEmpHrs);
	System.out.println("Total Working Days" + total_Working_Days);
	System.out.println("Employee Monthly Wage = " + monthlyWage);
	
}
}
