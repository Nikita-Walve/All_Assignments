public class FibonacciSeries {
	void fibonacci() {
		int count = 3;
		int fib2 = 0;
		int fib1 = 1;
		int fib = 1;
		System.out.print(fib2 + " " + fib1 + " " + fib + " ");
		while (count < 10) {
			fib2 = fib1;
			fib1 = fib;
			fib = fib1 + fib2;
			System.out.print(fib + " ");
			count++;
		}
	}

	public static void main(String args[]) {
		FibonacciSeries object = new FibonacciSeries();
		object.fibonacci();
	}
}
