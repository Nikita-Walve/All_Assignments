import java.util.Scanner;
public class Rec {
	
	int fact(int n)
	{
	if(n>0)
	{
	return n*fact(n-1);
	}
	else
	{
	return 1;
	}
	}

	public static void main(String args[])
	{
	Rec r=new Rec();
	int n;
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int s=r.fact(n);
	System.out.println(s);
	}
	}



