import java.io.Console;


public class StartingClass {

	public static void main(String[] args) {
		
		Employee[] employeeList = new Employee[10];

		// Ask for employee details
		for (int i = 0; i < 10; i++) {
			employeeList[i] = registerNewEmployee();
		}
		
		//Print out the names of employees
		for (int i = 0; i < 10; i++) {
			System.out.println("Employee " + (i + 1) + ": " + employeeList[i].getName() + " " + employeeList[i].getId());
		}

		
	}
	
	public static Employee registerNewEmployee() {
		Console console = System.console();
		System.out.print("Enter the name of next employee: ");
		String name = console.readLine();
		System.out.print("Enter the id of next employee: ");
		int id = Integer.parseInt(console.readLine());
		
		Employee output = new Employee(name, id);
		
		return output;
	}

}
