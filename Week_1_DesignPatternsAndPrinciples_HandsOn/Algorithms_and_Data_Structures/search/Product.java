package search;

public class Product {
    public int productId;
    public String productName;
    public String category;

    public Product(int productId, String name, String category) {
        this.productId = productId;
        this.productName = name;
        this.category = category;
    }
}