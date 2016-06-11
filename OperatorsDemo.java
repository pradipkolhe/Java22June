public class OperatorsDemo{
	public static void main(String a[]){
		int x=10;
		int y=5; 
		byte b=123;		

		System.out.println(x+y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//b=b+1;
		b+=1; // b=b+1;
		System.out.println(b);

		System.out.println(x>y);
		
		System.out.println(x | y);
		System.out.println(true & !false);
		System.out.println((x>10) & (x<y));

		System.out.println(x >> 2);// number /2^bits
		System.out.println(y << 2);// number *2^bits

		System.out.println(y++); // y=y+1
		System.out.println(--y); // y=y-1

		x=x++ + ++x - --x + x++;
		System.out.println(x);
		
		int m=10;
		int n=5;
		System.out.println((++m < n) || (m++ > n++));
		System.out.println(m);
		System.out.println(n);

		int p=10;
		int q=5;
		int c= p+q*10/5-q;
		System.out.println(c);			
	}
}l