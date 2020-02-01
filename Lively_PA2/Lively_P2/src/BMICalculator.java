import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		int choice;
		float weight;
		float height;
		float BMI;
		Scanner input = new Scanner(System.in);

		System.out.print("Choose a Formula\n");
		System.out.print("1: BMI = (703 * Weight in Pounds / height in inches ^ 2)\n");
		System.out.print("2: BMI = (weight in kilograms / height in meters ^ 2)\n");
		System.out.print("Enter choice 1 or 2: ");
		
		choice = input.nextInt();
		
		
	
		if(choice == 1) {
			System.out.print("Enter your Weight in Pounds: \n");
			weight = input.nextFloat();
			if(weight < 0) {
				System.exit(0);
			}
			System.out.print("Enter your Height in Inches: \n");
			height = input.nextFloat();
			if(height < 0) {
				System.exit(0);
			}
			BMI = (weight * 703 / (height * height));
			System.out.printf("Your BMI is %f\n", BMI);
		}
			
			if(choice == 2) {
			System.out.print("Enter your weight in Kilograms: \n");
			weight = input.nextFloat();		
			if(weight < 0) {
				System.exit(0);
			}
			System.out.print("Enter your Height in Meters: \n");
			height = input.nextFloat();
			if(height < 0) {
				System.exit(0);
			}
			BMI = (weight / (height * height));
			System.out.printf("Your BMI is %f\n", BMI);
		}
			
		}
	}
	



