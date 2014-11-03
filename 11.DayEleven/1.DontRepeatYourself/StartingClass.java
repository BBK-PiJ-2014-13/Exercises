public class StartingClass {
	public static void main(String[] args) {
		Comparator comparator = new Comparator();
		System.out.println(comparator.getMax(12.5, 12));
		System.out.println(comparator.getMax(3, 5));
		System.out.println(comparator.getMax("120", "100"));
		
	}
}
