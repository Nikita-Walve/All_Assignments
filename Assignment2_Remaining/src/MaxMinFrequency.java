import java.util.Scanner;
public class MaxMinFrequency {

		public static void main(String args[])
		{
			 String str;
		     char max,min;
		     int maxCnt=0, minCnt=1,n, cnt=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			str = sc.nextLine();
			max = ' ';
			min = ' ';
			n=str.length();
			
			for (int i = 0; i < n; i++) 
			{
				cnt=0;
				for (int j = 0; j < n; j++) 
				{
					if(str.charAt(i)==str.charAt(j))
					{
					   cnt++;
					}
				}
				if(cnt>maxCnt)
				{
					minCnt = maxCnt;
					min=max;
					max = str.charAt(i);
					maxCnt=cnt;
				}
				if(cnt<minCnt)
				{
					min=str.charAt(i);
				}
			}
			System.out.println("The maximum frequnecy Character: "+max);
			System.out.println("The minimum frequnecy Character: "+min);
		}
	}


