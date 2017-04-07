class selectionsort {

	public int selection(int[] arr) {

		// sort in ascending
		
		int min = 0,pos=0,i,j;
		for(i=0;i<arr.length-1;i++) {
		
			min = arr[i];
			pos = i;
			for(j=i+1;j<arr.length;j++) {
				
				if(arr[j]<min) {
					min = arr[j];
					pos = j;
				}
			}
			
			arr[pos] = arr[i];
			arr[i] = min;
		}
		
		return arr;
	
	
	}

}

/*

Variable description
-------- -----------

datatype	name	purpose
--------	----	-------

int			i		outer loop var
int			j		inner loop var 
int			min		minimum value
int			pos		stores position of current value

*/
