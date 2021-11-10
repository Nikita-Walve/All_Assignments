import java.util.Scanner;
public class DuplicateElement {
		public static void main(String args[])
		{
			int n,temp=0,j=0,i,cnt=0,k=0;
			System.out.println("enter the no of array elememt you want:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
					int a[]=new int[n];
					System.out.println("enter the array element:");
					for(i=0;i<n;i++)
					{
						a[i]=sc.nextInt();
					}
					for(i=0;i<n-1;i++)
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
					System.out.println("The sorted array :");
					for(i=0;i<n;i++)
					{
						System.out.println(a[i]);
					}
					System.out.println("the duplicate elements are:");
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
						System.out.println(a[i]);
						}
			
					}
					}
		}

