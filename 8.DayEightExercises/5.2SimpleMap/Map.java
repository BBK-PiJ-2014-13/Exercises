public class Map implements SimpleMap {
	static Map headElement;
	int intPointer;
	String stringPointer;
	Map nextElement;

	public Map(int i, String s) {
		intPointer = i;
		stringPointer = s;
		nextElement = null;
	}

	@Override
	public void put(int key, String name) {
		if (nextElement == null) {
			nextElement = new Map(key, name);
		} else {
			nextElement.put(key, name);
		}
	}

	@Override
	public String get(int key) {
		if (intPointer == key) {
			return stringPointer;
		}
		if (nextElement != null) {
			return nextElement.get(key);
		}
		return null;
	}

	@Override
	public void remove(int key) {
		if (nextElement.intPointer == key) {
			nextElement = nextElement.nextElement;
		}

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
