public class Child extends Parent {

    int i=3212;
    int j=3222;

    Child(){
        //super();
        System.out.println("surendra");
    }

    public void parentmethod(){
        super.parentmethod();
        System.out.println("suremdra");
        System.out.println(super.i);
    }

    public static void main(String[] args){
        Child ch=new Child();
        ch.parentmethod();
        System.out.println(ch.i);
       // System.out.pprintln(super.ch.i);

       
        
    }
}
