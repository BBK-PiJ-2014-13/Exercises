public class StartingClass {

	public static void main(String[] args) {
		IntegerTreeNode firstNode = new IntegerTreeNode(10);
		
		firstNode.add(12);
		firstNode.add(8);
		firstNode.add(15);
		firstNode.add(14);
		firstNode.add(11);
		firstNode.add(5);
		firstNode.add(7);
		firstNode.add(2);
		firstNode.add(20);
		firstNode.add(4);
		
		System.out.println(firstNode.getMin(firstNode.value));
		
		
	}

}
