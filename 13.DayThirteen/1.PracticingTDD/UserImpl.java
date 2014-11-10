
public class UserImpl implements User{
	private String name;
	private int ID;
	
	public UserImpl(String s) {
		name = s;
	}

	public int getID() {
		return ID;
	}

	public void setID(int i) {
		ID = i;
	}

	public String getName() {
		return name;
	}
	
}
