public class FibonacciWithMemoization {
	private static int[] precalculated = null;

	public static int fib(int n) {
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n - 1] != -1) {
			return precalculated[n - 1];
		} else {
			int result = fib(n - 1) + fib(n - 2);
			precalculated[n - 1] = result;
			return result;
		}
	}

	private static void initPrecalculatedArray(int size) {
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
			if (i == 0 || i == 1) {
				precalculated[i] = 1;
			} else {
			precalculated[i] = -1; // to indicate "not calculated yet"
			}
		}
	}
}
