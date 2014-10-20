int factorial(int n) {
	if (n == 1) {
		return 1;
	} else {
		int result = n * factorial(n - 1);
		return result;
	}
}

int factorialLoop(int n) {
	int result = 1;
	for (int i = 1; i <= n; i++) {
		result *= i;
	}
	return result;
}

println(factorial(5));
println(factorialLoop(5));



