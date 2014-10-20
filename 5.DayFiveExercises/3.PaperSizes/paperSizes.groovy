String paperSizes(String s) {
	int count = 0;
	double side1 = 841;
	double side2 = 1189;
	String output = "";
	
	if (s.charAt(5) == '0') {
		count = s.length() - 6;
		println(increaseSize(side1, side2, count));
	} else {
		count = Character.getNumericValue(s.charAt(5));
		println(decreaseSize(side1, side2, count));
	}
	
	
	
}

String increaseSize(double smallest, double biggest, int n) {
	double temp = 0;
	
	if (n == 0) {
	return "The size is " + smallest + " X " + biggest;
	}
	
	temp = biggest;
	biggest = smallest * 2;
	smallest = temp;
	
	increaseSize(smallest, biggest, n-1);
	
	
}

String decreaseSize(double smallest, double biggest, int n) {
	double temp = 0;
	
	if (n == 0) {
	return "The size is " + smallest + " X " + biggest;
	}
	
	temp = smallest;
	smallest = biggest / 2;
	biggest = temp;
	
	increaseSize(smallest, biggest, n-1);
	
	
} 

paperSizes("Din-A00");