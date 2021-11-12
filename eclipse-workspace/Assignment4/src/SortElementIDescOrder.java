import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortElementIDescOrder
{
	static void sort(List<Integer> list)
	{
		List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("The Sorted List in Descending order is:" + sortedList);
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
		sort(list);
	}
}
