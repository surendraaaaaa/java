public class Practice{
    public static void main(String[] args){
        String person_name="surendr";
        String Person_city="hyderabad";
    String temp=person_name;
    person_name=Person_city;
    Person_city=temp;


        System.out.println(person_name);
        System.out.println(Person_city);

    }
}