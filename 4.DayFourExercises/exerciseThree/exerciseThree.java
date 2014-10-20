import java.util.Scanner;
public class exerciseThree
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
} private static int totalAmountToBePaid(double m, double y, double i) {
	double totalToBePaid = m * (1 + i*y/100);
	System.out.println("The total is: " + totalToBePaid);
	return 0;
}


System.out.print("Enter the total amount borrowed for a mortgage: ");
double mortgage = Double.parseDouble(System.console().readLine());
System.out.print("Enter the number of years to pay it back: ");
double years = Double.parseDouble(System.console().readLine());
System.out.print("Enter the interest rate: ");
double interest = Double.parseDouble(System.console().readLine());

int n = totalAmountToBePaid(mortgage, years, interest);
}

