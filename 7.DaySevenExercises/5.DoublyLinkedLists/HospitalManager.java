public class HospitalManager {
	private Patient patientListStart = null;

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

		System.out.println(">>>	Traverse Forward and backward");
		hm.patientListStart.printForward();

		System.out.println(">>> Delete some elements");

		hm.patientListStart.deletePatient(new Patient("Leonardo DiCaprio", 57, "Hot"));
		hm.patientListStart.deletePatient(new Patient("Chris Hemsworth", 25, "Cough"));
		hm.patientListStart.deletePatient(new Patient("Liam Neeson", 36, "Ebola"));
		hm.patientListStart.deletePatient(new Patient("Ben Affleck", 20, "Ebola"));

		System.out.println(">>> Traverse Forward and backward");
		hm.patientListStart.printForward();
		
		// Add a new element to the list
		hm.patientListStart.addPatient(new Patient("Arnold Schwarznegger", 72, "Cocain overdose"));
		
		//Try to delete element not on the list
		hm.patientListStart.deletePatient(new Patient("Bill Gates", 65, "Cold"));
		
		System.out.println(">>> Traverse Forward and backward");
		hm.patientListStart.printForward();

	}

	void launch() {
		Patient firstPatient = new Patient("John Thompson", 33, "Tuberculosis");
		patientListStart = firstPatient;
	}

}
