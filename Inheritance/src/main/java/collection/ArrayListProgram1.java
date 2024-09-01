package collection;

import java.util.ArrayList;

public class ArrayListProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("India");
		obj.add("Austalia");
		obj.add("Nepal");
		obj.add("England");
		//System.out.println(obj);
		//System.out.println(obj.get(2));
		//obj.set(1, "America");
		//System.out.println(obj);
		//obj.remove(3);
		//System.out.println(obj);
		//obj.clear();
		//System.out.println(obj);
		//System.out.println(obj.size());
		//for(String a:obj)//for each loop to print one by one syntax having only for with a new variable
		//{
			//System.out.println(a);
		//}
		for( int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		

	}

}
