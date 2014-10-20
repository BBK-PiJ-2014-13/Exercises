print("Enter your text: ");
String inputText = System.console().readLine();
print("Type a letter: ");
char chosenLetter = System.console().readLine().charAt(0);
int numberOfLetters = 0;

for (int i = 0; i < inputText.length(); i++) {
	if (inputText.charAt(i) == chosenLetter) {
		numberOfLetters++;
	}
}
println(numberOfLetters);