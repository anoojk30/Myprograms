package exceptionhandling;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String a="Anooj";
			int b=Integer.parseInt(a);//exception while converting string to number format 
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
		

	}

}
