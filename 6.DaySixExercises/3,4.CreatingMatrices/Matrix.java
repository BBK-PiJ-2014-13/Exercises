public class Matrix {

	int[][] array;

	public Matrix(int i1, int i2) {
		array = new int[i1][i2];
	}

	// TODO TEST
	public void setElement(int i1, int i2, int i3) {
		array[i1][i2] = i3;
	}

	// TODO TEST
	public void setRow(int i, String s) {
		// Check if integer is correct
		if (i < 0 || i > array.length - 1) {
			return;
		}

		// Check if string has numbers
		boolean hasNumbers = false;
		for (int j = s.length(); j < s.length(); j++) {
			if (Character.isDigit(s.charAt(j))) {
				hasNumbers = true;
			}
		}

		// Extract all numbers and put them in a string
		String numbers = "";
		for (int j = s.length(); j < s.length(); j++) {
			if (Character.isDigit(s.charAt(j))) {
				numbers += s.charAt(j);
			}
		}

		// Stop method if string doesn't have numbers or has more numbers than necessary
		if (hasNumbers == false || array[i].length < numbers.length() - 1) {
			return;
		}

		// Modify the array
		for (int j = 0; j < numbers.length(); j++) {
			array[i][j] = s.charAt(j);
		}
	}

	// TODO TEST
	public void setColumn(int i, String s) {
		// Check if integer is not negative and there are enough columns
		if (i < 0 || i > array[0].length - 1) {
			return;
		}

		// Check if string has numbers
		boolean hasNumbers = false;
		for (int j = s.length(); j < s.length(); j++) {
			if (Character.isDigit(s.charAt(j))) {
				hasNumbers = true;
			}
		}

		// Extract all numbers and put them in a string
		String numbers = "";
		for (int j = s.length(); j < s.length(); j++) {
			if (Character.isDigit(s.charAt(j))) {
				numbers += s.charAt(j);
			}
		}

		// Stop method if string doesn't have numbers or has more numbers than necessary
		if (hasNumbers == false || array.length < numbers.length() - 1) {
			return;
		}

		// Modify the array
		for (int j = 0; j < numbers.length(); j++) {
			array[j][i] = s.charAt(j);
		}
	}

	// TODO TEST
	public String toString() {
		String output = "";

		for (int rows = 0; rows < array.length; rows++) { // Iterates as the number of rows
			for (int columns = 0; columns < array[0].length; columns++) { // Iterates as the number of columns
				if (columns == 0) {
					output += '[';
					output += array[rows][columns];
					output += ',';
				} else if (columns == array[0].length - 1) {
					output += array[rows][columns];
					output += ';';
				} else if (rows == array.length - 1 && columns == array.length - 1) {
					output += ',';
					output += array[rows][columns];
				} else {
					output += ',';
					output += array[rows][columns];
					output += ']';
				}
			}
		}

		return output;
	}

	public void prettyPrint() {
		for (int rows = 0; rows < array.length; rows++) {
			for (int columns = 0; columns < array[0].length; columns++) {
				if (columns < array[0].length - 1) {
					System.out.print("\t" + array[rows][columns]);
				} else {
					System.out.println("\t" + array[rows][columns]);
				}
			}
		}
	}

	public void setMatrix(String s) {
		int rows = 0;
		int columns = 0;
		for (int element = 0; element < s.length(); element++) {
			if (columns >= array[0].length) {
				columns = 0;
				rows++;
			}
			if (Character.isDigit(s.charAt(element))) {
				// System.out.println("rows: " + rows + " columns: " + columns);
				array[rows][columns] = Character.getNumericValue(s.charAt(element));
				columns++;
			}
		}
	}
}
