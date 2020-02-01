import java.util.Scanner;

public class Application {


	public static void main(String[] args) {
		
		int number1 = 0;
		Scanner digit4 = new Scanner(System.in);
		Encrypter number = new Encrypter();
		
		System.out.println("Enter a 4 digit Number: ");
		number1 = digit4.nextInt();
		number.setName(number1);
			number.Encrypt();
		
System.out.printf("Encrypted Number is %04d%n", number.getNumber());
		
	int number2;
	number2 = number.getNumber();
	Decrypter digit = new Decrypter();
	digit.setName(number2);
		digit.Decrypt();
		
		System.out.printf("Decrypted Number is %d", digit.getNumber());
	
}
}