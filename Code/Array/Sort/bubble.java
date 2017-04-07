class bubblesort {

	public int bubble(int[] arr) {
		
		// sort in ascending
		
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
int			temp	temporary var


*/
