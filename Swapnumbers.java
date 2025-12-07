public class Swapnumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping the value of a = " + a);
        System.out.println("Before swapping the value of b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping the value of a = " + a);
        System.out.println("After swapping the value of b = " + b);
    }
}
