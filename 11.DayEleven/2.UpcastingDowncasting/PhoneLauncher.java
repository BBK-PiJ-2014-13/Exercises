public class PhoneLauncher {
	public static void main(String[] args) {
		MobilePhone myNewPhone = new SmartPhone("");
		SmartPhone myPhone = (SmartPhone) myNewPhone;
		/*
		myPhone.browseWeb("s");
		myPhone.call("");
		myPhone.equals(new SmartPhone(""));
		myPhone.findPosition();
		myPhone.getBrand();
		myPhone.playGame("");
		*/

		//myPhone.testPhone(myPhone);
		
		MobilePhone newMobilePhone = new MobilePhone("");
		newMobilePhone.testPhone(newMobilePhone);
	}

}
