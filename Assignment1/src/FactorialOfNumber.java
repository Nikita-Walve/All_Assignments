import java.util.Scanner;

public class FactorialOfNumber
{
	static void factorial(int number)
	{
		int fact = 1;
		while (number > 0)
		{
			fact = fact * number;
			number--;
		}
		System.out.println("The factorial of the number is " + fact);
	}

	public static void main(String args[])
	{
		int n, fact = 1;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		factorial(number);
	}
}
