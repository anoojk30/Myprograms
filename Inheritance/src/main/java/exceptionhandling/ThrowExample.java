package exceptionhandling;

public class ThrowExample {
	public void check(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("Person is not eligible");
			
	}
	else
	{
		System.out.println("Person is eligible");
	}
	}
public static void main(String args[])
{
	ThrowExample obj =new ThrowExample();
	obj.check(16);
}
}

