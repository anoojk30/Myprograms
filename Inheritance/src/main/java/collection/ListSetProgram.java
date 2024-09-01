package collection;

import java.util.ArrayList;
import java.util.List;

public class ListSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> obj=new ArrayList<String>();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Guava");
		obj.add("Grapes");
		obj.set(2, "Rose");
		System.out.println(obj);
	}

}
