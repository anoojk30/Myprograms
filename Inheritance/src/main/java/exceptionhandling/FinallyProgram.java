package exceptionhandling;

public class FinallyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=20/0;
		}
		catch(ArithmeticException e)
				{
			System.out.println("Exception Handled");
			System.out.println(e);
				}
		finally
		{
			System.out.println("Important code");
		}

	}

}
