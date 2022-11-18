public class Assign07 {
	
	public static void main(String[] args) {
		
		int[]array = {1, 5, 3, 4, 7, 10, 8, 2, 6, 19, 17, 23};
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println(MergeSort(array));
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	
	public static int MergeSort(int[] array)
	{
		int middle = (array.length)/2;
		
		int numOf = 0;
		
		int[] left = new int[middle];
		int[] right = new int[(array.length)-middle];
		
		for(int i = 0; i < middle; i++)
		{
			left[i] = array[i];
			//System.out.print(left[i] + ", ");
		}
		for(int i = 0; i < array.length - middle; i++)
		{
			right[i] = array[middle + i];
			//System.out.print(right[i] + ",");
		}
		
		numOf++;
		
		if(array.length > 1)
		{
			numOf++;
			MergeSort(left);
		}
		if(array.length > 1)
		{
			numOf++;
			MergeSort(right);
		}
		
		int l = left.length;
		int r = right.length;
		
		int leftIndex = 0;
		int rightIndex = 0;
		int i = 0;
		
		while(leftIndex < l && rightIndex < r)
		{
			if(left[leftIndex] < right[rightIndex])
			{
				array[i] = left[leftIndex];
				leftIndex++;
			}
			else
			{
				array[i] = right[rightIndex];
				rightIndex++;
			}
			i++;
			numOf++;
		}
		while(leftIndex<l)
		{
			array[i] = left[leftIndex];
			leftIndex++;
			i++;
			numOf++;
		}
		while(rightIndex<l)
		{
			array[i] = right[rightIndex];
			rightIndex++;
			i++;
			numOf++;
		}
		
		return numOf;
	}
	
}