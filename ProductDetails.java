import java.util.Scanner;

public class ProductDetails {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Products You Want : ");
        int numberOfProducts=sc.nextInt();
        Products[] product=new Products[numberOfProducts];
        for (int i = 0; i < product.length; i++) {
            System.out.println("Enter Brand Name : ");
            String brand=sc.next();
            System.out.println("Enter description : ");
            String description=sc.next();
            System.out.println("Enter Price : ");
            double price=sc.nextDouble();

            product[i]=new Products(brand,description,price);
        }


            for(Products x:product){
                System.out.println(x);
            }
//        for(int i=0;i<product.length;i++){
//            System.out.println(product[i]);
//        }
    }
}
