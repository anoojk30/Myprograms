package Instance;

public class StudentDetailss {
	String n;
	int r;
	StudentDetailss(String name,int rollnumber)
	{
		n=name;
		r=rollnumber;
	}
	public void display()
	{
		System.out.println(n+" "+r);
	}
	
	public static void main(String[] args) {
		
		StudentDetailss obj1=new StudentDetailss("Anooj",2);
		StudentDetailss obj2=new StudentDetailss("Anoop",3);
		obj1.display();
		obj2.display();
	

	}

}
