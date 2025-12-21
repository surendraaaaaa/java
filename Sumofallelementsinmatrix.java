public class Sumofallelementsinmatrix{
public static void main(String[] args){

int[][] mat={{1,2,3},{1,2,3},{1,2,3}};

int sum=0;

for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
sum=sum+mat[i][j];
}
}
System.out.println("Sum of all elements in an array:"+sum);
}
}



