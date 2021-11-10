import java.util.Scanner;
public class DescendingOrder {
	public static void main(String args[])
	{
		int n,i,temp,j;
	System.out.println("enter the no of element you want");
		Scanner sc=new Scanner(System.in);
	        n=sc.nextInt();
		int a[]=new int[n];
	System.out.println("enter the array element");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	System.out.println("The Unsorted array is :");
	for(i=0;i<n;i++)
	{
	System.out.println(a[i]+" ");
	}
	        for(i=0;i<n;i++)
	        {
	         for(j=i+1;j<n;j++)
	{
	if(a[i]<a[j])
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
	}
	System.out.println("The sorted array is :");
	for(i=0;i<n;i++)
	{
	System.out.println(a[i]+" ");
	}
	}
	}

