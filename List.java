public class List {
     static int i;
     static String s;

    public List  method(int i,String s){
        List h=new List();
        h.i=i;
        h.s=s;

        return h;
    }

    public static void main(String[] args){

        List li=new List();
        li.method(12,"kkk");
        System.out.println(i);
         System.out.println(s);
        
    }

    
}
