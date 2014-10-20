double[] noteArray = new double[12]; // Create an array

noteArray[0] = 50;
noteArray[1] = 20;
noteArray[2] = 10;
noteArray[3] = 5;
noteArray[4] = 2;
noteArray[5] = 1;
noteArray[6] = 0.50;
noteArray[7] = 0.20;
noteArray[8] = 0.10;
noteArray[9] = 0.05;
noteArray[10] = 0.02;
noteArray[11] = 0.01;

print("Type the total amount of change: ");
double change = Double.parseDouble(System.console().readLine());

int numberOfNotes = 0;
for (int i = 0; i < 6; i++) {

	if (change == 0) {
	break;
	}
	
	numberOfNotes = (int)((change - (change % noteArray[i])) / noteArray[i]);
	if (numberOfNotes != 0) {
		print(numberOfNotes);
		println(" of " + (int)(noteArray[i]));
		change -= change - (change % noteArray[i]);
	}
}

for (int i = 6; i < 12; i++) {

	if (change == 0) {
	break;
	}
	
	numberOfNotes = (int)((change - (change % noteArray[i])) / noteArray[i]);
	if (numberOfNotes != 0) {
		print(numberOfNotes);
		println(" of " + (noteArray[i]));
		change -= change - (change % noteArray[i]);
	}
}