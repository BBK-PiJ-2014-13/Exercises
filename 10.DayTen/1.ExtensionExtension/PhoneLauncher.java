
public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher phoneLauncher = new PhoneLauncher();
		phoneLauncher.launch();
	}
	public void launch() {
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call("934875349857349");
		smartPhone.ringAlarm("Ring Ring");
		smartPhone.playGame("Tetris");
		smartPhone.printLastNumbers();
		smartPhone.browseWeb("google.com");
		smartPhone.findPosition();
	}
}
