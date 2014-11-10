import static org.junit.Assert.*;

import org.junit.Test;


public class UserRegisteredTest {
	
	@Test
	public void testsGetLibraryAndRegister() {
		UserRegisteredImpl userRegistered = new UserRegisteredImpl("Arnold");
		LibraryImpl newLibrary = new LibraryImpl("South West Library");
		userRegistered.register(newLibrary);
		LibraryImpl library = (LibraryImpl) userRegistered.getLibrary();
		LibraryImpl libraryExpected = newLibrary;
		assertEquals(library, libraryExpected);
	}
}
