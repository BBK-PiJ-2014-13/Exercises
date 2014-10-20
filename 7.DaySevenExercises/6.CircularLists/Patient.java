public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient patientListStart = HospitalManager.getPatientListStart();

	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = patientListStart;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == patientListStart) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}

	void printPatient() {
		System.out.print(name + ", ");
		System.out.print(age + ", ");
		System.out.println(illness);
		if (nextPatient != patientListStart) {
			nextPatient.printPatient();
		}
	}

	boolean deletePatient(Patient patient) {
		if (this.nextPatient == patientListStart) {
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	void deleteFirst() {
		name = nextPatient.name;
		age = nextPatient.age;
		illness = nextPatient.illness;
		nextPatient = nextPatient.nextPatient;
	}

}
