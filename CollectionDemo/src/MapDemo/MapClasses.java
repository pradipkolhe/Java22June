package MapDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapClasses {
	public static void main(String[] args) {
		MapClasses m=new MapClasses();
		m.hashMap();
		m.linkedHashMap();
		m.treeMap();
		m.hashTable();

	}
	public void hashMap(){
		System.out.println("--------------HashMap-----------------");
		HashMap map=new HashMap();
		map.put(12, "ABC");
		map.put('A', "lmn");
		map.put(12, "PQR");
		map.put(true, 12.21);
		map.put("abc", "ABC");
		map.put("ppp", 12);
		map.put("abc", 12);
		map.put("ppp", null);
		map.put(null, null);
		System.out.println(map);
		//System.out.println("map Key : "+map.keySet());
		//System.out.println("Values : "+map.values());
	}
	public void linkedHashMap(){
		System.out.println("--------------LinkedHashMap-----------------");
		LinkedHashMap map=new LinkedHashMap();
		map.put(12, "ABC");
		map.put('A', "lmn");
		map.put(12, "PQR");
		map.put(true, 12.21);
		map.put("abc", "ABC");
		map.put("ppp", 12);
		map.put("abc", 12);
		map.put("ppp", null);
		map.put(null, null);
		System.out.println(map);
		//System.out.println("map Key : "+map.keySet());
		//System.out.println("Values : "+map.values());
	}
	public void treeMap(){
		System.out.println("--------------TreeMap-----------------");
		TreeMap map=new TreeMap();
		map.put(12, "ABC");
		map.put(1, "lmn");
		map.put(12, "PQR");
		map.put(-10, 12.21);
		map.put(11, "ABC");
		map.put(5, 12);
		map.put(101, 12);
		map.put(99, null);
		//map.put(null, null);
		System.out.println(map);
	}
	public void hashTable(){
		System.out.println("--------------Hashtable-----------------");
		Hashtable map=new Hashtable();
		map.put(12, "ABC");
		map.put('A', "lmn");
		map.put(12, "PQR");
		map.put(true, 12.21);
		map.put("abc", "ABC");
		map.put("ppp", 12);
		map.put("abc", 12);
		//map.put("ppp", null);
		//map.put(null, null);
		System.out.println(map);
		System.out.println("map Key : "+map.keySet());
		System.out.println("Values : "+map.values());
	}
	
}

