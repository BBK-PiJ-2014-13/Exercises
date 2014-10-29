
public class SmartPhone extends MobilePhone{
	public SmartPhone(String brand) {
		super(brand);
	}
	public void browseWeb(String s) {
		
	}
	public void findPosition() {
		
	}
	@Override
	public void call(String s) {
		if (s.charAt(0) == '0' && s.charAt(1) == '0') {
			System.out.println("Calling " + s + " through the internet to save money");;
		} else {
			super.call(s);
		}
	}
}
