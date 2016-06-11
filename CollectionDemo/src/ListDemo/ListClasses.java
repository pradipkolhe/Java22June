package ListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListClasses {
	public static void main(String[] args) {
		ListClasses l=new ListClasses();
		l.arrayList();
		l.vector();
		l.linkedList();
	}
	
	public void arrayList(){
		System.out.println("------------ArrayList------------");
		ArrayList list=new ArrayList();
		list.add(12);
		list.add(12.1);
		list.add("ABC");
		list.add(true);
		list.add('X');
		list.add(12);
		list.add("ABC");
		System.out.println("Array List Elements : "+list);
		System.out.println("Array List Size before add : "+list.size());
		list.add(3,"XYZ");
		System.out.println("Array List Elements : "+list);
		System.out.println("Array List Size After add : "+list.size());
		System.out.println(list.remove("ABC"));
		System.out.println("Array List Size After remobe ABC : "+list);
	}
	public void vector(){
		System.out.println("------------Vector------------");
		Vector list=new Vector();
		list.add(12);
		list.add(12.1);
		list.add("ABC");
		list.add(true);
		list.add('X');
		list.add(12);
		list.add("ABC");
		System.out.println("Vector Elements : "+list);
		System.out.println("Vector Size before add : "+list.size());
		list.add(3,"XYZ");
		System.out.println("Vector Elements : "+list);
		System.out.println("Vector Size After add : "+list.size());
		System.out.println(list.remove("ABC"));
		System.out.println("Vector Size After remobe ABC : "+list);
	}
	public void linkedList(){
		System.out.println("------------LinkedList------------");
		LinkedList list=new LinkedList();
		list.add(12);
		list.add("ABC");
		list.add(23.1);
		System.out.println("LinkedList Elements : "+list);
		list.push("XYZ");
		System.out.println("LinkedList Elements after Push : "+list);
		System.out.println("pop element : "+list.pop());
		System.out.println("LinkedList Elements after Pop : "+list);
		System.out.println("poll Elemet : "+list.poll());
		System.out.println("LinkedList Elements after poll : "+list);
		System.out.println("peek Elemet : "+list.peek());
		System.out.println("LinkedList Elements after peek : "+list);
	}
}
