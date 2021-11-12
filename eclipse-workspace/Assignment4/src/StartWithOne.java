import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StartWithOne
{
	static void checkWithStart(List<Integer> list)
	{
		/*
		 * strtWith() method is not for integer value therefore I have convert integer
		 * List to the string list and then apply the startWith method to string list
		 * List<Integer>lits1=list.stream().filter(x->x.startWith("1")).collect(
		 * Collectors.toList());
		 */
		List<String> string = list.stream().map(Object::toString).filter(x -> x.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("The elemnet start with 1 are :" + string);
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
		checkWithStart(list);
	}

}
