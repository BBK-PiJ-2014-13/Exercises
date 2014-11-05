import org.junit.*;
import static org.junit.Assert.*;

public class SpyTest {
	private int spyCount = 0;
	int ID;

	public SpyTest(int i) {
		ID = i;
		spyCount++;
		System.out.println("ID of the spy is: " + ID);
		System.out.println("Total number of spies is: " + spyCount);
	}

	@Test
	public int getNumberOfSpies() {
		return spyCount;
	}

	public void die() {
		System.out.println("Spy " + ID + " has been detected and eliminated");
		spyCount--;
		System.out.println("Total number of spies is: " + spyCount);
	}
}
