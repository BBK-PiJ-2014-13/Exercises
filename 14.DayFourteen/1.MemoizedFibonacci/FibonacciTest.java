import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

public class FibonacciTest {
	int number = 10000;


	@Test
	public void testsFibonacciWithMemoization() {
		System.out.println(FibonacciWithMemoization.fib(number));
	}

	
	public void testsFibonacciWithoutMomoization() {
		System.out.println(FibonacciWithoutMemoization.fib(number));
	}
}
