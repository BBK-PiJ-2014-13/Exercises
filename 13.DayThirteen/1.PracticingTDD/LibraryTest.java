import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	LibraryImpl library = new LibraryImpl("South West Library");
	UserRegisteredImpl userRegistered = new UserRegisteredImpl("Johnson");

	public void testsGetMaxBooks() {
		int maxBooks = library.getMaxBooks();
		int maxBooksExpected = 3;
		assertEquals(maxBooks, maxBooksExpected);
	}

	
	public void testsGetID() {
		int userID = library.getID("Johnson");
		int userIDExpected = 13;
		assertEquals(userID, userIDExpected);
	}

	@Test
	public void testsAddAndGet() {
		UserRegisteredImpl userRegisteredExpected = userRegistered;
		userRegisteredExpected = (UserRegisteredImpl) library.add(userRegistered);
		assertEquals(userRegistered, userRegisteredExpected);
	}
}
