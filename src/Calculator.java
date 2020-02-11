import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		double feet;
		double inches;
		double pounds;
		
		double totalInches;
		double meters;
		double kilograms;
		double BMI;
		
		String weightStatus = "";
		
	
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please print your height in feet");
		feet = in.nextDouble();
		
		System.out.println("Please print your height in inches");
		inches = in.nextDouble();
		
		System.out.println("Please print your weight in pounds");
		pounds = in.nextDouble();
		
		totalInches = 12 * feet + inches;
		
		meters = totalInches / 39.37;
		
		kilograms = pounds / 2.205;
		
		BMI = kilograms / Math.pow(meters, 2);
		
		if (BMI < 19.0) 
		{
			weightStatus = "Underweight";
		}
		
		else if (BMI < 25.0) 
		{
			
		}
			
		
		
		
		System.out.println("Your BMI is " + BMI);
		
		System.out.println("Your weight status is " + weightStatus);
		
		
	
		
		
		
		
		
		
		

	}

}
