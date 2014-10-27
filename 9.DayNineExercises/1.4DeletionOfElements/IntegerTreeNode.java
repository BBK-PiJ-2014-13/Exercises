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

	public String toString(String input) {
		String s = input;
		// Add the beginning
		s += "[" + value + " L";

		System.out.println(s);

		// Add left object's contents
		if (left == null) {
			s += "[]";
		} else {
			s += left.toString(s);
		}

		System.out.println(s);

		// Add the middle part
		s += " R";

		System.out.println(s);

		// Add right object's contents
		if (right == null) {
			s += "[]";
		} else {
			s += right.toString(s);
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

	public void remove(int i) {
		// Define node with node to delete
		IntegerTreeNode nodeWithNodeToDelete = findNodeWithThisNode(i);

		// Define node to delete
		IntegerTreeNode nodeToDelete = null;
		if (nodeWithNodeToDelete.left.value == i) {
			nodeToDelete = nodeWithNodeToDelete.left;
		} else {
			nodeToDelete = nodeWithNodeToDelete.right;
		}

		// Define node with lowest node to the right from the node to delete
		IntegerTreeNode nodeWithLowestNode = nodeToDelete.findLowestToTheRight();

		// Replace pointer to node to delete
		if (nodeWithNodeToDelete.left.value == i) {
			nodeWithNodeToDelete.left = nodeWithLowestNode.left;
		} else {
			nodeWithNodeToDelete = nodeWithLowestNode.left;
		}

		// Replace pointer in lowest node
		nodeToDelete.right = nodeToDelete.right;

		// Remove pointer to lowest node
		nodeWithLowestNode.left = null;
	}

	public IntegerTreeNode findNodeWithThisNode(int i) { // Find the node with the needed node
		if (right != null) {
			if (right.value == i) {
				return this;
			}
		}

		if (left != null) {
			if (left.value == i) {
				return this;
			}
		}

		// Look on the left
		if (left != null) {
			if (left.findNodeWithThisNode(i) != null) {
				return left.findNodeWithThisNode(i);
			}
		}

		// Look on the right
		if (right != null) {
			if (right.findNodeWithThisNode(i) != null) {
				return right.findNodeWithThisNode(i);
			}
		}

		return null;

	}

	public IntegerTreeNode find(int i) { // Find the node with the needed node
		if (value == i) {
			return this;
		}

		// Look on the left
		if (left != null) {
			return left.find(i);
		}

		// Look on the right
		if (right != null) {
			return right.find(i);
		}

		return null;

	}

	public IntegerTreeNode findLowestToTheRight() {
		if (left.left == null) {
			return this.left;
		} else {
			left.findLowestToTheRight();
		}
		return null;
	}
}
