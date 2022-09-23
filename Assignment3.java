public class Assignment3 {
	
	public static void main(String[] args) {
		
		int[] intArrayA = {2, 10, 4, 5, 6, 7};
		int[] intArrayB = {0, 6, 7, 5, 8, 3};
		
		int[] intArrayC = {2, 65, 8, 9, 77};
		int[] intArrayD = {4, 77, 45, 9, 0};
		
		char[] charArrayA = {'c', 'a', 's', 'e', 'y'};
		
		System.out.println(Common(intArrayA, intArrayB));
		System.out.println(Contains(intArrayC));
		System.out.println(Contains(intArrayD));
		System.out.println(Reverses(charArrayA));
	}
	
	public static boolean Contains(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == 65)
			{
				for(int j = 0; i < array.length; j++)
				{
					if(array[j] == 77)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static String Common(int[] arrayA, int[] arrayB)
	{
		String result = "Common Elements:";
		for(int i = 0; i < arrayA.length; i++)
		{
			for(int j = 0; j < arrayB.length; j++)
			{
				if(arrayB[j] == arrayA[i])
				{
					result += " " + arrayB[j];
				}
			}
		}
		return result;
	}
	
	public static char[] Reverses(char[] array)
	{
		char f;
		for(int i = 0; i < array.length/2; i++)
		{
			f = array[i];
			array[i] = array[array.length -1 - i];
			array[array.length -1 - i] = f;
		}
		return array;
	}
	
}