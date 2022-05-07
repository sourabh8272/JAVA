package Assignment_01;
/*
 * WAP to count the total number of calls for a member function:
display(), from more than one objects and how many times the object is
created of a class name Employee.
Note: Call display() function from more than 3 objects
 */
public class Question_07 {

	public static void main(String[] args) {
		Employee1  e1 = new Employee1() ; 
		Employee1  e2 = new Employee1() ; 
		Employee1  e3 = new Employee1() ; 
		Employee1  e4 = new Employee1() ; 
		e1.display(); 
		e2.display(); 
		e3.display(); 
		e4.display(); 
		e1.display1();
	}

}
class Employee1
{
	static int cc, dc ; 
	Employee1(){
		cc++ ; 
		System.out.println("Object is create ");
	}

	void display() {
		dc++ ; 
		System.out.println("Display is called by the function ");
	}
	void display1()
	{
		System.out.println("Total object is " +cc);
		System.out.println(dc + " Number of times display method is called");
	}
} 