public class Array3Danothermethod{
public static void main(String[] args){
int[][][] n=new int[3][3][3];

n[0][0][0]=10;
n[0][0][1]=10;
n[0][0][2]=10;
n[0][1][0]=10;
n[0][1][1]=10;
n[0][1][2]=10;
n[0][2][0]=10;
n[0][2][1]=10;
n[0][2][2]=10;


for(int i=0;i<3;i++){
for(int j=0;j<n[i].length;j++){
for(int k=0;k<n[i][j].length;k++){
System.out.print(n[i][j][k]+" ");
}
System.out.println();
}
System.out.println("..............");
}
}
}



