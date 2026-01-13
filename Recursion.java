public class Recursion {


public static void method(int n){

    if(n==11){
        return ;
    }
    
 System.out.println(n);
    method(n+1);
   
    

}


public static void main(String[] args){
    method(1);
}
    
}
