package myinheritanceprograms;

public class BabyDog extends Dog{
	public void sleep() {
		System.out.println("Sleeping");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog obj = new BabyDog();
		obj.sleep();
		obj.bark();
		obj.run();
	}

}