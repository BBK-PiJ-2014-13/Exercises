public class HashUtilities {
	
	public static void main(String[] args) {
		System.out.println("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
	}

	static int shortHash(int i) {
		if (i < 0) {
			i = Math.abs(i);
		}

		if (i > 1000) {
			return 999;
		} else {
			return i;
		}
	}

}
