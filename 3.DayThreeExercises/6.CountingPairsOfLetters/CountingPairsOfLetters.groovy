print("Enter a small string: ");
String smallText = System.console().readLine();
print("Enter a large string: ");
String largeText = System.console().readLine();

int numberOfWordMatches = 0;
int numberOfLetterMatchesSoFar = 0;

for (int i = 0; i <= largeText.length() - smallText.length(); i++) {
	for (int j = 0; j < smallText.length(); j++) {
		if (numberOfLetterMatchesSoFar < smallText.length()) {
			if (largeText.charAt(i + j) == smallText.charAt(j)) {
				numberOfLetterMatchesSoFar++;
			} else {
			numberOfLetterMatchesSoFar = 0;
			break;
			}
		} else {
			numberOfWordMatches++
			numberOfLetterMatchesSoFar = 0;
		}
	}
}

println("The number of matches is: " + numberOfWordMatches);