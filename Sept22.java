public class Sept22 {
	
	public static void main(String[] args) {
		
		char[] charArray = {'F', 'n', '+', 'a', '?', 'R'};
		
		for(int i = 0; i < charArray.length; i++)
		{
			int intVal = (int)charArray[i];
			if(charArray[i] >= 97 && charArray[i] <= 122)
			{
				int upperVal = intVal - 32;
				char upperCase = (char)upperVal;
				charArray[i] = (char)upperVal;
			}
		}
		System.out.println(charArray);
		
	}
	
}