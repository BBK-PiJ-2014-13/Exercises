public class StartingClass {

	public static void main(String[] args) {
		IntegerTreeNode firstNode = new IntegerTreeNode(6);
		
		firstNode.add(9);
		firstNode.add(12);
		firstNode.add(6);
		firstNode.add(3);
		firstNode.add(15);
		firstNode.add(11);
		firstNode.add(4);
		firstNode.add(1);
		firstNode.add(16);
		firstNode.add(19);
		
		
		// System.out.println(firstNode.toString());
		System.out.println(firstNode.depth(0));
		
	}

}
