package Assignment_01;
/*
 * 5Q. WAP in Java which would contain 8 objects of a Class Employee.
Employee contains name, age, department, salary. Your program would
be able to calculate the total salary to be paid in each department. Use
constructors to create these 8 objects and Scanner to take inputs.
Restrictions:
1- Minimum 8 objects [can be created manually with parameterized
constructors with Scanner input]
2- Departments are, A, B, C, D: minimum 4 departments [String Type]
3- If the Salary exceeds more than 30,000, then the default salary
would be 25000 of any of the employee
4- Use array of objects, instead of using multiple 8 objects separately
Use:
Employee arr[] = new Employee[8];
 */
import java.util.Scanner ; 
public class Question_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		Employee e[] =  new  Employee[8] ; 
		String n, d ; 
		int a  ; 
		double s ;
        for(int i=0; i<8; i++) {
        	System.out.println("Enter the name,Department, age and salary ");
        	n = sc.nextLine() ; 
        	d = sc.nextLine() ;
        	a = sc.nextInt() ; 
        	s = sc.nextDouble() ; 
        	e[i] = new Employee(n,d,a,s) ; 
        }
        e[0].display();  
	}

}
class Employee
{
	String name, department ; 
	int age ; 
	static double sa, sb, sc, sd ; 

	Employee(String n, String d, int a, double s ){
		name = n ; 
		department = d  ; 
		age = a ; 
		if(d.equals("A") || d.equals("a"))
		{
			sa += s ; 
		}
		else if(d.equals("B") || d.equals("b"))
		{
			sb += s ; 
		}
		else if(d.equals("C") || d.equals("c"))
		{
			sc += s ; 
		}
		else if(d.equals("D") || d.equals("d"))
		{
			sd += s ; 
		}
	}
	void display()
	{
		System.out.println("Salary of Department A is "+sa);
		System.out.println("Salary of Department B is "+sb);
		System.out.println("Salary of Department C is "+sc);
		System.out.println("Salary of Department D is "+sd);
	}
} 