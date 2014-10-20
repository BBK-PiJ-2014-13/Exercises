
public class Spy {
	private static int spyCount = 0;
	int ID;
	
	public Spy(int i) {
		ID = i;
		spyCount++;
		System.out.println("ID of the spy is: " + ID);
		System.out.println("Total number of spies is: " + spyCount);
	}
	
	public static int getNumberOfSpies() {
		return spyCount;
	}
	
	public void die() {
		System.out.println("Spy " + ID + " has been detected and eliminated");
		spyCount--;
		System.out.println("Total number of spies is: " + spyCount);
	}
}
