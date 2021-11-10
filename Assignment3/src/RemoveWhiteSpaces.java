import java.util.Scanner;
public class RemoveWhiteSpaces {
	public static void main(String args[])
	{
	System.out.println("Enter the string :");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int length=str.length();
	System.out.println("The entered string :");
	System.out.println(str);
	System.out.println("The string without whitespaces :");


	for(int i=0;i<length;i++)
	{
	if(str.charAt(i)!=' ')
	{
	System.out.print(str.charAt(i));
	}
	else
	{
	continue;
	}
	}
	}
	}



