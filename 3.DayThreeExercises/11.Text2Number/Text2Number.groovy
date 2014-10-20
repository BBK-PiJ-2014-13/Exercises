print("Enter a number in the format xx,xxx.xx: ");
String input = System.console().readLine();

String integerString = "";
String decimalString = "";
int positionOfDot = 0;

for (int i = 0; i < input.length(); i++) {
	if (input.charAt(i) == '.') {
		positionOfDot = i;
		break;
	} else if (input.charAt(i) != ',') {
		integerString += input.charAt(i);
	}
}

for (int i = positionOfDot + 1; i < input.length(); i++) {
	decimalString += input.charAt(i);
}

int integerStringToNumber = Integer.parseInt(integerString);
int decimalStringToNumber = Integer.parseInt(decimalString);

decimalStringToNumber = decimalStringToNumber * 10 / 2;

if (integerStringToNumber % 2 != 0) {
	decimalStringToNumber += 500;
}

integerStringToNumber /= 2;

print(integerStringToNumber);
print(".");
println(decimalStringToNumber);