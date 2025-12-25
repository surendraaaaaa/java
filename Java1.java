public class Java1 extends Java {

     public Java1(String s){

        super(55);

        System.out.println(s);

      }

      public void kkk(){
        super.lin();
        System.out.println("kdkdkkd");
      }

    public static void main(String[] args){
       Java1 ja=new Java1("sure");
         System.out.println(ja.i);
        System.out.println(ja.s);

        boolean b=ja.method(20,"xkjkxse");
        System.out.println(b);
        ja.kkk();
        ja.lin();       
    }
    
}
