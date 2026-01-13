public class Fact {

   static int result=1;
    public static void method(int n){
        
        if(n==0){
            System.out.println(result);
            return;

        }

        result=result*n;
       method(n-1);
    }

    public static void main(String[] args){
        method(5);
    }

    
}
