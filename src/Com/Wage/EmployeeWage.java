package Com.Wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("welcome to emplyee wage");
		Random r = new Random();
		int random = r.nextInt(2);
		if(random == 1)
		{
			System.out.println("present");
			
		}
		else {
			System.out.println("absent");
		}
			
		
		
	}

}
