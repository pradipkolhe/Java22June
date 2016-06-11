
public class StringBufferMethod {

	public static void main(String[] args) {
		StringBuffer br=new StringBuffer("Hello java");
		System.out.println("Original value : "+br);
		System.out.println("Length : "+br.length());
		System.out.println("Insert : "+br.insert(6, "Wrold "));
		
		System.out.println("delete java : "+br.delete(12, 16));
		System.out.println("Reverse :"+br.reverse());
		System.out.println("Original value : "+br);
	}

}
