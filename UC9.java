
public class UC9 {
	
	    final int fullTime = 1;
	    private final int partTime=0;
		private String companyName;
		private int empRatePerHour;
		private int workingDays;
		private int maxHoursPerMonth;	
		private int totalEmpWage;

			public UC9(String companyName, int empRatePerHour, int workingDays, int maxHoursPerMonth) {
				this.companyName=companyName;
				this.empRatePerHour=empRatePerHour;
				this.workingDays=workingDays;
				this.maxHoursPerMonth=maxHoursPerMonth;
				}
	
			public void calculateTotalEmpWage() {
				int empHrs=0;
				int totalDays=0;
				int totalHours=0;
					while(totalDays<workingDays && totalHours<maxHoursPerMonth) {
					totalDays++;
					int empCheck = (int) Math.floor(Math.random() * 3);
				switch (empCheck)
					{
		        case fullTime:
		          	System.out.println("Full time Employee");
		          	empHrs=8;
		        break;
		        case partTime:
		          	System.out.println("Part time Employee");
		          	empHrs=4;
		        break;
		        default:
		          System.out.println("Employee is absent");
		          empHrs=0;
		         }
		         	totalHours += empHrs;
					System.out.println("Day: " +totalDays+ " " + "Emphours : " +empHrs + " Hrs.");
					System.out.println("");
				}
				totalEmpWage = totalHours * empRatePerHour;
				}
			
			public String toString() {
				return "Total Emp Wage for " + companyName + " Company is: $" + totalEmpWage;
			}
			
	public static void main(String[] args) {
		  UC9 google = new UC9("Google", 100 , 20 , 100);
	      UC9 microsoft = new UC9("MicroSoft" , 100 , 20 , 100);
	      google.calculateTotalEmpWage();
	      System.out.println(google);
	      microsoft.calculateTotalEmpWage();
	      System.out.println(microsoft);
	   }
	}

