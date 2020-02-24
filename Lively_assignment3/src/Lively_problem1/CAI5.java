package Lively_problem1;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI5 {
	
	public static int askQuestion1() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10);
		int digit_int2 = digit.nextInt(10);
		
		
		System.out.println("How much is "+digit_int1+" times "+digit_int2+"?");
		return digit_int1*digit_int2;
	}
	
	public static int askQuestion1add() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10);
		int digit_int2 = digit.nextInt(10);
		
		
		System.out.println("How much is "+digit_int1+" plus "+digit_int2+"?");
		return digit_int1+digit_int2;
	}
	
	public static int askQuestion2add() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(100);
		int digit_int2 = digit.nextInt(100);
		
		
		System.out.println("How much is "+digit_int1+" plus "+digit_int2+"?");
		return digit_int1+digit_int2;
	}
	
	public static int askQuestion3add() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(1000);
		int digit_int2 = digit.nextInt(1000);
		
		
		System.out.println("How much is "+digit_int1+" plus "+digit_int2+"?");
		return digit_int1+digit_int2;
	}
	
	public static int askQuestion4add() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10000);
		int digit_int2 = digit.nextInt(10000);
		
		
		System.out.println("How much is "+digit_int1+" plus "+digit_int2+"?");
		return digit_int1+digit_int2;
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
	
	public static int askQuestion1sub() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10);
		int digit_int2 = digit.nextInt(10);
		
		
		System.out.println("How much is "+digit_int1+" minus "+digit_int2+"?");
		return digit_int1-digit_int2;
	}
	
	public static int askQuestion2sub() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(100);
		int digit_int2 = digit.nextInt(100);
		
		
		System.out.println("How much is "+digit_int1+" minus "+digit_int2+"?");
		return digit_int1-digit_int2;
	}
	
	public static int askQuestion3sub() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(1000);
		int digit_int2 = digit.nextInt(1000);
		
		
		System.out.println("How much is "+digit_int1+" minus "+digit_int2+"?");
		return digit_int1-digit_int2;
	}
	
	public static int askQuestion4sub() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10000);
		int digit_int2 = digit.nextInt(10000);
		
		
		System.out.println("How much is "+digit_int1+" minus "+digit_int2+"?");
		return digit_int1-digit_int2;
	}
	
	public static int askQuestion1div() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10);
		int digit_int2 = digit.nextInt(10);
		
		
		System.out.println("How much is "+digit_int1+" divided by "+digit_int2+"?");
		return digit_int1/digit_int2;
	}
	
	public static int askQuestion2div() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(100);
		int digit_int2 = digit.nextInt(100);
		
		
		System.out.println("How much is "+digit_int1+" divided by "+digit_int2+"?");
		return digit_int1/digit_int2;
	}
	
	public static int askQuestion3div() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(1000);
		int digit_int2 = digit.nextInt(1000);
		
		
		System.out.println("How much is "+digit_int1+" divided by "+digit_int2+"?");
		return digit_int1/digit_int2;
	}
	
	public static int askQuestion4div() {
		SecureRandom digit = new SecureRandom();
		
		int digit_int1 = digit.nextInt(10000);
		int digit_int2 = digit.nextInt(10000);
		
		
		System.out.println("How much is "+digit_int1+" divided by "+digit_int2+"?");
		return digit_int1/digit_int2;
	}
	
	public static int Percentage(int Correct) {
		 int percentage = 0;
		percentage = Correct * 10;
		
		return percentage;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Correct = 0;
		int choice = 0, choice2 = 0, choice3 = 0;
		int input = 0, answer = 0;
		while(choice2 != 2) {
		System.out.println("Enter difficulty level: ");
		choice = sc.nextInt();
		System.out.println("Enter problem type: (1) = addition, (2) = multiplication, (3) = subtraction, (4) = division, (5) = mix");
		choice3 = sc.nextInt();
		Random rand = new Random();
		for(int i = 0; i <= 9; i++) {
	if(choice3 == 1) {
			if(choice == 1) {
				answer = askQuestion1add();
				input = sc.nextInt();
			}
			if(choice == 2) {
				answer = askQuestion2add();
				input = sc.nextInt();
		}
			if(choice == 3) {
				answer = askQuestion3add();
				input = sc.nextInt();
			}
			if(choice == 4) {
				answer = askQuestion3add();
				input = sc.nextInt();
			}
		}

	if(choice3 == 2) {
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
		}

	if(choice3 == 3) {
		if(choice == 1) {
			answer = askQuestion1sub();
			input = sc.nextInt();
		}
		if(choice == 2) {
			answer = askQuestion2sub();
			input = sc.nextInt();
		}
		if(choice == 3) {
			answer = askQuestion3sub();
			input = sc.nextInt();
		}
		if(choice == 4) {
			answer = askQuestion4sub();
			input = sc.nextInt();
		}
	}
	if(choice3 == 4) {
		if(choice == 1) {
			answer = askQuestion1div();
			input = sc.nextInt();
		}
		if(choice == 2) {
			answer = askQuestion2div();
			input = sc.nextInt();
		}
		if(choice == 3) {
			answer = askQuestion3div();
			input = sc.nextInt();
		}
		if(choice == 4) {
			answer = askQuestion4div();
			input = sc.nextInt();
		}
	}
	if(choice3 == 5) {
		int rand_int1 = rand.nextInt(4) + 1;
		if(choice == 1) {
		switch(rand_int1) {
			case 1:
				answer = askQuestion1();
				input = sc.nextInt();	
			case 2:
				answer = askQuestion1add();
				input = sc.nextInt();
			case 3:
				answer = askQuestion1div();
				input = sc.nextInt();
			case 4:
				answer = askQuestion1sub();
				input = sc.nextInt();
			}
		}
		if(choice == 2) {
			switch(rand_int1) {
			case 1:
				answer = askQuestion2();
				input = sc.nextInt();
			case 2:
				answer = askQuestion2add();
				input = sc.nextInt();
			case 3:
				answer = askQuestion2div();
				input = sc.nextInt();
			case 4:
				answer = askQuestion2sub();
				input = sc.nextInt();
			}
		}
		if(choice == 3) {
			switch(rand_int1) {
			case 1:
				answer = askQuestion3();
				input = sc.nextInt();
			case 2:
				answer = askQuestion3add();
				input = sc.nextInt();
			case 3:
				answer = askQuestion3div();
				input = sc.nextInt();
			case 4:
				answer = askQuestion3sub();
				input = sc.nextInt();
			}
		}
		if(choice == 4) {
			switch(rand_int1) {
			case 1:
				answer = askQuestion4();
				input = sc.nextInt();
			case 2:
				answer = askQuestion4add();
				input = sc.nextInt();
			case 3:
				answer = askQuestion4div();
				input = sc.nextInt();
			case 4:
				answer = askQuestion4sub();
				input = sc.nextInt();
			}
		}
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



