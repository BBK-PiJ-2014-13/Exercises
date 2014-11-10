
public class LibraryImpl implements Library{
	private String name;
	private static final int MAXBOOKS = 3;
	private LinkedList<UserRegisteredImpl> linkedList = new LinkedList();
	
	public LibraryImpl(String s) {
		name = s;
	}

	public int getMaxBooks() {
		return MAXBOOKS;
	}

	public int getID(String s) {
		return 0;
	}

	public UserRegistered add(UserRegistered u) {
		return linkedList.add((UserRegisteredImpl) u);
	}

	public UserRegistered get(int i) {
		return (UserRegistered) linkedList.get(i);
	}

}
