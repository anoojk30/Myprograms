package myinheritanceprograms;

public class Jasmine extends Flower {
	public void petals() {
		System.out.println("White");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jasmine obj = new Jasmine();
		obj.leaf();
		obj.petals();
		Rose obj1= new Rose();
		obj1.leaf();
		obj1.colour();
	}

}
