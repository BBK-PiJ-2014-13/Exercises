print("Enter a text: ");
String inputText = System.console().readLine();


String inputCharString = "";
String usedLetters = "";
char inputChar = ' ';
int numberOfLetters = 0;
boolean keepAsking = true;

while (keepAsking) {
	print("Which letter would you like to count now?: ");
	inputCharString = System.console().readLine();
	inputChar = inputCharString.charAt(0);
		
	for(int i = 0; i <  usedLetters.length(); i++) {
		if (usedLetters.charAt(i) == inputChar) {
			keepAsking = false;
			println("Repeated character. Exiting the program...");
			break;
		}
		
	}
	
	if (keepAsking) {
		for (int i = 0; i < inputText.length(); i++) {
			if (inputText.charAt(i) == inputChar) {
				numberOfLetters++;
			}
		}
		println("Number of letters is: " + numberOfLetters);
		numberOfLetters = 0;
	}
	
	usedLetters += inputChar;
	
	
}