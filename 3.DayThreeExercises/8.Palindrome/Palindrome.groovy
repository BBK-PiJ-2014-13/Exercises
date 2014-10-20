print("Enter a text: ");
String input = System.console().readLine();
boolean isPalindrome = true;

int numberOfIterations = 0;
if (input.length() % 2 == 0) {
	numberOfIterations = input.length() / 2;
} else {
	numberOfIterations = (input.length() - 1) / 2;
}

for (int i = 0; i < numberOfIterations; i++) {
	if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
		isPalindrome = false;
	}
}

if (isPalindrome) {
	println("This is a palindrome");
} else {
	println("This is not a palindrome");
}


