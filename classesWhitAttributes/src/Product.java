
public class Product {

    public  Product(int id,String name,String description,double price,int stockamount){
        System.out.println("Yapıcı blok çalıştı");
         this.name=name;
         this.id=id;
         this.price=price;
         this.description=description;
         this.stockamount=stockamount;
    }
    public  Product(){

    }
    //attribute | field
    int id;
    String name;
    String description;
    double price;
    int stockamount;
    String kod;

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockamount() {
        return stockamount;
    }

    public void setStockamount(int stockamount) {
        this.stockamount = stockamount;
    }


}