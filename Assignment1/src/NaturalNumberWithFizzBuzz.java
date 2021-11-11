import java.util.Scanner;

public class NaturalNumberWithFizzBuzz
{
	static void checkNaturalNumbers(int number)
	{
		for (int i = 1; i <= number; i++)
		{
			if ((i % 3 == 0) && (i % 5 == 0))
			{
				// It is multiple of 3 & 5
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0)
			{
				// It is multiple of 3 only
				System.out.println("Fizz");
			} else if (i % 5 == 0)
			{
				// It is multiple of 5 only
				System.out.println("Buzz");
			} else
			{
				// other ntural numbers rather than multiples of 3 & 5
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String args[])
	{
		System.out.println("Enter the number of element :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("The natural numbers with multiples of 3 prints Fizz & 5 prints Buzz and 3&5 prints FizzBuzz");
		checkNaturalNumbers(number);
	}
}
