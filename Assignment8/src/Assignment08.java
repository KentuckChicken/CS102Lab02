import java.util.ArrayList;

public class Assignment08 {
	
	public static void main(String[] args) {
		
		BTNode root = new BTNode(5);
		root.left = new BTNode(3);
		root.right = new BTNode(6);
		root.left.left = new BTNode(2);
		root.left.right = new BTNode(4);
		root.right.right = new BTNode(7);
		
		inOrder(root, 2);
		
	}
	
//	public static BTNode removeNode(BTNode root, int key)
//	{
//		
//	}
	
	private static void inOrder(BTNode node, int key)
	{
		if(node == null)
		{
			return;
		}
		else
		{
			inOrder(node.left, key);
			if(node.value == key)
			{
				node = null;
			}
			else
			{
				System.out.print(node.value + " ");
			}
			inOrder(node.right, key);
			if(node.value == key)
			{
				node = null;
			}
			else
			{
				System.out.println(node.value + " ");
			}
		}
	}
	
}