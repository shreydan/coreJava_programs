class linearsearch {

	public int linearInt(int[] arr, int n) {
		
		// returns position else -1
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n)
			 	return i;
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

*/ 
