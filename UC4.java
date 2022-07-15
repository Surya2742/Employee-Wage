
public class UC4 {

	public static void main(String[] args) {
		
	int Full_Time_Hour = 8;
	int Part_Time_Hour = 4;
	int Wage_per_Hour = 20;
	int Emp_Check = (int) Math.floor(Math.random() * 3 );
	
	switch (Emp_Check) {
	
	case 1:
	{
		System.out.println("Employee is Present");
		System.out.println("Working time is " + Full_Time_Hour + " and the salary is " + Full_Time_Hour * Wage_per_Hour);
		break;
	}
	
	case 2:
	{
			System.out.println("Employee is Working Part Time");
			System.out.println("Working time is " + Part_Time_Hour + " and the salary is " + Part_Time_Hour * Wage_per_Hour);
			break;
	}
		
	default:
		System.out.println("Employee is Absent");
		break;
		
	}
	
	}
}
