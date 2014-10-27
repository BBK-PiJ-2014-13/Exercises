public interface IntSet {
	public void add(int i); // adds a new int to the set; if it is there already, nothing happens

	public boolean contains(int i); // returns true if the number is in the set, false otherwise.

	public boolean containsVerbose(int i); // returns the same values as the former method, but for every element that
											// is checked prints its value on screen.

	public String toString(); // returns a string with the values of the elements in the set separated by commas.

}
