package collection;

import java.util.LinkedList;


public class LinkedListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("India");
		obj.add("Austalia");
		obj.add("Nepal");
		obj.add("England");
		//obj.addFirst("Spain");
		//System.out.println(obj);
		//obj.addLast("Italy");
		//System.out.println(obj);
		//obj.removeFirst();
		//System.out.println(obj);
		//obj.removeLast();
		//System.out.println(obj);
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		

	}

}
