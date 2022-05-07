package Assignment_01;
/*Create a multi-level inheritance hierarchy from ClassOne, ClassTwo,
ClassThree classes.
ClassOne contains one, single parameterized constructor
ClassTwo contains only a default constructor
ClassThree contains one, single parameterized constructor and a default
constructor.
Create an object of top child class and make sure the constructor
execution will take place according to respective multi-level inheritance
hierarchy.
ClassThree obj = new ClassThree(1);
ClassThree obj = new ClassThree();-*/
public class Question_04 {

	public static void main(String[] args) {
		Classthree obj = new Classthree() ; 
		Classthree obj1 = new Classthree(15) ; 
	}

}

class Classone{
	int a ; 
	Classone(int p){
		System.out.println("Class one with the value of "+p);
	}
}
class Classtwo extends Classone{
	Classtwo(){
		super(9) ; 
		System.out.println("Classtwo default constructor");
	}
}
class Classthree extends Classtwo{
	Classthree(){
		System.out.println("Class three default constructor");
	}
	Classthree(int a){
		System.out.println("Class three parameterized constructor with value "+a);
	}
} 