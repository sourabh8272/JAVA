package Unit_01;

/*
 - It is called when an instance of the class is created
 - At the time of calling the constructor, memory for the object is allocated in the memory
 - It is a special type of method which is used to initialize the object
 - Every time an object is created using the new() keyword, at least one constructor is called
 
   There are 2 types of Constructors in java
   - Parameterized Constructor
   - Default Constructor
 */

public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
		
		ABC4 obj = new ABC4();
		ABC4 obj1 = new ABC4();
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
	}

}

class ABC4{
	
	int a;
	
	/*
	 ClassName(Constructor Parameter){
	 		All the class and Instance variables can be initialized here!
	 }
	*/
	
	ABC4(){
		a = 10;
		
	}
	
	ABC4(int a){
		this.a = a;
	}
	
	void display() {
		int b = 10;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	int display2() {
		System.out.println(a);
		// As was a local variable so we can not access it outside the method 
		// System.out.println(b);
				
		return a;
	}
	
}
