import java.util.Scanner;

public class FactorialWithRecursion
{
	static int factorial(int n)
	{
		if (n > 0)
		{
			return n * factorial(n - 1);
		} else
		{
			return 1;
		}
	}

	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = factorial(number);
		System.out.println(result);
	}
}
