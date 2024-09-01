package exceptionhandling;

public class ThrowExample1 {
	
	public void check(int age)
	{
		if(age<18)
		{
			System.out.println("Person is Eligible");
		}
		else
		{
			System.out.println("Person is not Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowExample1 obj = new ThrowExample1();
obj.check(19);
	}

}
