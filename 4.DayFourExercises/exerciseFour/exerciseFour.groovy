print("Enter a binary number: ");
String string = System.console().readLine();

println(binary2decimal(string));

int binary2decimal(String s) {
String numberBackwards = "";
for (int i = s.length() - 1; i >= 0; i--) { // creates a new string with numbers backwards
	numberBackwards += s.charAt(i);
}

int output = 0;
	for(int i = 0; i < s.length(); i++) {
		if (numberBackwards.charAt(i) == '1') {
			output += 2 ** i;
		}
	}
	return output;
}

/*
decimal2binary(int i) {
	int output = 0;
	
}
*/