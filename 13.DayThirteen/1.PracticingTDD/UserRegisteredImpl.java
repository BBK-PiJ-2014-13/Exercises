
public class UserRegisteredImpl extends UserImpl implements UserRegistered{
	private LibraryImpl library;

	public UserRegisteredImpl(String s) {
		super(s);
	}

	public void register(Library r) {
		library = (LibraryImpl) r;
		
	}

	public Library getLibrary() {
		return library;
	}
	
}
