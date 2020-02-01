import java.io.PrintStream;

public class Encrypter {
	
	public void setName(int number1) {
		this.number1 = (int) number1;
		
	}
	
	public int number1; {}
	
	public int number2;
	

	public int getNumber() {
		return number1;

	}

	public void Encrypt() {
	int a;
	int b;
	int c;
	int d;
		
		
		a = number1 / 1000;
		b = (number1 % 1000) / 100;
		c = (number1 % 1000) / 10;
		d = number1 % 10;
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
	
		
		
		number1 = (c * 1000 + d * 100 + a * 10 + b);
		
	}
		
}
