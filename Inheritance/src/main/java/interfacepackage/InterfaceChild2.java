package interfacepackage;

public class InterfaceChild2 implements InterfaceParent {
	public void show()
	{
		System.out.println("ChildTwo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceParent obj=new InterfaceChild2();
		obj.show();

	}

}
