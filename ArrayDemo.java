public class ArrayDemo{
	public static void main(String[] a){
		int [] i={12,23,34,45,67};
		String name[]=new String[]{"ABC","LMN","PQR","XYZ","12"};
		for(String x : name){
			System.out.println(x);
		}
		for(int x=0;x<i.length;x++){
			System.out.println(i[x]);
		}
	}
}