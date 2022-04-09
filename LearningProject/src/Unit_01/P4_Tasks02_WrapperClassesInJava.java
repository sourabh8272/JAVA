package Unit_01;
/**
 * The wrapper class in java provides the machanism to convert primitive into object and obj
   why ?
   Because we want to use prefined methods of those objects
   - boolean  data types ->_Boolean obj; ->obj.tostring(); 
 
 **/

public class P4_Tasks02_WrapperClassesInJava {

	public static void main(String[] args) {
		
		int a = 20;   //Converting int to integer 
		
		String s =    "" + "";
		
		Integer i = Integer.valueOf(a);  //converting int into Integer explicitly
		Integer j =  a;    //autoboxing, now compiler will write Integer , valueof(a) internally
		
		System.out.println(a + " " + i + " " + j);
		
		System.out.println(i.toString()); //a.tosttring() can not be done due to a is int not objects
		
		//Autoboxing: Converting primitive into objects
		byte b= 10;   
		Byte byteobj = b; 
		
		System.out.println(byteobj);
		
		//Autoboxing: Converting primitive into objects
		byte bytevalue = byteobj;
		System.out.println(bytevalue);
		
	}

}
