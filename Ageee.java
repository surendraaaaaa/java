public class Ageee{
public void obj(int age){
if(age>18){
System.out.println("Eligibilty to vote");
}else{
System.out.println("You are not Eligible to vote, Because your age is under 18 years");
}
}
public static void main(String[] args){
Ageee a=new Ageee();
a.obj(15);
}
}


