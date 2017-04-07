class binarysearch {

	public int binary(int arr[], int n) {

		// array has to be sorted in ascending order
		// returns position else -1
		
		int last = arr.length-1;
		int mid;
		
		while(first<=last) {
		
			mid = (first + last)/2;

			if (n < arr[mid])
				last = mid - 1;
				
			else if (n > arr[mid])
				first = mid + 1;
				
			else
				return mid ;
		}	
		
		return -1;
		
	}

}

/*

Variable Description
--------------------

datatype	name	purpose
--------	----	-------

int[]		arr		array to search in
int			n		number to search
int			first	first index
int			last	last index
int 		mid 	middle index	

*/ 
