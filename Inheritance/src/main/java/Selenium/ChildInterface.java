package Selenium;

public class ChildInterface implements IntParent1,IntParent2 {
	
	public void show()
	{
		System.out.println("Multiple Inheritance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildInterface obj=new ChildInterface();
		obj.show();

	}

}
