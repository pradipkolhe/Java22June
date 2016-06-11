
public class StringMethods {

	public static void main(String[] args) {
		String s="Hello Java World";
		System.out.println("Original String : "+s);
		System.out.println("Length of string : "+s.length());
		System.out.println("Sub String : "+s.substring(6,10));
		System.out.println("Reverse String");
		char[] ch=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("Word Reverse");
		String sc[]=s.split(" ");
		for(int i=sc.length-1;i>=0;i--){
			System.out.print(" "+sc[i]);
		}
		System.out.println();
		System.out.println("replace Java to Program");
		System.out.println(s.replaceAll("World","Program"));
		System.out.println("Index of J : "+s.indexOf("J"));
		System.out.println("Concat : "+s.concat(" Bye"));
		System.out.println("Original String : "+s);
		
	}

}
