import java.util.Scanner;

public class ReverseNumber {
	static void reverse(int number) {

		int sum = 0;
		while (number > 0) {
			int remainder = number % 10;
			sum = sum * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse number is :" + sum);
	}

	public static void main(String args[]) {
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		reverse(number);
	}
}
