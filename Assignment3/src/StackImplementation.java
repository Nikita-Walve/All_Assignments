import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;
public class StackImplementation {
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Stack<Integer> stack=new Stack<>();
	//System.out.println("Push the elemnet to the stack");
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.push(50);
	System.out.println("The elements in the stack are : ");
	System.out.println(stack);
	int popE=stack.pop();
	System.out.println("The poped element from the stack is :"+popE);
	System.out.println("The elements in the stack are : ");
	System.out.println(stack);
	System.out.println("Enter the elemnet you want to search in the stack :");
	int element=sc.nextInt();
	int number=stack.search(element);
	if(number>0)
	{
	System.out.println("The ele is found :");
	}
	else
	{
		System.out.println("The ele is not present");
	}
	System.out.println("The stack size is :"+stack.size());
	boolean result=stack.empty();
	System.out.println("The stack is empty :"+result);
	System.out.println("The stack is traversal using iterator :");
	Iterator itr=stack.iterator();
	while(itr.hasNext())
	{
	Object ele=itr.next();
	System.out.println(ele);
	}
	System.out.println("enter the position whose ele you want");
	int position=sc.nextInt();
	if(position<stack.size())
	{
	System.out.println("The element at  position is :"+stack.get(position));
	}
	else
	{
		System.out.println("enter the valid position");
	}

	System.out.println("The Top element in stack is : "+stack.peek());
	}
	}


