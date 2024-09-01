package Instance;

public class InstanceMethodTypes {
	
	public int add(int a, int b)
	{
	int sum=a+b;
	return sum;

	}
	public void mul()
	{
	int c=10;
	int d=5;
	int e=c*d;
	System.out.println (e);
	}

	public static void main(String[] args) {
		InstanceMethodTypes obj=new InstanceMethodTypes();
		System.out.println(obj.add(4,5));
		obj.mul();
		
	}

}
