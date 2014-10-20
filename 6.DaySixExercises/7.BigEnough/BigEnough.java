public class BigEnough {

	String[] listName = new String[5];
	int[] listID = new int[5];
	int count = 0;

	public void register(String name, int ID) {
		if (count >= listName.length) {
			increaseSize(); // Increase size of both arrays
		}

		addName(name); // Add name of employee to string array
		addID(ID); // Add ID of employee to int array

		count++;
	}

	public void addName(String name) {
		listName[count] = name;
	}

	public void addID(int ID) {
		listID[count] = ID;
	}

	public void increaseSize() {
		String[] tempName = new String[count + 5];
		int[] tempID = new int[count + 5];
		
		copyStringArray(tempName, listName);
		copyIntArray(tempID, listID);
		
		listName = tempName;
		listID = tempID;
	}

	public void copyStringArray(String[] bigger, String[] smaller) {
		for (int i = 0; i < smaller.length; i++) {
			bigger[i] = smaller[i];
		}
	}

	public void copyIntArray(int[] bigger, int[] smaller) {
		for (int i = 0; i < smaller.length; i++) {
			bigger[i] = smaller[i];
		}
	}
	
	public void printNames() {
		
		for (int i = 0; i < count; i++) {
			if (listName[i].length() == 0) {
				break;
			}
			
			if (listID[i] == 0) {
				break;
			}
			
			if (listName[i].charAt(0) == 'S' || listID[i] % 2 == 0) {
				System.out.println(listName[i] + " - " + listID[i]);
			}
		}
		
	}
}
