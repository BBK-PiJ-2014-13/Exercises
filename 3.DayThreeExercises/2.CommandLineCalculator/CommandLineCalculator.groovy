print("Enter the operation. Only use integers and operations +, -, *, /: ");
String operationString = System.console().readLine();

String inputStringOne = "";
String inputStringTwo = "";
double inputIntegerOne = 0;
double inputIntegerTwo = 0;
char sign = ' ';
double answer = 0;

String currentNumber = "One"; // Either One or Two
for (int i = 0; i < operationString.length(); i++ ) {
	if (operationString.charAt(i) == '+' || operationString.charAt(i) == '-' || operationString.charAt(i) == '*' || operationString.charAt(i) == '/') {
		sign = operationString.charAt(i);
		currentNumber = "Two";
	}	else if (operationString.charAt(i) != " ") {
			if (currentNumber == "One") {
				inputStringOne += operationString.charAt(i);
			} else {
				inputStringTwo += operationString.charAt(i);
			}
		}
}

inputIntegerOne = Integer.parseInt(inputStringOne);
inputIntegerTwo = Integer.parseInt(inputStringTwo);

switch (sign) {
	case '+':
		answer = inputIntegerOne + inputIntegerTwo;
		break;
	case '-':
		answer = inputIntegerOne - inputIntegerTwo;
		break;
	case '*':
		answer = inputIntegerOne * inputIntegerTwo;
		break;
	case '/':
		answer = inputIntegerOne / inputIntegerTwo;
		break;
}

println(answer);

