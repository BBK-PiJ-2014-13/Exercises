public class MarkCounter {

	Mark distinctionStart = new Mark(0);
	Mark passStart = new Mark(0);
	Mark failStart = new Mark(0);
	Mark invalidStart = new Mark(0);
	int numberOfStudents = 0;

	public void askForMarks() {
		do {
			System.out.print("Enter the mark: ");
			int mark = Integer.parseInt(System.console().readLine());
			if (mark == -1) {
				printTheResults();
				return;
			}

			if (mark >= 70 && mark <= 100) {
				numberOfStudents++;
				distinctionStart.addMark(new Mark(mark));
			} else if (mark >= 50 && mark <= 69) {
				numberOfStudents++;
				passStart.addMark(new Mark(mark));
			} else if (mark >= 0 && mark <= 49) {
				numberOfStudents++;
				failStart.addMark(new Mark(mark));
			} else {
				invalidStart.addMark(new Mark(mark));
			}

		} while (true);
	}

	void printTheResults() {
		System.out.println("There are " + numberOfStudents + " students: ");
		if (distinctionStart.nextMark != null) {
			System.out.println(distinctionStart.nextMark.countMarks() + " distinctions");
		}
		if (passStart.nextMark != null) {
			System.out.println(passStart.nextMark.countMarks() + " pass");
		}
		if (failStart.nextMark != null) {
			System.out.println(failStart.nextMark.countMarks() + " fails");
		}
		if (invalidStart.nextMark != null) {
			System.out.println(invalidStart.nextMark.countMarks() + " invalid");
		}
	}
}
