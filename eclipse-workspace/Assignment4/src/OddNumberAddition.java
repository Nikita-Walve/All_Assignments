import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;;

public class OddNumberAddition
{
	static void sumOfOdd(List<Integer> list)
	{
		int sum = list.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
		System.out.println("The sum of odd numbers :" + sum);
	}

	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		int numberOfElement;
		System.out.println("Enter number of element for the list :");
		Scanner sc = new Scanner(System.in);
		numberOfElement = sc.nextInt();
		System.out.println("Enter the elemnt to the list :");
		for (int i = 0; i < numberOfElement; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("The list is :" + list);
		sumOfOdd(list);
	}

}
