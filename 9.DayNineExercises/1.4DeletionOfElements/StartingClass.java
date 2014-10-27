public class StartingClass {

	public static void main(String[] args) {
		IntegerTreeNode firstNode = new IntegerTreeNode(6);

		firstNode.add(5);
		firstNode.add(3);
		firstNode.add(4);
		firstNode.add(19);
		firstNode.add(10);
		firstNode.add(7);
		firstNode.add(26);
		firstNode.add(32);
		firstNode.add(24);

		firstNode.remove(26);
		
		if (firstNode.find(26) == null) {
			System.out.println("Node 25 successfully removed");
		}
	}

}
