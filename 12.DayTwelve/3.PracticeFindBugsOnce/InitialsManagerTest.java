import org.junit.Test;

public class InitialsManagerTest {
	public static void main(String[] args) {
		InitialsManagerTest imt = new InitialsManagerTest();
		imt.testsInitialsManager();
	}

	@Test
	public void testsInitialsManager() {
		InitialsManager im = new InitialsManager();
		System.out.println("");
		System.out.println(im.getInitials("Thomas Johnson"));
		System.out.println(im.getInitials("Adam  Smith"));
	}
}
