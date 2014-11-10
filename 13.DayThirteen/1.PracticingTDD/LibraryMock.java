
public class LibraryMock implements Library{
	private String name;
	private static int MAXBOOKS = 3;
	
	public LibraryMock(String s) {
		name = s;
	}

	@Override
	public int getMaxBooks() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
