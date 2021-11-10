import java.util.Scanner;
public class Strp {

	public static void main(String args[])
	{
	String s;
	String s1="";
	int flag=0,i;
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	int n=s.length();

	for(i=n-1;i>=0;i--)
	{
	s1=s1+s.charAt(i);
	}
	for(i=0;i<n;i++)
	{
	if(s.charAt(i)!=s1.charAt(i))
	flag=1;
	}
	if(flag==0)
	{
	System.out.println(s);
	}
	else
	{
	System.out.println("not"+" "+s1);
	}
	}
	}


