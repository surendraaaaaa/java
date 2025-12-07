public class Swapnumberswithouttemp{
public static void main(String[] args){
int a=150;
int b=13658563;

        System.out.println("After swapping the value of a = " + a);
        System.out.println("After swapping the value of b = " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		        System.out.println("After swapping the value of a = " + a);
        System.out.println("After swapping the value of b = " + b);
    }
}
