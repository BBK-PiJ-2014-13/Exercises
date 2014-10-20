int fib(int n) {
if ((n == 1) || (n == 2)) {
return 1;
} else {
int result = fib(n-1) + fib(n-2); // method calls itself
return result;
}
}

int fibLoop(int n) {
	if (n <= 2) {
		return 1;
	}
	
	int count = 2;
	int current = 2;
	int previous = 1;
	int temp = 0;
	
	if (count != n) {
		for (count = 3; count < n; count++) {
			temp = current;
			current += previous;
			previous = temp;
		}
	} else {
	return current;
	}
}


println(fibLoop(6));