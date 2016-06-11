package SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClasses {
	public static void main(String[] args) {
		SetClasses s=new SetClasses();
		s.hashSet();
		s.linkedHashSet();
		s.treeSet();
	}	
	public void hashSet(){
		System.out.println("-----------------HashSet--------------");
		HashSet set=new HashSet();
		set.add(12);
		set.add("ABC");
		set.add(12.2);
		set.add(true);
		set.add(12);
		set.add("ABC");
		System.out.println("Hash Set element : "+set);
		System.out.println("Hash Set size : "+set.size());
	}
	public void linkedHashSet(){
		System.out.println("-----------------LinkedHashSet--------------");
		LinkedHashSet set=new LinkedHashSet();
		set.add(12);
		set.add("ABC");
		set.add(12.2);
		set.add(true);
		set.add(12);
		set.add("ABC");
		System.out.println("LinkedHashSet element : "+set);
		System.out.println("LinkedHashSet size : "+set.size());
	}
	public void treeSet(){
		System.out.println("-----------------TreeSet--------------");
		TreeSet set=new TreeSet();
		set.add("ABC");
		set.add("APER");
		set.add("PQR");
		set.add("XYZ");
		set.add("ZZZ");
		System.out.println("TreeSet element : "+set);
		System.out.println("TreeSet size : "+set.size());	
	}

}
