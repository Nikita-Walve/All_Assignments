import java.util.*;
public class CountWords {
	public static void main(String args[])
	{
	int i,j=0,cnt=0;
	String str="Fear leads to anger ; anger leads to hatred ; hatred leads to conflict ; conflict leads to suffering";
	HashMap<String,Integer> map=new HashMap<>();
	String[] string=str.split(" ");
	int n=string.length;
	String[] str2=new String[n];
	for(i=0;i<n;i++)
	{
	if(string[i].equals(";")||string[i].equals(" ")||string[i].equals(".")||string[i].equals(","))
	{
	cnt++;
	}
	else
	{
	str2[j]=string[i];
	j++;
	}
	}

	/*for(i=0;i<j;i++)
	{
	System.out.println(i+" "+str2[i]+" ");
	}*/

	for(String str1:str2)
	{
	 if(map.containsKey(str1))
	{
	map.put(str1,map.get(str1)+1);
	}
	else
	{
	map.put(str1,1);
	}
	}

	System.out.println("The count of each word :"+map);

	}
	}





