import java.util.Scanner;
public class Sumofeachrowandcolumnvalues{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of rows:");
int rows=sc.nextInt();
System.out.println("enter no.of columns:");
int columns=sc.nextInt();

int[][] mat=new int[rows][columns];

System.out.println("enter array elements:");

for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){
mat[i][j]=sc.nextInt();
}
}

for(int i=0;i<rows;i++){
int rowsum=0;
for(int j=0;j<columns;j++){
rowsum=rowsum+mat[i][j];
}
System.out.println("sum of row"+(i+1)+" "+rowsum);
}
for(int j=0;j<columns;j++){
int columnsum=0;
for(int i=0;i<rows;i++){
columnsum=columnsum+mat[i][j];
}
System.out.println("sum of column"+(j+1)+" "+columnsum);
}
}
}


 