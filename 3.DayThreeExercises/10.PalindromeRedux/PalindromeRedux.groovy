print("Enter a text: ");
String input = System.console().readLine();
String string1 = "";
String string2 = "";

for (int i = 0; i < input.length(); i++) {
	if (input.charAt(i).isLetter()) {
		string1 += input.charAt(i).toLowerCase();
	}
}

for (int i = string1.length() - 1; i >= 0; i--) {
	string2 += string1.charAt(i);
}

if (string1 == string2) {
	println("This is a relaxed palindrome");
} else {
	println("This is not a relaxed palindrome");
}