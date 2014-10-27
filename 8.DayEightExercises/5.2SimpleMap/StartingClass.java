public class StartingClass {
	static Map headElement = null;

	public static void main(String[] args) {
		
		StartingClass startingclass = new StartingClass();
		
		startingclass.AddElement(7, "John Johnson");
		startingclass.AddElement(3, "Arnold Schwarznegger");
		startingclass.AddElement(9, "George Bush");

		System.out.println(headElement.get(3));
		headElement.remove(9);
		System.out.println(headElement.get(9));
	}

	void AddElement(int i, String s) {
		if (headElement == null) {
			headElement = new Map(i, s); 
		} else {
			headElement.put(i, s);
		}
	}
}
