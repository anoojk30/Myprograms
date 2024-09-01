package abstraction;

public class NotAbstractClass extends AbstractClass {
	void show()
	{
		System.out.println("Abstract Method Implementation");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass obj=new NotAbstractClass();
		obj.show();
		obj.display();

	}

}
