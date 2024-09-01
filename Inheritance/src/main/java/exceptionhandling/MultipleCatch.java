package exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=30/0;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}
