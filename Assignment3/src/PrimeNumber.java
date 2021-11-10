import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[])
	{
	int flag=0,i;
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	for(i=2;i<number;i++)
	{
	flag=0;
	if(number%i==0)
	{
	flag=1;
	break;
	}
	}
	if(flag==0)
	{
	System.out.println("the number is a prime number");
	}
	else
	{
	System.out.println("the number is not a prime number");
	}
	}

	}


	


