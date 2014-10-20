print("Enter the total amount borrowed for a mortgage: ");
double mortgage = Double.parseDouble(System.console().readLine());
print("Enter the number of years to pay it back: ");
double years = Double.parseDouble(System.console().readLine());
print("Enter the interest rate: ");
double interest = Double.parseDouble(System.console().readLine());

println("Total amount to be paid is: " + totalAmountToBePaid(mortgage, years, interest));
println("Amount to be paid each year is: " + amountToBePaidEachYear(mortgage, years, interest));
println("Number of years before the interest is paid is: " + amountToPayForInterest(mortgage, years, interest) / amountToBePaidEachYear(mortgage, years, interest));

double totalAmountToBePaid(double m, double y, double i) {
	double output = m * (1 + i*y/100);
	return output;
}

double amountToBePaidEachYear(double m, double y, double i) {
	double output = totalAmountToBePaid(m, y, i) / y;
	return output;
}

double amountToPayForInterest(double m, double y, double i) {
	double output = totalAmountToBePaid(m, y, i) - m;
	return output;
}