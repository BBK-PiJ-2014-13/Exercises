
public class HospitalManager {
	public Patient patientListStart;

	public void launch() {
		Patient firstPatient = new Patient("John Thompson", 33, "Tuberculosis");
		patientListStart = firstPatient;
	}

}
