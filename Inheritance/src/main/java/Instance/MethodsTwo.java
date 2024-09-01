package Instance;

public class MethodsTwo {
	
	public void display(String a)
	{
		System.out.println(a);
	}
	public int sub(int a, int b)
	{
		int sub=a-b;
		return sub;
	}
	public void add()
	{
		int a=5,b=10;
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsTwo obj=new MethodsTwo();
		obj.add();
		obj.display("Anooj");
System.out.println(obj.sub(10, 5));
	}

}
