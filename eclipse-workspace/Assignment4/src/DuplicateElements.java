import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
public class DuplicateElements
{
	static void findDuplicate(List<Integer>list)
	{
		List<Integer> duplicateElement = list.stream().filter(x -> Collections.frequency(list, x) > 1).distinct().collect(Collectors.toList());
		System.out.println("The Duplicate elements are:" + duplicateElement);
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
		findDuplicate(list);
	}
}
