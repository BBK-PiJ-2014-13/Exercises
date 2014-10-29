
public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher phoneLauncher = new PhoneLauncher();
		phoneLauncher.launch();
	}
	public void launch() {
		SmartPhone smartPhone = new SmartPhone("nokia");
		smartPhone.playGame("tetris");
	}
}
