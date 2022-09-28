
public class ProductManager {
    public void Add(Product product) {
        //JDBC
        System.out.println("Ürün Eklendi: "+ product.name);
    }

    public void Remove(Product product) {
        System.out.println("Ürün Silindi: "+ product.name);
    }
}