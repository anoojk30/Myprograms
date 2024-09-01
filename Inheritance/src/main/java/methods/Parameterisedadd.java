package methods;

public class Parameterisedadd {
	
	public static void display()
	{
		int a=5;
		float b=2.5f;
		float sum;
		sum=a+b;
		System.out.println("Sum is"+ "  "+sum);
		
	}
	
public static void add(int a, int b)
{
	int c=a+b;
	System.out.println("Sum is " +c);
}

public static int mult(int a, int b)
{
	int mult=a*b;
	return mult;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterisedadd.display();
		Parameterisedadd.add(4,5);
		System.out.println(Parameterisedadd.mult(5,4));

	}

}
