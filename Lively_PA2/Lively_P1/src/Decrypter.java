
public class Decrypter {

	public void setName(int digit) {
		this.digit = (int) digit;
		
	}
	
	public int digit;{
	}
	
	public int getNumber(){
		return digit;
	}

	
	public void Decrypt() {
		int a, b, c, d;
		
		a = digit/1000;
		b = (digit%1000) / 100;
		c =(digit%100) / 10;
		d = digit%10;
			
		a = (a +3) % 10;
		b = (b+3)%10;
		c = (c+3)%10;
		d = (d+3)%10;
		
		digit = (c * 1000 + d *100 + a * 10 + b);
	}
}
