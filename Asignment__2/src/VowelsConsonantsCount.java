import java.util.Scanner;
public class VowelsConsonantsCount {
	public static void main(String args[])
	{
	String str;
	int cnt=0,cnt1=0,i;
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	int n=str.length();
	for(i=0;i<n;i++)

	{
	if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
	{
	cnt++;
	}
	else if(str.charAt(i)==' ')
	{
	continue;
	}
	else
	{
	cnt1++;
	}
	}
	System.out.println("The count of vowels  in the string is: "+cnt);
	System.out.println("The count of consonants  in the string is: "+cnt1);
	}


}
