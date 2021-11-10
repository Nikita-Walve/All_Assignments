import java.util.Scanner;
public class CountCharacter {
	public static void main(String args[])
	{
	String str;
	int cnt=0,i;
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	int n=str.length();
	for(i=0;i<n;i++)

	{
	if(str.charAt(i)!=' ')
	{
	cnt++;
	}
	}
	System.out.println("The count of character in the string is: "+cnt);
	}
	}


