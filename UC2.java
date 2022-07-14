
public class UC2 {

	public static void main(String[] args) {
	int Full_Time_Working = 1;
	int Full_Time_Hour = 8;
	int Wage_per_Hour = 20;
	double Emp_Check = Math.floor(Math.random() * 2 );
	if (Emp_Check == Full_Time_Working) {
		System.out.println("Employee is Present");
		System.out.println("Working time is " + Full_Time_Hour + " and the salary is " + Full_Time_Hour * Wage_per_Hour);
	}
	else
		System.out.println("Employee is Absent");

	}
}
