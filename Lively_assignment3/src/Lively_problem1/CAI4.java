package Lively_problem1;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI4 {
	
	public static int askQuestion1() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10);
		int digit_int2 = digit.nextInt(10);
		
		
		System.out.println("How much is "+digit_int1+" times "+digit_int2+"?");
		return digit_int1*digit_int2;
	}
	
	public static int askQuestion2() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(100);
		int digit_int2 = digit.nextInt(100);
		
		
		System.out.println("How much is "+digit_int1+" times "+digit_int2+"?");
		return digit_int1*digit_int2;
	}
	
	public static int askQuestion3() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(1000);
		int digit_int2 = digit.nextInt(1000);
		
		
		System.out.println("How much is "+digit_int1+" times "+digit_int2+"?");
		return digit_int1*digit_int2;
	}
	
	public static int askQuestion4() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10000);
		int digit_int2 = digit.nextInt(10000);
		
		
		System.out.println("How much is "+digit_int1+" times "+digit_int2+"?");
		return digit_int1*digit_int2;
	}
	
	public static int Percentage(int Correct) {
		 int percentage = 0;
		percentage = Correct * 10;
		
		return percentage;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Correct = 0;
		int choice = 0, choice2 = 0;
		int input = 0, answer = 0;
		while(choice2 != 2) {
		System.out.println("Enter difficulty level: ");
		choice = sc.nextInt();
		Random rand = new Random();
		for(int i=0; i <= 9; i++) {
			if(choice == 1) {
			answer = askQuestion1();
			input = sc.nextInt();
			}
			if(choice == 2) {
			answer = askQuestion2();
			input = sc.nextInt();
			}
			if(choice == 3) {
				answer = askQuestion3();
				input = sc.nextInt();
			}
			if(choice == 4) {
				answer = askQuestion4();
				input = sc.nextInt();
			}
			
			int rand_int = rand.nextInt(4)+1;
			if(input == answer) {
				Correct += 1;
				switch(rand_int) {
				case 1:
					System.out.println("Very good!");
					break;
				case 2:
					System.out.println("Excellent!");
					break;
				case 3:
					System.out.println("Nice Work!");
					break;
				case 4:
					System.out.println("Keep up the good work!");
					break;
				}
			}
			else {
				switch(rand_int) {
				case 1:
					System.out.println("No. Please try again.");
					break;
				case 2:
					System.out.println("Wrong. Try once more.");
					break;
				case 3:
					System.out.println("Don't give up!");
					break;
				case 4:
					System.out.println("No. Keep trying!");
					break;
				}	
		}
		}
		System.out.printf("\nPercentage correct: %d", Percentage(Correct));
		if(Correct >= 7) {
			System.out.println("\nCongratulations, you are ready to go to the next level!");
		}
		else {
			System.out.println("\nPlease ask your teacher for extra help.");
	}
		System.out.println("Would you like to restart with a new problem set?");
		System.out.println("(1) = yes/ (2) = exit");
		choice2 = sc.nextInt();
	}
	}

}
