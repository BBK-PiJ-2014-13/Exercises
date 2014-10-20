import java.io.Console;


public class StartingClass {

	public static void main(String[] args) {
				
		Console console = System.console();
		Calculator calculator = new Calculator();
		
		System.out.print("Type in the first number: ");
		int number1 = Integer.parseInt(console.readLine());
		System.out.print("Type in the second number: ");
		int number2 = Integer.parseInt(console.readLine());
		System.out.println("You can use one of these operators: ");
		System.out.println(">> +");
		System.out.println(">> -");
		System.out.println(">> *");
		System.out.println(">> /");
		System.out.println(">> %");
		System.out.print("Choose an operator: ");
		char operator = console.readLine().charAt(0);

		switch (operator) {
			case '+':
				calculator.add(number1, number2);
				break;
			case '-':
				calculator.subtract(number1, number2);
				break;
			case '*':
				calculator.multiply(number1, number2);
				break;
			case '/':
				calculator.divide(number1, number2);
				break;
			case '%':
				calculator.modulus(number1, number2);
			default:
				System.out.println("Wrong input");
		}
	}

}
