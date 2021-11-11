import java.util.Scanner;

public class StringPalindrome {
	public static void main(String args[]) {
		String string;
		String string1 = "";
		int flag = 0;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		int string_length = string.length();

		for (int i = string_length - 1; i >= 0; i--) {
			string1 = string1 + string.charAt(i);
		}
		for (int i = 0; i < string_length; i++) {
			if (string.charAt(i) != string1.charAt(i))
				flag = 1;
		}
		if (flag == 0) {
			System.out.println("The entered string is palindrome");
		} else {
			System.out.println("The entered string is not palindrome");
		}
	}
}
