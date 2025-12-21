public class Method{
	int i;
	int j;
	String s;
	
	public void obj(){
		i=20;
		j=30;
		int n=20;
		
		 s="surendra";
		System.out.println(s);
	}
	public static void main(String[] args){
	
		Method m=new Method();
	    System.out.println(m.i);//0
		System.out.println(m.j);//0
		System.out.println(m.s);//null
		
		m.obj();//surendra
		System.out.println(m.s);//surendra
		System.out.println(m.i);//20
		System.out.println(m.j);//0
		System.out.println(m.n);
		
	}
}



