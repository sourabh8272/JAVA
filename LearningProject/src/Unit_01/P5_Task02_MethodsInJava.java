package Unit_01;

public class P5_Task02_MethodsInJava {

	public static void main(String[] args) {
		
		ABC3 obj = new ABC3();
		
		// Calling display method definition
		obj.display();
		System.out.println(obj.a);

	}

}

class ABC3 {
	static int a = 10;
	
	/* Actual method definition 
	  DatatType methodName(DataType2 p1, dataType2 p2){
	  
	  methodBody;
	  return value   // if required
	  
	  }
	 
	 */
	static void display() {
		int b = 10;
		int a = 10;
		
		System.out.println(b);
		System.out.println(a);
	}
	
	int display2() {
		
		System.out.println(a);
		// As was a local variable so we can not access it outside the method 
		// System.out.println(b);
		
		return a;
	}
	 
}
