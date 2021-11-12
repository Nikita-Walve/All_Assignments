import java.util.ArrayList;
import java.util.List;
import java.util.List;
//import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Scanner;
public class FindFirstElement
{
	static void findFirstEle(List<Integer> list)
	{
		//Optional<Integer> firstElement = list.stream().findFirst();
		List<Integer>firstelement=list.stream().limit(1).collect(Collectors.toList());
		System.out.println("The first element present in List is:"+firstelement);
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
		findFirstEle(list);
		
	}

}


