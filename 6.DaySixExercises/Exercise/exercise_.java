
public class Employee {

	private String name;
	private int id;
	
	public Employee(String s, int i) {
		name = s;
		id = i;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}

		String name = "";
		int id = 0;
		
		Employee[] employeeList = new Employee[10];

		// Ask for employee details
		for (int i = 0; i < 10; i++) {
			employeeList[i] = registerNewEmployee();
		}
		
		//Print out the names of employees
		for (int i = 0; i < 10; i++) {
			System.out.println("Employee " + (i + 1) + ": " + employeeList[i].getName() + " " + employeeList[i].getId());
		}
		
		public static Employee registerNewEmployee() {
		System.out.print("Enter the name of next employee: ");
		String name = System.console().readLine();
		System.out.print("Enter the id of next employee: ");
		int id = Integer.parseInt(System.console().readLine());
		
		Employee output = new Employee (name, id);
		
		return output;
	}