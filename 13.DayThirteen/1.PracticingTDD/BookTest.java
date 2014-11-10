import static org.junit.Assert.*;

import org.junit.Test;


public class BookTest {
	@Test
	public void testsGetters() {
		BookImpl book = new BookImpl("George Orwell", "Animal Farm");
		String author = book.getAuthor();
		String name = book.getTitle();
		String authorExpected = "George Orwell";
		String nameExpected = "Animal Farm";
		assertEquals(author, authorExpected);
		assertEquals(name, nameExpected);
	}
}
