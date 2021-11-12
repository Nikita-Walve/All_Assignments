import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class EvenNumber
{
	static void even(List<Integer> list)
	{
		List<Integer> evenNumber = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("The even number list is :" + evenNumber);
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
		even(list);
	}
}
