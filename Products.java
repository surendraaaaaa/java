public class Products {
    private String brand;
    private String description;
    private double price;


    public Products(String brand,String description,double price){
        this.brand=brand;
        this.description=description;
        this.price=price;
    }




    public String toString(){
        return "Brand : "+brand+" , description: "+description+" , price : "+price;
    }




}