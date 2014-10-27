public interface IntSortedList {

	public void add(int i); // adds a new int to the list so that the list remains sorted; a list can contain duplicates
							// unlike a set

	public void contains(int i); // returns true if the number is in the list, false otherwise.

	public String toString(); // returns a string with the values of the elements in the list separated by commas.

}
