
public class Main {

    public static void main(String[] args) {
        //Product product = new Product(8,"Laptop","Asus laptop",5000,28);
        Product product = new Product();
        product.setName("Laptop");
        product.setId(8);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockamount(28);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }

}