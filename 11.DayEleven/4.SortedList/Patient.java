public class Patient<T> {
	private T value;
	private Patient nextPatient;
	private Patient previousPatient;

	public Patient(T v) {
		value = v;
		this.nextPatient = null;
		this.previousPatient = null;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
			this.nextPatient.previousPatient = this;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}

	void printForward() {
		System.out.print(value);
		if (nextPatient != null) {
			nextPatient.printForward();
		} else {
			System.out.println(">> End of print forward loop");
			System.out.println(" ");
			printBackwards();
		}
	}

	void printBackwards() {
		System.out.print(value);
		if (previousPatient != null) {
			previousPatient.printBackwards();
		} else {
			System.out.println(">> End of print backwards loop");
			System.out.println(" ");
		}
	}

	boolean deletePatient(Patient patient) {
		if (this.nextPatient == null) {
			return false;
		} else if (this.nextPatient.value.equals(patient.value)) {
			this.nextPatient = nextPatient.nextPatient;
			nextPatient.previousPatient = this;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}

}
