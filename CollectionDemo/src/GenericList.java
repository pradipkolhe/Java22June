import java.util.ArrayList;
import java.util.Iterator;


public class GenericList {

	public static void main(String[] args) {
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("ABC");
		nameList.add("PQR");
		nameList.add("XYZ");
		nameList.add("LMN");
		nameList.add("XYZ");
		nameList.add("STU");
		
		Iterator<String> it=nameList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
