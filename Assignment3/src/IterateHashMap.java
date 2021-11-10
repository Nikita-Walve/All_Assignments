import java.util.*;
public class IterateHashMap {
	public static void main(String args[])
	{
	int i;
	HashMap<String,String>map=new HashMap<>();
	map.put("Maharashtra","Mumbai");
	map.put("Gujrat","Gandhinagar");
	Iterator<String>itr=map.keySet().iterator();
	System.out.println("The iteration of HashMap using while loop :");
	while(itr.hasNext())
	{
	String key=itr.next();
	System.out.println("Key is "+key+" "+"Value is "+map.get(key));
	}
	System.out.println("The iteration of HashMap using Advanced for loop :");
	for(Map.Entry<String,String>e:map.entrySet())
	{
	String key=e.getKey();
	String value=e.getValue();
	System.out.println("Key is :"+key+" "+"Value is :"+value);
	}
	}
	}




