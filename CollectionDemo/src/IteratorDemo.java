import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(2314);
		list.add("abc");
		list.add("xyz");
		list.add('X');
		list.add(234.231);
		list.add(true);
		//System.out.println(list);
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
