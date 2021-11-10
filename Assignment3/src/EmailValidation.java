import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailValidation {
	public static void main(String args[])
	{
System.out.println("Enter your emaild is :");
             Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
	
String emailReg="^(.+)@gmail(.+)$";
							
		Pattern pat = Pattern.compile(emailReg);
		Matcher matcher=pat.matcher(s);
boolean match=matcher.find();
if(match)
{
System.out.println("You entered valid Email ");
}
else
{
System.out.println("Oops! Check your Email id ");
}
}
}



