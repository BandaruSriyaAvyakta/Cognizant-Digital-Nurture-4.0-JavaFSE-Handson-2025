package inventory;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    public void updateProduct(int id, int newQuantity) {
        Product p = inventory.get(id);
        if (p != null) p.setQuantity(newQuantity);
    }

    public void deleteProduct(int id) {
        inventory.remove(id);
    }

    public void displayAll() {
        for (Product p : inventory.values()) {
            System.out.println(p.productName + " - Qty: " + p.getQuantity());
        }
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Product p1 = new Product(1, "Laptop", 10, 75000);
        Product p2 = new Product(2, "Mobile", 14, 7000);
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.updateProduct(1, 15);
        manager.displayAll();
        manager.deleteProduct(1);
    }
}
