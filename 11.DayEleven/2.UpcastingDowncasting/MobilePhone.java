public class MobilePhone extends OldPhone {
	
	public MobilePhone(String brand) {
		super(brand);
	}

	public void ringAlarm(String s) {
		System.out.println(s + " ringing");
	}

	protected void playGame(String s) {
		System.out.println("Playing game " + s);
	}
	public void printLastNumbers() {
		System.out.println("37437434353");
		System.out.println("438753465834");
		System.out.println("8237462387462");
	}
	
	public void testPhone(Phone p) {
		SmartPhone newPhone = new SmartPhone("");
		newPhone = (SmartPhone)p;
		newPhone.browseWeb("");
	}

	
}
