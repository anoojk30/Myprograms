package exceptionhandling;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int arr1[]=new int[5];
			arr1[8]=20;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
			System.out.println(e);
		}

	}

}
