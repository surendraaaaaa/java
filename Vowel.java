public class Vowel{
public void obj(char ch){
ch=Character.toLowerCase(ch);
if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
System.out.println(ch+":is a vowel");
}else if(ch>='a' && ch<='z'){
System.out.println(ch+":is a consonant");
}
}
public static void main(String[] args){
Vowel v=new Vowel();
v.obj('a');
}
}
