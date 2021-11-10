
import java.util.Scanner;
public class Strr {
	public static void main(String args[])
	{
	String s;
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	int n=s.length();
	for(int i=n-1;i>=0;i--)
	{
	System.out.print(s.charAt(i));
	}
	}
	}


