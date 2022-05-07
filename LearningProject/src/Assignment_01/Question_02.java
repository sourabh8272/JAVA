package Assignment_01;

	//*WAP to count the total number of calls for a member function from
	//*more than one objects. [Let’s say, from 3 such Objects]

	public class Question_02 {

		public static void main(String[] args) {
			ABC o1 = new ABC() ; 
			ABC o2 = new ABC() ; 
			ABC o3 = new ABC() ; 
			ABC o4 = new ABC() ; 
			o1.func();  
			o2.func(); 
			o3.func(); 
			o4.func(); 
			o1.display(); 
		}

	}
	class ABC {
		static int c ; 
		void func()
		{
			c++ ; 
		}
		void display()
		{
			System.out.println("Total number of count "+c);
		}
	} 


