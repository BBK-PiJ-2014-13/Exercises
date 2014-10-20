public class HospitalManager {
	static private Patient patientListStart = null;

	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
		hm.patientListStart.addPatient(new Patient("Jim Walton", 36, "Hit his head"));
		hm.patientListStart.addPatient(new Patient("Robert Downey", 28, "Got shot"));
		hm.patientListStart.addPatient(new Patient("Dwayne Johnson", 18, "Got bitten"));
		hm.patientListStart.addPatient(new Patient("Bradley Cooper", 42, "Cold"));
		hm.patientListStart.addPatient(new Patient("Leonardo DiCaprio", 57, "Hot"));
		hm.patientListStart.addPatient(new Patient("Chris Hemsworth", 25, "Cough"));
		hm.patientListStart.addPatient(new Patient("Liam Neeson", 36, "Ebola"));
		hm.patientListStart.addPatient(new Patient("Ben Affleck", 20, "Ebola"));
		hm.patientListStart.addPatient(new Patient("Christian Bale", 17, "Ebola"));
		hm.patientListStart.addPatient(new Patient("Will Smith", 35, "Ebola"));
		hm.patientListStart.addPatient(new Patient("Mark Wahlberg", 53, "Ebola"));

		System.out.println(">>> Traverse through the list");
		hm.patientListStart.printPatient();

		System.out.println(" ");

		hm.patientListStart.deletePatient(new Patient("Robert Downey", 28, "Got shot"));
		hm.patientListStart.deletePatient(new Patient("Dwayne Johnson", 18, "Got bitten"));
		hm.patientListStart.deletePatient(new Patient("Bradley Cooper", 42, "Cold"));

		System.out.println(">>> Traverse through the list");
		hm.patientListStart.printPatient();

		hm.patientListStart.addPatient(new Patient("Bill Gates", 60, "Cold"));

		hm.patientListStart.deletePatient(new Patient("unkown actor", 42, "Cold"));

		System.out.println(" ");

		System.out.println(">>> Traverse through the list");
		hm.patientListStart.printPatient();

	}

	void launch() {
		Patient firstPatient = new Patient("John Thompson", 33, "Tuberculosis");
		patientListStart = firstPatient;
	}

	public static Patient getPatientListStart() {
		return patientListStart;
	}

}
