
public class UC5 {

	public static void main(String[] args) {
	int Full_Time_Hour = 8;
	int Part_Time_Hour = 4;
	int Absent_Hour = 0;
	int Wage_per_Hour = 20;
	int Working_Day_In_Month = 20;
	int Emp_Check = (int) Math.floor(Math.random() * 3 );
	
	switch (Emp_Check) {
	
	case 1:
	{
		System.out.println("Employee is Present");
		System.out.println("Working time is " + Full_Time_Hour + " and the salary is " + Full_Time_Hour * Wage_per_Hour);
		System.out.println("Monthly Wage of Employee is " + Full_Time_Hour * Wage_per_Hour * Working_Day_In_Month);
		break;
		}
	case 2:
	{
			System.out.println("Employee is Working Part Time");
			System.out.println("Working time is " + Part_Time_Hour + " and the salary is " + Part_Time_Hour * Wage_per_Hour);
			System.out.println("Monthly Wage of Employee is " + Part_Time_Hour * Wage_per_Hour * Working_Day_In_Month);
			break;
		}
		
	default:
		System.out.println("Employee is Absent");
		System.out.println("Employee worked for " + Absent_Hour + " Hours and the salary is " + Absent_Hour * Wage_per_Hour);
		System.out.println("Monthly Wage of Employee is " + Absent_Hour * Wage_per_Hour * Working_Day_In_Month);
		break;
		
	}
	
	}
}
