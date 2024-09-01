package Selenium;

public class ArithmeticExceptions {
	public static void main(String args[])
	{
		try
		{
			String a="Anooj";
			int b=Integer.parseInt(a);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
	}

}
