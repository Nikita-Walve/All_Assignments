import java.util.Scanner;
public class Fib 

{
	public static void main(String args[])
	{
	int cnt=2;
	int fib2=0;
	int fib1=1;
	int fib=1;
	System.out.println(fib2+" ");
	System.out.println(fib1+" ");
	System.out.println(fib+" ");
	while(cnt<10)
	{
	fib2=fib1;
	fib1=fib;
	fib=fib1+fib2;
	System.out.println(fib+" ");
	cnt++;
	}
	}
}

