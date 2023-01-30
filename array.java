public class array{

  /*take 2 integer arrays of 10 indicies each and initialize them, then copy 
   * the contents of both arrays in a third array , one consecutive index from
   * one array at a time 
   * E.g if the array 1 has 1,2,3,4,5,6,7,8,9,10 stored and array2 has 11,12,13,14,15
   * 16,17,18,19,20 stored then array three will have
   * 1,11,2,12,3,13,4,14,5,15,6,16,7,17,8,18,9,19,10,20 stored
   */
  public static void main(String[] args) {
		int size=10; // specify size of first and second array
		int arr1 []= new int[size];
		int arr2[]= new int[size];
		int arr3[]= new int[arr1.length+arr2.length]; // size of third array equals the sum of first and second array size
		
		for(int i=0; i<=size-1;i++) {
			arr1[i]=i+1;
			arr2[i]=i+11;
			
			
		}
		int counter=0;
		for(int i=0;i<arr1.length;i++) {
			
			arr3[counter]=arr1[i];
			
			
			arr3[counter+1]=arr2[i];
			counter=counter+2;
		}
		System.out.print("[");
	for (int i = 0; i < arr3.length; i++) {
		System.out.print(arr3[i]+ ",");
	} System.out.println("]");
		
		
		
	}


}