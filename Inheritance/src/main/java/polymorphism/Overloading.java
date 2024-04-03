package polymorphism;

public class Overloading {
		
		public void display(int a,float b) {
			System.out.println("Two arguments "+a+", "+b);
		}
		public void display(int a) {
			System.out.println("One argument "+a);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Overloading obj = new Overloading();
			obj.display(5,2.5f);
			obj.display(5);
		}

	}


