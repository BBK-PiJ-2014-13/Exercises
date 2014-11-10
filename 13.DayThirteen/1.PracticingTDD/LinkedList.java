public class LinkedList<T> {
	public int index;
	public LinkedList nextElement;
	public T value;

	public LinkedList() {
	}

	// TODO Untested
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}

	// TODO Untested
	public int size() {
		if (nextElement == null) {
			return 0;
		} else {
			return 1 + nextElement.size();
		}
	}

	// TODO Untested
	public Object get(int i) {
		if (nextElement.index == i) {
			return value;
		} else {
			return nextElement.get(i);
		}
		// TODO Add code to handle errors
	}

	// TODO Untested
	public LinkedList remove(int i) {
		if (nextElement.index == i) {
			LinkedList result = nextElement;
			nextElement = nextElement.nextElement;
			return result;
		} else {
			nextElement.remove(i);
		}
		// TODO Add code to handle arrors
		return null; // TODO add return statement
	}

	// TODO Untested
	public T add(int i, T o) {
		LinkedList input = (LinkedList) o;
		if (nextElement.index == i) {
			nextElement.moveIndexes();
			input.nextElement = nextElement;
			nextElement = input;
		} else {
			nextElement.add(i, o);
		}
		// TODO Add code to handle arrors
		return null; // TODO add return statement
	}

	// Moves indexes of all elements down the list by 1
	// TODO Untested
	public void moveIndexes() {
		index++;
		if (nextElement == null) {
			return;
		} else {
			nextElement.moveIndexes();
		}
	}

	// TODO Untested
	public T add(T t) {
		if (nextElement == null) {
			nextElement = new LinkedList();
			nextElement.index = index + 1;
			nextElement.value = t;
			return t;
		} else {
			return (T) nextElement.add(t);
		}
		// TODO Add code to handle errors
	}

	// TODO Untested
	public LinkedList last() {
		if (nextElement == null) {
			return this;
		} else {
			return nextElement.last();
		}
		// TODO Add code to handle an error
	}

	// TODO Untested
	public LinkedList removeLast() {
		LinkedList output;
		if (nextElement.nextElement == null) {
			output = nextElement;
			nextElement = null;
			return output;
		} else {
			return nextElement.removeLast();
		}
		// TODO Add code to handle an error
	}
}
