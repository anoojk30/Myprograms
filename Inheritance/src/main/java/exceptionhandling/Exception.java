package exceptionhandling;

public class Exception {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try
		{
			String a=null;
			System.out.println(a.length());
		//int a=10/0;
			//int arr1[]=new int[5];
		//arr1[20]=3;
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception Handled");
			System.out.println(e);
			
			
		}
	//	finally
		{
		//	System.out.println("ImportantCode");
		}
		

	}

}
