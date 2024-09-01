package Instance;

public class StudentDetails 
	
	{
		String n;
		int r;
		StudentDetails(String name,int rollNumber)
		{
		n=name;
		r=rollNumber;
		}
		public void display()
		{
		System.out.println(n+" "+r);
		}
		public static void main(String args[])
		{
		StudentDetails obj1 = new StudentDetails("Anooj",2);
		StudentDetails obj2 = new StudentDetails("Anoop",3);
		obj1.display();
		obj2.display();
		}
		}

