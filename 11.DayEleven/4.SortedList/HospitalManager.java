public class HospitalManager {
	private Patient patientListStart = null;

	public static void main(String[] args) {
		
		Patient firstPatientName = new Patient("John Thompson");
		firstPatientName.addPatient(new Patient("Jim Walton"));
		firstPatientName.addPatient(new Patient("Robert Downey"));
		
		
		Patient<Integer> firstPatientNumber = new Patient<Integer>(new Integer(34934583));
		firstPatientNumber.addPatient(new Patient(1312312));
		firstPatientNumber.addPatient(new Patient(234234));
		
		

	}


}
