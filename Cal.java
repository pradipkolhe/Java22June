class Cal{
	int a=10;
	int b=12;
	public static void main(String a[]){
		Cal c; // declaration
		c=new Cal(); // object (instance) and init
		c.add(); // access method of Cal class
		c.sub(10,5);
		int x=c.div();
		System.out.println("Div : "+x);
		int l=122;
		int m=23;
		int y=c.mul(l,m);
		System.out.println("Mul : "+y);
		System.out.println(c.b);//access variable of cal class
	}
	public void add(){
		int c=a+b;
		System.out.println("Add : "+c);
	}
	public void sub(int x,int y){
		int c=a-b;
		System.out.println("Sub : "+c);
		return;
	}
	public int div(){	
		//int z[]={12,234,3425,465};
		int c=a/b;
		return c;
	}
	public int mul(int p,int q){
		int c=p*q;
		return c;
	}
}