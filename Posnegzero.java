public class Posnegzero{
public static void obj(int num){
if(num>0){
System.out.println(num+":is Positive");
}else if(num<0){
System.out.println(num+":is Negative");
}else{
System.out.println(num+":is Zero");
}
}
public static void main(String[] args){
Posnegzero po=new Posnegzero();
po.obj(-3);
}
}
