import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountOfElement
{
	static void countListElement(List<Integer>list)
	{
		long result = list.stream().count();
		System.out.println("The Count of element present in List is:" + result);
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
		countListElement(list);
		}
	}
