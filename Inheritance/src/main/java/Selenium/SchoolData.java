package Selenium;

public class SchoolData {
	
	StudentDetails studentdetails;
	String studentname;
	String location;
	SchoolData(String studentname,String location,StudentDetails studentdetails)
	{
		this.studentdetails=studentdetails;
		this.studentname=studentname;
		this.location=location;
	}
	public void Display()
	{
		System.out.println(studentname+ " "+location);
		System.out.println(studentdetails.rollno+" "+studentdetails.rank+" "+studentdetails.division);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDetails obj=new StudentDetails(2,1,"D");
SchoolData obj1=new SchoolData("Anooj","Trivandrum",obj);
obj1.Display();

	}

}
