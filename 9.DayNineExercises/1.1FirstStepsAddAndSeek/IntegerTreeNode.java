public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	public IntegerTreeNode(int i) {
		value = i;
		IntegerTreeNode left = null;
		IntegerTreeNode right = null;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public int getMax(int i) {
		if (right == null) {
			if (value > i) {
				return value;
			} else {
				return i;
			}
		} else {
			if (value > i) {
				return right.getMax(value);
			} else {
				return right.getMax(i);
			}
		}
		
	}
	
	public int getMin(int i) {
		if (left == null) {
			if (value < i) {
				return value;
			} else {
				return i;
			}
		} else {
			if (value < i) {
				return left.getMin(value);
			} else {
				return left.getMin(i);
			}
		}
		
	}

}
