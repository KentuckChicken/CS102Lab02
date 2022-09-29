import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sept29 {
	
	public static void main(String[] args) {
		
		LinkedList myLL = new LinkedList();
		myLL.add(5);
		myLL.add(-5);
		myLL.add(20);
		myLL.add("Casey");
		myLL.add(3.6);
		
		System.out.println(myLL);
		myLL.remove();
		System.out.println(myLL);
		myLL.remove();
		System.out.println(myLL);
		
		Queue<String> myQ = new LinkedList();
		myQ.add("Green");
		myQ.add("Yellow");
		myQ.add("Blue");
		myQ.add("Pink");
		myQ.add("Gray");
		System.out.println(myQ);
		myQ.poll();
		System.out.println(myQ);
		myQ.poll();
		System.out.println(myQ);
		
		Stack<String> myS = new Stack();
		
		myS.add("Green");
		myS.add("Yellow");
		myS.add("Blue");
		myS.add("Pink");
		myS.add("Gray");
		System.out.println(myS);
		myS.pop();
		System.out.println(myS);
		myS.pop();
		System.out.println(myS);
		
	}
	
}