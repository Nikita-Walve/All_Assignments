import java.util.Scanner;
public class Pattern {

	public static void main(String args[])
	{
	String s;
	int i,j;
	System.out.println("enter string");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	int n=s.length();
	for(i=0;i<n;i++)
	{
	for(j=0;j<=i;j++)
	{
	System.out.print(s.charAt(j));
	}
	System.out.println();
	}
	}
	}



