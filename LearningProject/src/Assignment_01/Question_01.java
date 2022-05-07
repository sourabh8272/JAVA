package Assignment_01;
	/*
	 * WAP which would contain 6 objects, of a class
	Student. Student [Name, Age, section, percentage]. They all belong to
	Section-A. Your program would be able to find the average percentage of
	students in this section. Use constructors to create these 6 objects and
	input from Scanner class.
	 */
	import java.util.Scanner ; 
	public class Question_01 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in) ; 
			Student s[] = new Student[6] ; 
			String name ; 
			int age ; 
			double p ; 
			for(int i=0; i<6 ; i++) {
				System.out.println("Enter the age, name and percentage ");
				age = sc.nextInt() ; 
				name = sc.nextLine() ; 
				sc.nextLine() ; 
				p = sc.nextDouble() ; 
			    s[i]= new Student(name, age, p) ; 
			}
			s[0].display(); 
		}

	}
	class Student
	{
		String name ;
		int age ; 
		static char section = 'A' ; 
		static double percentage ; 

		Student(String n, int a, double p){
			name = n ; 
			age = a ; 
			percentage += p ; 
		}
		void display()
		{
			System.out.println("Average percentage is "+percentage/6);
		}
	} 


