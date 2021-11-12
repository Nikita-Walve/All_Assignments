import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxValueElement
{
	static void findMaxElement(List<Integer> list)
	{
		int result = list.stream().max(Integer::compare).get();
		System.out.println("The MaxValu element present in List is:" + result);
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
		findMaxElement(list);
	}
}
