import java.util.Scanner;
public class PascalTriangle {
	    public static void main(String args[])
	    {
	    int row,n=1,space,i,j;
	   System.out.println("Enter the number of rows: ");
	    Scanner sc=new Scanner(System.in);
	    row=sc.nextInt();
	    for(i=0;i<row;i++)
	    {
	        for(space=1;space<=row-i;space++)
	        System.out.print("  ");
	        for(j=0;j<=i;j++)
	        {
	            if (j==0||i==0)
	                n=1;
	            else
	               n=n*(i-j+1)/j;
	            System.out.printf("%4d",n);
	        }
	        System.out.println("\n");
	    }
	}
	}


