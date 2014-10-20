public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;

	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
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
		System.out.print(name + ", ");
		System.out.print(age + ", ");
		System.out.println(illness);
		if (nextPatient != null) {
			nextPatient.printForward();
		} else {
			System.out.println(">> End of print forward loop");
			System.out.println(" ");
			printBackwards();
		}
	}

	void printBackwards() {
		System.out.print(name + ", ");
		System.out.print(age + ", ");
		System.out.println(illness);
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
		} else if (this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			nextPatient.previousPatient = this;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}

}
