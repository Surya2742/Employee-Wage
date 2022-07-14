
public class UC3 {

	public static void main(String[] args) {
	int Full_Time_Working = 1;
	int Full_Time_Hour = 8;
	int IS_PART_TIME = 2;
	int Part_Time_Hour = 4;
	int Wage_per_Hour = 20;
	double Emp_Check = Math.floor(Math.random() * 3 );
	if (Emp_Check == Full_Time_Working) {
		System.out.println("Employee is Present");
		System.out.println("Working time is " + Full_Time_Hour + " and the salary is " + Full_Time_Hour * Wage_per_Hour);
	}
	else if (Emp_Check == IS_PART_TIME) {
		System.out.println("Employee is Working Part Time");
		System.out.println("Working time is " + Part_Time_Hour + " and the salary is " + Part_Time_Hour * Wage_per_Hour);
	}
	else
		System.out.println("Employee is Absent");

	}

}
