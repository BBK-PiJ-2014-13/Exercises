int pow(int p, int e) {
	int result = p;
	if (e == 0) {
		return 1;
	} else {
		for (int i = 1; i < e; i++) {
			result *= p;
		}
		return result;
	}
}

int powRecursive(int p, int e) {
	int result = p;
	
	if (e == 0) {
		return 1;
	} else {
		result *= powRecursive(p, e - 1);
	}
}

println(pow(2,3));
println(powRecursive(2,3));