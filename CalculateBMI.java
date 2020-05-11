import java.util.Scanner;

public class CalculateBMI{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double height, weight, bmi;
		System.out.print("Enter your height in inches: ");
		height = in.nextDouble();
		System.out.print("Enter your weight in pounds: ");
		weight = in.nextDouble();

		height = height / 39.37; //will convert to height in meters
		weight = weight / 2.2046; //Will convert weight in kg

		bmi = weight/(height * height); 

		System.out.printf("Your BMI is: %.2f", bmi);
	}
}