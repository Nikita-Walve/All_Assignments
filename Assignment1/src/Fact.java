import java.util.Scanner;
public class Fact {

	public static void main(String args[])
	{
	int n,fact=1;
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();

	while(n>0)
	{
	fact=fact*n;
	n--;
	}
	System.out.println("The factorial of the number is "+fact);
	}
	}



