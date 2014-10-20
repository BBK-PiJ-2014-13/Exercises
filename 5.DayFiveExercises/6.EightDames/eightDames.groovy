boolean[][] checkboard = new boolean[8][8]
boolean[][] eightDamesArray = new boolean [8][8];

// mark all booleans as true
for (int i = 0; i < 8; i++) {
	for (int j = 0; j < 8; j++) {
		checkboard[i][j] = true; 
	}
}


void eightDames(boolean[][] a1, boolean[][] a2) {
	for (int i = 0; i < calculateElements(a); i++) {
		
	}
}

int calculateElements(boolean[][] a) { // Outputs how many free spots are now in the array
	int result = 0;
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if (a[i][j] == true) {
				result++;
			}
		}
	}
	return result;

}

eightDames(checkboard);