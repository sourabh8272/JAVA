package Assignment_01;
/*Given an interface in1 which includes a method display which takes
an integer as input .
interface In1
{
void display(int p);
}
Task is to write a class testClass which implements interface In1 and has
a method named display which takes an integer as an input p and the
display method should be able to tell if the number is prime or not?
- The main method should not be in testClass, create a separate class for
that.*/
public class Question_03 {
       public static void main(String []args) {
    	   Testclass o1 = new Testclass() ; 
    	   o1.display(11);
       }
}
interface In1{
	void display(int p) ; 
}
class Testclass implements In1{
	public void display(int p)
	{
		int c = 0, i ; 
		for(i=2; i<p/2; i++)
		{
			if(p%i==0)
			{
				c++ ; 
			}
		}
		if(c==0)
		{
			System.out.println("Number is prime");
		}
		else 
		{
			System.out.println("Number is not prime");
		}
	}
} 
