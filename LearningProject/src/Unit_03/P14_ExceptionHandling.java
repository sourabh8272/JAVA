package Unit_03;
import java.util.*;

import java.util.Scanner;

public class P14_ExceptionHandling {

	public static void main(String[] args) {
		exception obj=new exception();
		
		obj.basicException();
		obj.handleException();
		obj.multipleCatch();
		obj.inputMismatchException();
		obj.stackOverFlowError(2);
		obj.indexOutOfBoundException();
		obj.nullPointerException();
		obj.useOfThrow();
		obj.useOfThrowsandFinally();

	}

}

class exception
{
	void basicException() {
		int b=0;
		int a=10/b;
		System.out.println(a);
		System.out.println("Done!");
		
	}
	void handleException() {
		try {
			int b=0;
			int a=10/b;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Done!");
		}
		
	}
	void multipleCatch() {
		try {
			int b=0;
			int a=10/b;
			System.out.println(a);
		}								// child class exception come first
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+"Arithmetic!!!");
			System.out.println("Done!");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+"exception!!!");
		}
		
		
	}
	void inputMismatchException() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int a = sc.nextInt();
			System.out.println("Entered number is "+a);
		}
		catch(inputMismatchException e)
		{
			System.out.println(e +"Resolved");
		}
		System.out.println("Done!");
		
	}
	void stackOverFlowError(int i) {
		try 
		{
			while(i>0) {
				i++;
				stackOverFlowError(i);   
			}
		}
		//This is error cann't resolved because it is not a exception 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
		
	}
	
	void indexOutOfBoundException() {
		try {
			int num[]= {1,2,3,4};
			System.out.println(num[10]);
		} 
		catch(indexOutOfBoundException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	void nullPointerException() {
		// Related to class string is class in java so without object can declare
		try {
			String a=null;
			System.out.println(a.length());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("other code");
		
	}
	void useOfThrow(int age) throws Exception { 
		// check exception gives exception at compile time 
		if(age<18)
		{
			throw new Exception();
		}
		else
		{
			System.out.println("You allow");
		}
		
	}
	void useOfThrowsandFinally(){
		try {
			useOfThrow(17);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This will definitely run.");
		}
	}
}
