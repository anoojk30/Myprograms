package Selenium;

public class AbsChild2 extends AbsParent {
	
	public void show()
	{
		System.out.println("AbstractChild2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsParent obj=new AbsChild1();
		obj.show();

	}

}
