class BinarySearchExample{
		 
	//takes in a sorted array, the first and last index, and the value we are looking for
	public static void binarySearch(int arr[], int first, int last, int key){
		   
		//finds the index in the middle of the array
		int mid = (first + last)/2;
		
		// loops while first and last values we search from are different
		while( first <= last ){
			/* checks if value in the middle of the array is less than our key value. 
			 * if it is, then the first index we search from becomes the value after the current middle*/
			if ( arr[mid] < key )
			{
		        first = mid + 1;   
		    }
			// checks if value in the middle of the array is equal to what we are looking for, prints message and stops the loop if it is
			else if ( arr[mid] == key )
			{
		        System.out.println("Element is found at index: " + mid);
		        break;
		    }
			// if neither above are true, then last index we search from becomes the value before the current middle
			else
			{
		         last = mid - 1;
		    }
			// the new middle of the array is calculated based on results of above code
		    mid = (first + last)/2;
		   }
		
		// prints message if the while loop is broken without finding the key
		if ( first > last )
		{
		   System.out.println("Element is not found!");
		}
		 }
		 public static void main(String args[]){
				int arr[] = {10,20,30,40,50};
				int key = 30;
		        int last=arr.length-1;
				binarySearch(arr,0,last,key);	
		 }
		}
