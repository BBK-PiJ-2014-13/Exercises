public class StartingClass {
	public static void main(String[] args) {
		
		BigEnough bigEnough = new BigEnough();
		
		while (true) {
			System.out.print("Enter the name of Employee: ");
			String name = System.console().readLine();
			System.out.print("Enter the ID of Employee: ");
			String input = System.console().readLine();
			int ID = 0;
			
			if (input.length() != 0) {
				ID = Integer.parseInt(input);
			}
			
			
			if (name.length() == 0 || ID == 0) {
				break;
			}
			
			bigEnough.register(name, ID);
		}
		
		bigEnough.printNames(); // Print the names and IDs of employees
	}
}
