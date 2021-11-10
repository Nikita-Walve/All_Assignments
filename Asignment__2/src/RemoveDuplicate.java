import java.util.Scanner;
public class RemoveDuplicate
{
		public static void main(String args[])
		{
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of element:");
			n=sc.nextInt();
					int a[]=new int[n];
					System.out.println("enter the array elemnet:");
					for(int i=0;i<n;i++)
					{
						a[i]=sc.nextInt();
					}
					for(int i=0;i<n;i++)
					{ 
					int j=i+1;
						while(j<n)
						{
							if(a[i]==a[j])
							{
								for(int k=j;k<n-1;k++)
								{
									a[k]=a[k+1];
								}
								n=n-1;
							}
							else
							j=j+1;
						}
					}
					System.out.println("Array after removal of duplicate element:");
					for(int i=0;i<n;i++)
					{
						System.out.print(a[i]+" ");
					}
		}
	}


