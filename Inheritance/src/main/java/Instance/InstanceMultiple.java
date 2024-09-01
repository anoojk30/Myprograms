package Instance;

public class InstanceMultiple {
	public void add(int a,int b)
	{
	int sum=a+b;
	System.out.println(sum);
	}
	public int mult(int a,int b)
	{
		int mult=a*b;
		return mult;
	}
	public void sub()
	{
	int a=10,b=5;
	int c=a-b;
	System.out.println(c);
	}
	public void display(String a, String b)
	{
		System.out.print(a+ "  "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMultiple obj=new InstanceMultiple();
		obj.add(4, 5);
		System.out.println(obj.mult(4, 5));
		obj.sub();
		obj.display("Anooj", "K");

	}

}
