import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class FirstNonRepeatedChar
{
	static void checkNonRepeatedChar(List<String> list)
	{
		// convert the string into the character array
		char[] charArray = list.toString().toCharArray();
		int iterator = 1;
		// convert the character array into character list to perform operation on character list
		List<Character> l = new ArrayList<Character>();
		while (iterator < charArray.length - 1)
		{
			if (charArray[iterator] != ' ')
			{
				l.add(charArray[iterator]);
			}
			iterator++;

		}
		// System.out.println(l);
		List<Character> nonrepeated = l.stream().filter(x -> Collections.frequency(l, x) < 2).limit(1)
				.collect(Collectors.toList());
		System.out.println("The first non repeated character in the string is :" + nonrepeated);
	}

	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		list.add(sc.nextLine());
		System.out.println("The string is :" + list);
		checkNonRepeatedChar(list);
	}

}
