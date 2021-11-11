import java.util.Scanner;

public class StringReverse
{
	static void Reverse(String string)
	{
		for (int i = string.length() - 1; i >= 0; i--)
		{
			System.out.print(string.charAt(i));
		}

	}

	public static void main(String args[])
	{
		String string;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		/*
		 * no need to create object because our method is static and we can call static
		 * methods without creating object StringReverse object = new StringReverse();
		 * object.Reverse(string);
		 */
		Reverse(string);

	}
}
