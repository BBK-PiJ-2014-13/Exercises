print("Type in the first number: ");
double number1 = Double.parseDouble(System.console().readLine());
print("Type in the second number: ");
double number2 = Double.parseDouble(System.console().readLine());
println("You can use one of these operators: ");
println(">> +");
println(">> -");
println(">> *");
println(">> /");
print("Choose an operator: ");
String operatorString = System.console().readLine();
String operatorChar = operatorString.charAt(0);

switch (operatorChar) {
	case '+':
		println(number1 + number2);
		break;
	case '-':
		println(number1 - number2);
		break;
	case '*':
		println(number1 * number2);
		break;
	case '/':
		println(number1 / number2);
		break;
	default:
		println("Wrong input");
}