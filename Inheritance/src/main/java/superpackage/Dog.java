package superpackage;

public class Dog extends Animal{
int a=10;
public void show()
{
	System.out.println(super.a);
	//Super keyword is used to refer immediate parent class instance variable
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog();
		obj.show();

	}

}
