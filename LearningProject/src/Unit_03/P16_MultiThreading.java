package Unit_03;

import java.util.Scanner;

/*
 1. Multi-processing(3 types)
 	- Sequencial multi-processing
 	- parallel multi-processing
 	- Concurrent multi-processing
 
 2. Multi-Tasking(3 types)
 	- Sequencial multi-tasking
 	- Parallel multi-tasking
 	- Concurrent multi-tasking 
 */

//public class P16_MultiThreading {
//		public static void main(String[] args)
//		{
//			
//			MultiThreadingInJava obj = new MultiThreadingInJava();
//			obj.threadConcept();
//			obj.threadSynchronization();
//			obj.interThreadCommunication();
//			obj.ProducerConsumerProblems();
//			obj.Wait_And_Notify();
//		}
//}
//
//
//class MultiThreadingInJava
//{
//	void threadConcept()
//	{
//		
//	}
//	
//	void threadSynchronization()
//	{
//		
//	}
//	
//	void interThreadCommunication()
//	{
//		
//	}
//	
//	void ProducerConsumerProblems()
//	{
//		
//	}
//	
//	void Wait_And_Notify()
//	{
//		
//	}
//}

class C1
{
	void show1()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(a);
	}
}

class C2
{
	void show2()
	{
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Hey 2");
		}
	}
}

public class main {
	public static void main(String[] args)
	{
		C1 obj1 = new C1();
		C2 obj2 = new C2();
		
		C1.show1();
		C2.show2();
		
	}
}


class T1 extends Thread
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.println(r);
	}
}

class T2 extends Thread
{
	public void run()
	{
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Hey 2");
		}
	}
}

class T3 extends Thread
{
	public void run()
	{
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Hey 2");
		}
	}
}

public class sample {
	public static void main(String[] args)
	{
//		C1 obj1 = new C1();
//		C2 obj2 = new C2();
//		
//		C1.show1();
//		C2.show2();
//	
		// This code write for JVM
		
		Thread t1 = new Thread(new T1(),"T1");
		Thread t2 = new Thread(new T2(),"T2");
		Thread t3 = new Thread(new T3(),"T3");
		
		t1.run();
		t2.run();
		t3.run();
	}

}

