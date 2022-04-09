package Unit_01;

/* Problem Statement: P7_SwitchStatements: 
Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
* */
import java.util.Scanner;
public class P7_Task01_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		Scanner sc=new Scanner(System.in);
		int c;
		System.out.println("1.Current year\n2.Current month \n3.Current day \n4.Not applicable");
		do{
			System.out.print("enter your choice: ");
		
			c=sc.nextInt();
		
			switch(c) {
			case 1: System.out.println("Year=2022"); break;
			case 2: System.out.println("Month=April"); break;
			case 3: System.out.println("Day=9"); break;
			case 4: System.out.println("Not applicable"); break;
			}
		
		}while(c!=0);	
	}
}
