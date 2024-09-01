package finalkeyword;

public class Final_Variable {
final String name="Anoop";
	//final keyword used means it will be constant
	public void display()
	{
		name="Anooj";
				System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Variable obj= new Final_Variable();
		obj.display();

	}

}
