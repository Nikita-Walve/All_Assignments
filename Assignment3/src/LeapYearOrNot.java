import java.util.Scanner;
public class LeapYearOrNot {
	
	public static void main(String args[])
	{
	int flag=0,i;
	System.out.println("enter the year");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	if(((year%4==0)&& (year%100!=0))||(year%400==0))
	{
	System.out.println("Yes,This is a leap year");
	}
	else
	{
	System.out.println("No,This is not a leap year");
	}
	}

	}




