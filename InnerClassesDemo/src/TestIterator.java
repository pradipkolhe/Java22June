public class TestIterator {
	public static void main(String[] args) {	
		ArrayList list=new ArrayList();
		Iterator it=list.iterator();
		it.hasNext();
		it.next();
	}
}

interface Iterator{
	public boolean hasNext();
	public Object next();
}

class ArrayList {
	public Iterator iterator(){
		Iterator it=new Iterator() {
			@Override
			public Object next() {
				System.out.println("next method");
				return null;
			}
			
			@Override
			public boolean hasNext() {
				System.out.println("hasNext method");
				return false;
			}
		};
		return it;
	}
}