print("Enter a text: ");
String input = System.console().readLine();

print(input);

for (int i = input.length() - 1; i >= 0; i--) {
	print(input.charAt(i));
}