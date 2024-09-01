package interfacepackage;

public class InterfaceMultiChild implements InterfaceMulti2{
	
	public void show()
	{
		System.out.println("Show method");
	}
	public void display()
	{
		System.out.println("Display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMultiChild obj= new InterfaceMultiChild();
		obj.display();
		obj.show();
		
//multilevel inheritance program created using interface
	}

}
