	package interfacepackage;

public class ChildInterface implements ParentInterface1,ParentInterface2 {
	public void display()
	{
		System.out.println("Multiple Interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildInterface obj=new ChildInterface();
obj.display();
	}

}
