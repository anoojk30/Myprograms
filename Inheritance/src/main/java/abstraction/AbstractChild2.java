package abstraction;

public class AbstractChild2 extends AbstractParent1{
	void show()
	{
		System.out.println("Abstract Method defined");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubH
		AbstractParent1 obj =new AbstractChild1();
		obj.show();

	}

}
