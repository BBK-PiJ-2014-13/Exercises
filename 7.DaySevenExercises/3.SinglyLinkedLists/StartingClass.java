import java.util.Random;

public class StartingClass {
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
		for (int i = 0; i < 2000; i++) {
			Random r = new Random();
			hm.patientListStart.addPatient(new Patient("", r.nextInt(55 - 18), ""));
		}
		
		System.out.println(hm.patientListStart.nextPatient.age);
		
	}

}
