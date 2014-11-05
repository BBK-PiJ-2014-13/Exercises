
public class Patient {
	public String name;
	public int age;
	public String illness;
	public Patient nextPatient;

	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}

	void printPatient() {
		System.out.print(name + ", ");
		System.out.print(age + ", ");
		System.out.println(illness);
		if (nextPatient != null) {
			nextPatient.printPatient();
		}
	}

	boolean deletePatient(Patient patient) {
		if (this.nextPatient == null) {
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
