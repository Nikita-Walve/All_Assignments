import java.util.Scanner;

public class Pattern
{
	static void pattern(String string)
	{
		for (int i = 0; i < string.length(); i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print(string.charAt(j));
			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		String string;
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		pattern(string);
	}
}
