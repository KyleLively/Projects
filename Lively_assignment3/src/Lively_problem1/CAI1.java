package Lively_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {

	public static int askQ() {
		SecureRandom digit = new SecureRandom();
		int digit_int1 = digit.nextInt(10);
		int digit_int2 = digit.nextInt(10);
		
		System.out.println("How much is " +digit_int1+ " times " +digit_int2+ "?");
		return digit_int1*digit_int2;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int input, answer;
		answer = askQ();
		while(true) {
			input = sc.nextInt();
			if(input == answer) {
				System.out.println("Very good!");
				answer = askQ();
			}
			else {
				System.out.println("No. Please try again");
			}
		}
	}
}
