import java.util.Scanner;
public class DuplicateCharElement 
{
public static void main(String args[])
		{
			String str;
		char temp;
		int cnt=0,i,j=0,n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string - ");
			str = sc.nextLine();
			     char a[]= str.toCharArray();
	          n=a.length;
	             for(i=0;i<n;i++)
	             {
	             	for(j=i+1;j<n;j++)
	             	{
	             		if(a[i]>a[j])
	             		{
	             			temp=a[i];
	             			a[i]=a[j];
	             			a[j]=temp;
	             		}
	             	}
	             }
	             System.out.println("The sorted string is: ");
	       for(i=0;i<n;i++)
	       {
	       	System.out.print(a[i]);
	       }
	       System.out.println();
	       System.out.println("the duplicate string elements are:");
					for(i=0;i<n;i++)
					{
						cnt=0;
						for(j=i+1;j<n;j++)
						{
							if(a[i]==a[j])
							{
							cnt++;
							i++;
							}
						}
						
						if(cnt>=1)
						{
						System.out.print(a[i]+" ");
						}
			
					}
		}
	}


