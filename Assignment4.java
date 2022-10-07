import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Assignment4 {
	
	public static void main(String[] args) {
		
		Queue<Integer> myQ = new LinkedList();
		myQ.add(1);
		myQ.add(2);
		Stack<String> myStack = new Stack();
		
		System.out.println(Parentheses("(3 + 4) - 7)"));
		System.out.println(Parentheses("(((8*8-2) + 9 - (12*5)) - 2 )"));
		
	}
	
	public static int Minimum(Queue myQ)
	{
		return 1;
	}
	public static boolean Palindrome(Stack myStack)
	{
		return false;
	}
	public static boolean Parentheses(String a)
	{
		int b = 0;
		int c = 0;
		for(int i = 0; i < a.length(); i++)
		{
			if((int)a.charAt(i) == 40)
			{
				b+=1;
			}
			if((int)a.charAt(i) == 41)
			{
				c+=1;
			}
		}
		if(b == c)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}