package collection;

import java.util.*;//* to give all import

public class SetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj=new HashSet<String>();//direct set interface cant be created so Hashset class name is defined
		obj.add("India");
		obj.add("Austalia");
		obj.add("Nepal");
		obj.add("England");
		//System.out.println(obj);
		//obj.clear();
		//System.out.println(obj);
		//System.out.println(obj.contains("India"));

		//System.out.println(obj.size());
		//System.out.println(obj.contains("India"));
		//obj.remove("England");
		//System.out.println(obj);
		Iterator itr=obj.iterator();
		while(itr.hasNext())//hasNext to point next element
		{
			System.out.println(itr.next());
		}

	}

}
