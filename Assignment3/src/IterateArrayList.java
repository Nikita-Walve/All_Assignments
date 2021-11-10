import java.util.*;
public class IterateArrayList {
	public static void main(String args[])
	{
	int i=0,itr=0;
	ArrayList<String> list=new ArrayList();
	list.add("nikita");
	list.add("suzzane");
	list.add("ajit");
	System.out.println("The list contains :"+list);
	System.out.println("The List iteration using for loop :");
	System.out.print("[");
	for( i=0;i<list.size();i++)
	{
	System.out.print(list.get(i)+" ");
	}
	System.out.println("]");
	//System.out.println();
	System.out.println("\n The List iteration using while loop :");
	System.out.print("[");
	while(list.size()>itr)
	{
	System.out.print(list.get(itr)+" ");
	itr++;
	}
	System.out.println("]");
	System.out.println("\n The List iteration using Advanced for loop :");
	System.out.print("[");
	for(String names:list)
	{
	System.out.print(names+" ");
	}
	System.out.println("]");
	}
	}






