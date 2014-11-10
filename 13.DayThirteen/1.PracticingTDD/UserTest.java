import static org.junit.Assert.*;

import org.junit.Test;


public class UserTest {
	
	@Test
	public void testsGettersAndSetters() {
		UserImpl user = new UserImpl("Arnold");
		String name = user.getName();
		String nameExpected = "Arnold";
		assertEquals(name, nameExpected);
		user.setID(39);
		int ID = user.getID();
		int IDExpected = 39;
		assertEquals(ID, IDExpected);
		ID = user.getID();
		assertEquals(ID, IDExpected);
	}
}
