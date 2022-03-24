package Unit_01;

public class P2_Task02_ConstantInJava {
	
	public static final double Pi = 3.14;

	public static void main(String[] args) {
		System.out.println(Pi);
		main("This is Java Programming");
		
		NewClass obj = new NewClass();
		obj.display(1,2);
		System.out.println(Pi);
		
	}
	
	public static void main(String args) {
		System.out.println(Pi);
		
	}
	
	void add(int a,int b) {
		System.out.println(a + b);
		System.out.println(Pi);
		
	}

}

class NewClass{
	void display(int a, int b)
	{   //final double Pi = 3.14;
		System.out.println(a + b);
		System.out.println(P2_Task02_ConstantInJava.Pi);
	}
	
}
