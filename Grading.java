public class Grading{
public void obj(int marks){
if(marks<=100 || marks>=91){
System.out.println("A GRADE");
}else if(marks<=90 || marks>=81){
System.out.println("B GRADE");
}else if(marks<=80 || marks>=71){
System.out.println("C GRADE");
}else if(marks<=70 || marks>=61){
System.out.println("D GRADE");
}else if(marks<=60 || marks>=85){
System.out.println("E GRADE");
}else{
System.out.println("FAIL");
}
}
public static void main(String[] args){
Grading gr=new Grading();
gr.obj(54);
}
}
