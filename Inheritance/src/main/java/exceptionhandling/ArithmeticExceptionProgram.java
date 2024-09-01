package exceptionhandling;

public class ArithmeticExceptionProgram {
	public static void main(String args[])
	{
		try {
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
			System.out.println(e);
		}
	}

}
