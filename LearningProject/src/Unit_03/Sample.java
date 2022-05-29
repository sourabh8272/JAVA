package Unit_03;
import java.io.IoException;
import java.util.ImputMismatchEcepion;
public class Sample {

	public static void main(String[] args) {
		try {
			int a=100/0;
			System.out.println("a is : "+a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
		
		finally {		// If there is no exception  
			System.out.println("Done");
		}


	}

}
