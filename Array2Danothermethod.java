public class Array2Danothermethod{
public static void main(String[] args){
int[][] i=new int[3][3];
i[0][0]=1;
i[0][1]=2;
i[0][2]=3;
i[1][0]=1;
i[1][1]=2;
i[1][2]=3;
i[2][0]=1;
i[2][1]=2;
i[2][2]=3;
for(int n=0;n<i.length;n++){
for(int j=0;j<i.length;j++){
System.out.print(i[n][j]+" ");
}
System.out.println();
}
}
}


