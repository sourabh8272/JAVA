package Unit_03;

import java.io.BufferedWriter;
import java.io.IOException;

public class P15_FileHandling {

	public static void main(String[] args) {
		
		FileHandlingInJava obj= new FileHandlingInJava();
		//obj.takeInputFromAFileNotFromConsole();
		obj.saveOutputIntoAFile();
		obj.saveLogOfProgram();
		

	}

}

class FileHandlingInJava
{
//	void takeInputFromAFileNotFromConsole()
//	{
//		String file1="C:\\Users\\DELL\\git\\JAVA\\LearningProject\\src\\Unit_03\\input.txt";
//		File file = new File(file1);
//		
//		BufferedReader br = new BufferedReader(new FileReader(file));
//		
//		String st;
//		while((st=br.readLine())!=null)
//		{
//			System.out.println(st);
//		}
//		
//		// List that hold string of a file
//		List<string> listOfStrings = new ArrayList<string>();
//		
//		// Read entire the line as string
//		String line = br.readLine();
//		
//		while(line!=null) {
//			listOfStrings.add(line);
//			line = br.readLine();
//		}
//		
//		for(String str : listOfStrings) {
//			System.out.println(str);
//		}
//		System.out.println("\n");
//		br.close();
//		
//	}
	
	void saveOutputIntoAFile()
	{
		FileWriter myObj = null;
		try
		{
			myObj = new FileWriter("output.txt");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		BufferedWriter f_writer = new BufferedWriter(myObj);
		String text = "Hey this would store in output file";
		f_writer.write(text);
		f_writer.close();
		
	}
	
    void saveLogOfProgram() throws IOException {
		
		a++;
		
		//Find current time and Date
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("log.txt",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

		try {
			f_writer.write("Value of a: " + a + ", ");
			f_writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f_writer.close();

	}

}
