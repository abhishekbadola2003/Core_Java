[9:22 pm, 29/05/2022] Kaadu Clg: package Unit_03;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * The Exception Handling in Java is one of the powerful mechanism to handle 
 * the runtime errors so that the normal flow of the application can be maintained.
 * 
 * Exception Handling is a mechanism to handle runtime errors 
 * such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
 * 
 * Advantage of Exception Handling
 *-The core advantage of exception handling is to maintain the normal flow of the application.
 *-An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions.
 *
 *There are mainly two types of exceptions: checked and unchecked. 
 *An error is considered as the unchecked exception. 
 *However, according to Oracle, there are three types of exceptions namely:
 *1.Checked Exception:
 *-The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
 *-For example, IOException, SQLException, etc.
 *-Checked exceptions are checked at compile-time.
 *
 *2.Unchecked Exception:
 *-The classes that inherit the RuntimeException are known as unchecked exceptions. 
 *-For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
 *-Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
 *
 *3.Error:
 *-Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.
 *-Errors cannot be handled
 *-for example when stackOverFlow occurs we can not handle it as memory can not be increased
 *
 *
 *Java Exception Keywords::
 *
 *-Java provides five keywords that are used to handle the exception. The following table describes each.
 **Keyword	Description
 *
 *-try	    The "try" keyword is used to specify a block where we should place an exception code. 
 *			It means we can't use try block alone. The try block must be followed by either catch or finally.
 *
 *-catch	The "catch" block is used to handle the exception. 
 *			It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
 *
 *-finally	The "finally" block is used to execute the necessary code of the program. 
 *			It is executed whether an exception is handled or not.
 *
 *-throw	The "throw" keyword is used to throw an exception.
 *
 *-throws	The "throws" keyword is used to declare exceptions. 
 *			It specifies that there may occur an exception in the method. 
 *			It doesn't throw an exception. It is always used with method signature.
 *
 */


public class P14_ExceptionHandling {

	public static void main(String[] args) {
		
		ExceptionsInJava obj= new ExceptionsInJava();
		
		//obj.basicException();
		obj.handleException();
		obj.multipleCatch();
		obj.inputMismatchException();
		obj.indexOutOfBoundException();
		//obj.stackOverFlowError();
		obj.nullPointerException();
		obj.useOfThrow(12);
		obj.useOfFinally();
		obj.checkedAndUncheckedException();
		obj.usingMyExeption(-7);
	
		
		System.out.println("Program Done!");

	}

}

class ExceptionsInJava
{
	
	void basicException()
	{
		//ArithmeticException
		//compiler cannot catch this exception at compile time
		
			int b=0;
			int a=5/b;                          //code breaks at this line
			System.out.println("5/0="+a);
		
		
	}
	
	 void handleException()
	 {
		 	//ArithmeticException
			//compiler cannot catch this exception at compile time
			try
			{
				int b=0;
				int a=5/b;                          //code breaks at this line and exception is thrown
				System.out.println("5/0="+a);
			}
			catch(ArithmeticException e)
			{
				//Thrown when an exceptional arithmetic condition has occurred.
				//For example, an integer "divide by zero" throws an instance of this cla…
[9:22 pm, 29/05/2022] Kaadu Clg: package Unit_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/*
 * - Byte and Character Streams
 * - Reading and writing from console and file
 * */

public class P15_FileHandling_In_Java {

	public static void main(String[] args) throws IOException {

		ABCDEF obj = new ABCDEF();
		obj.takeInputFromAFile();
		// obj.saveOutputIntoAFile();
		// obj.saveLogOfProgram();

	}

}

class ABCDEF {
	
	static int a = 10;

	void takeInputFromAFile() throws IOException {

		String path = "/Users/akashchauhan/git/FirstJavaBasedProject/JavaBasicProject/src/Unit_03/Input.txt";
		File file = new File(path);

		BufferedReader br = new BufferedReader(new FileReader(file));

//		String st;
//		while ((st = br.readLine()) != null) {
//			System.out.println(st);
//		}

		// list that holds strings of a file
		List<String> listOfStrings = new ArrayList<String>();

		// read entire line as string
		String line = br.readLine();

		while (line != null) {
			listOfStrings.add(line);
			line = br.readLine();
		}

		for (String str : listOfStrings) {
			System.out.println(str);
		}
		System.out.println("\n");
		br.close();
	}

	void saveOutputIntoAFile() throws IOException {

		FileWriter myObj = null;

		try {
			myObj = new FileWriter("output.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "Hey this would store in Output file";

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