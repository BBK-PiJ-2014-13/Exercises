import java.util.Random;

import org.junit.Test;

public class HospitalManagerTest {
	public static void main(String[] args) {
		HospitalManagerTest hmt = new HospitalManagerTest();
		hmt.testsPatientCreation();
	}

	@Test
	public void testsPatientCreation() {
		Random r = new Random();
		HospitalManager hm = new HospitalManager();
		hm.launch();
		for (int i = 0; i < 2000; i++) {
			hm.patientListStart.addPatient(new Patient("", r.nextInt(55 - 18), ""));
		}
	}
}
