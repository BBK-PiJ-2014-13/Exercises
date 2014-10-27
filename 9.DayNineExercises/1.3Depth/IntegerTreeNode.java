public class IntegerTreeNode {
	int value;
	public IntegerTreeNode left;
	public IntegerTreeNode right;

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

	public String toString() {
		return buildTheString("");
	}
	
	public String buildTheString(String input) {
		String s = input;
		// Add the beginning
		s += "[" + value + " L";
		
		System.out.println(s);
		
		// Add left object's contents
		if (left == null) {
			s += "[]";
		} else {
			s += left.buildTheString(s);
		}
		
		System.out.println(s);
		
		// Add the middle part
		s += " R";
		
		System.out.println(s);
		
		// Add right object's contents
		if (right == null) {
			s += "[]";
		} else {
			s += right.buildTheString(s);
		}
		
		System.out.println(s);
		
		// Add closing bracket
		s += "]";
		
		System.out.println(s);
		
		return s;
	}
	
	public int depth(int depth) {
		int maxDepth = depth;
		int leftDepth = 0;
		int rightDepth = 0;
		
		// Calculate depth to the left
		if (left != null) {
			leftDepth = left.depth(maxDepth + 1);
		}
				
		// Calculate depth to the right
		if (right != null) {
			rightDepth = right.depth(maxDepth + 1);
		}
		
		// Calculate max depth
		if (leftDepth > maxDepth) {
			maxDepth = leftDepth;
		}
		if (rightDepth > maxDepth) {
			maxDepth = rightDepth;
		}
		
		return maxDepth;
	}
}
