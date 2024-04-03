package myinheritanceprograms;

public class Rose extends Flower{
	public void colour() {
		System.out.println("Red");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose obj = new Rose();
		obj.leaf();
		obj.colour();
	}

}