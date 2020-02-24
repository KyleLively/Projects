package Lively_problem1;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI2 {
	
	public static int askQuestion() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10);
		int digit_int2 = digit.nextInt(10);
		
		
		System.out.println("How much is "+digit_int1+" times "+digit_int2+"?");
		return digit_int1*digit_int2;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, answer;
		answer = askQuestion();
		while(true) {
			input = sc.nextInt();
			Random rand = new Random();
			int rand_int = rand.nextInt(4)+1;
			if(input == answer) {
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
			if(input != answer)
				switch(rand_int) {
				case 1:
					System.out.println("No. Please try again.");
				case 2:
					System.out.println("Wrong. Try once more.");
				case 3:
					System.out.println("Don't give up!");
				case 4:
					System.out.println("No. Keep trying!");
				}
		}
	}

}
