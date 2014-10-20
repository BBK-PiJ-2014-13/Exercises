
public class Calculator {
	
	void add(int i1, int i2) {
		System.out.println(i1 + i2);
	}
	
	void subtract(int i1, int i2) {
		System.out.println(i1 - i2);
	}
	
	void multiply(int i1, int i2) {
		System.out.println(i1 * i2);
	}
	
	void divide(int i1, int i2) {
		double a1 = (double)i1;
		double a2 = (double)i2;
		System.out.println(a1 / a2);
	}
	
	void modulus(int i1, int i2) {
		System.out.println(i1 % i2);
	}
}
