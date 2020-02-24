package Lively_problem1;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI3 {
	
	public static int askQuestion() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10);
		int digit_int2 = digit.nextInt(10);
		
		
		System.out.println("How much is "+digit_int1+" times "+digit_int2+"?");
		return digit_int1*digit_int2;
	}
	
	public static int Percentage(int Correct) {
		 int percentage = 0;
		percentage = Correct*10;
		
		return percentage;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Correct = 0;
		int input, answer;
		Random rand = new Random();
		for(int i=0; i <= 9; i++) {
			answer = askQuestion();
			input = sc.nextInt();
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
			if(input != answer) {
				Correct--;
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
		if(Percentage(Correct) >= 75) {
			System.out.println("\nCongratulations, you are ready to go to the next level!");
		}
		else
			System.out.println("\nPlease ask your teacher for extra help.");
	}

}
