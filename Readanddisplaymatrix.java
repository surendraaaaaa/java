import java.util.Scanner;
public class Readanddisplaymatrix{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter how many rows you want");
int rows=sc.nextInt();
System.out.println("Enter how many columns you want");
int columns = sc.nextInt();

int[][] mat=new int[rows][columns];

System.out.println("enter matrix elements:");

for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){
mat[i][j]=sc.nextInt();
}
}

for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){
System.out.print(mat[i][j]+" ");
}
System.out.println();
}
}
}



