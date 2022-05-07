package Assignment_01;
/*
 * WAP in java, to delete index=3, element from the given array
mentioned below.
Int[] arr = {1,2,3,4,5,6,7,8,9}
Note: Non relevance places would be filled with zeros.
 */
public class Question_08 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9} ; 
		int i ; 
		for(i=3; i<a.length-1; i++)
		{
			a[i] = a[i+1] ; 
		}
        a[i] = 0 ; 
        System.out.println("Array after the deletion"); 
        for( i=0; i<a.length; i++)
        {
        	System.out.print(a[i]+" ");
        }
	}

}
