public class Howtocreateobjectwhenstaticisnotdefined{
public void obje(){
System.out.println("creating new object by calling method");
}
public static void main(String[] args){
System.out.println("calling method by creating new objcet when static not defined");
Howtocreateobjectwhenstaticisnotdefined ne=new Howtocreateobjectwhenstaticisnotdefined();
ne.obje();
}
}