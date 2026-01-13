public class Ooopsmain {
  String name;
int id;

public boolean mainnn(Ooopsmain oo,Ooopsmain dd){
  
    if(oo.name==dd.name && oo.id==dd.id){
            return true;
    } else {
           return false;
    }

}

public static void main(String[] args){
    Ooopsmain oo=new Ooopsmain();
    oo.name="dsds";
    oo.id=25;
    Ooopsmain oof=new Ooopsmain();
    oof.name="jsxs";
    oof.id=23;
    Ooopsmain os=new Ooopsmain();
    boolean f=os.mainnn(oo,oof);
    System.out.println(f);
}

    
}
