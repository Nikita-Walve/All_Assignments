import java.util.Scanner;
public class RemoveWhiteSpaces {
	public static void main(String args[])
	{
	String str;
	int i;
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	int n=str.length();
	System.out.println("the string after white space removal:");
	for(i=0;i<n;i++)

	{
	if(str.charAt(i)==' ')
	{
	continue;
	}
	else
	{
	System.out.print(str.charAt(i));
	}
	}
	}
	}

