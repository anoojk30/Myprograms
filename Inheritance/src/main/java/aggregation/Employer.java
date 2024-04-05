package aggregation;

public class Employer {
	Address address;
	int id;
	String name;
	Employer(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println(id + " " +name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Address obj=new Address("Trivandrum","Kerala","India");
Employer emp=new Employer(1,"Anooj",obj);
emp.display();
	}

}
