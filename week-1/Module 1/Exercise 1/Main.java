public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        
        Product product1 = new Product("prod1", "Laptop", 10, 900);
        Product product2 = new Product("prod2", "Smartphone", 20, 500);

        manager.addProduct(product1);
        manager.addProduct(product2);

        manager.displayInventory();

        product1.setPrice(800);
        manager.updateProduct(product1);

        manager.displayInventory();

        manager.deleteProduct("prod1");
        manager.displayInventory();
    }
}
