public class Assignment03 {
	
	public static void main(String[] args) {
		
		String stringA = "Hello";
		String stringB = "Casey";
		String stringC = "madam";
		String stringD = "Pancake";
		
		System.out.println(Unique(stringA));
		System.out.println(Unique(stringB));
		System.out.println(Palindrome(stringC));
		System.out.println(Palindrome(stringD));
		System.out.println(Uppercase("hello world! i can't wait to program. let's go!"));
	}
	
	public static boolean Unique(String a)
	{
		char b;
		int c;
		for(int i = 0; i < a.length(); i++)
		{
			b = a.charAt(i);
			c = i;
			for(int j = 0; j < a.length(); j++)
			{
				if(c != j)
				{
					if(b == a.charAt(j))
					{
						return false;
					}
				}
			}
		}
		return true;
	}
	public static boolean Palindrome(String a)
	{
		char b;
		for(int i = 0; i < a.length(); i++)
		{
			b = a.charAt(i);
			if(b != a.charAt(a.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}
	public static String Uppercase(String a)
	{
		int m = a.charAt(0);
		String n = "";
		char b;
		if(m > 96 && m < 123)
		{
			m = (char)m-32;
			b = (char)m;
			n += b;
		}
		for(int i = 1; i < a.length(); i++)
		{
			m = (int)a.charAt(i);
			if(m > 96 && m < 123)
			{
				if(a.charAt(i-1) == 32)
				{
					if(a.charAt(i-2) == 46 || a.charAt(i-2) == 33 || a.charAt(i-2) == 63)
					{
						m = (char)m-32;
						b = (char)m;
						n += b;
					}
					else
					{
						b = a.charAt(i);
						n += b;
					}
				}
				else
				{
					b = a.charAt(i);
					n += b;
				}
			}
			else
			{
				b = a.charAt(i);
				n += b;
			}
		}
		return n;
	}
	
}