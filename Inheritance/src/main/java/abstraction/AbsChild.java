package abstraction;

public class AbsChild extends AbsParent {
	void show()
	{
		System.out.println("Anooj");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsParent obj = new AbsChild();
obj.display();
obj.show();
	}

}
