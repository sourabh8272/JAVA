package Unit_01;
/* 
 - Normally, we array is a collection of similar type of elements which has contiguous memory location.
 - Java array is an object which contain elements of a similar data type.
 - we can store only a fixed set of element in a java array
 
 - Size limit issue:-
 	- We can store only the fixed size of elements in the array
 	- It does not grow its size at run time
 	- To solve this problem, collection framework is used in java which grows automatically 
 	
 There are 2 types of array:-
 1)- Single Dimensional Array
 2)- Multi-Dimensional Array
 
 - Declare an array in java:-
 	DataType arrayrefVar[];
 	        OR
 	DataType[] arrayRefVar;
 	        OR
 	DataType []arrayRefvar;
 	
 - Initialization of an array in java
 	arrayRefvar = new datatype[size];
 
 */

public class P6_Task01_ArraysInJava {

	public static void main(String[] args) {
		
		int array1[];   // Declaration
		
		int[] array2;
		int []array3;
		
		// Can not do it as we have not provide it any reason/space yet!
		// array1[0] = 1;
		
		// Initialization, during initialization we have to provide the size of the array.
		array1 = new int[6];
		
		//Assigning value to the java array
		for(int i=0 ; i<array1.length ; i++) //  length is the property of array
			array1[i] = i;
		
		int array4[] = {33,3,4,5}; // declaration,instantiation and initialization
		
		arrayAsParameter(array4);  // passing array to method 
		
		// passing Anonymous array is a method
		arrayAsParameter(new int[] {33,3,4,5});
		
		// Returning array from the method
		int[] array5 = arrayAsReturnType();
		System.out.println(array5.toString());
		
		// ArrayIndexOutOfBoundsException
		int arr[] = {50,60,70,80};
		for(int i=0;i<=arr.length;i++)
			System.out.println(arr[i]);
		
		// Multidimensional Array in java
		int[][] arr6 = new int[3][3]; // 3 rows and 3 column
		for(int i=0,j=0 ; i<3 && j<3 ; i++, j++)
			System.out.println(arr6[i][j]);
		
		int counter = 0;
		for(int i=0,j=0 ; i<3 && j<3 ; i++, j++) {
			counter++;
			arr6[i][j] = counter;
		}
		
		for(int i=0,j=0 ; i<3 && j<3 ; i++, j++)
			System.out.println(arr6[i][j]);
		
	}
	
	static void arrayAsParameter(int arr[]) {  // declare empty array as parameter
		for(int i=0 ; i<arr.length ; i++) 
			System.out.println(arr[i]);
		
	}
	
	// Returning array from the method
	static int[] arrayAsReturnType() {
		int array4[] = {33,3,4,5};
		
		return array4;
	}

}
