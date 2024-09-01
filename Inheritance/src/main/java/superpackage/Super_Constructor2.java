package superpackage;

public class Super_Constructor2 extends Super_Constructor1 {

	Super_Constructor2()
	{
		//super();constructor can't override compiler will automaticalt
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super_Constructor2 obj=new Super_Constructor2();
		
		//obj. is not created as constructor will automatically calls
	}

}
