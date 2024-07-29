public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("prod1", "Laptop", "Electronics"),
            new Product("prod2", "Smartphone", "Electronics"),
            new Product("prod3", "Headphones", "Accessories"),
            new Product("prod4", "Keyboard", "Accessories"),
        };

        Product result1 = LinearSearch.linearSearch(products, "Smartphone");
        System.out.println(result1.getProductName());

        Product result2 = BinarySearch.binarySearch(products, "Smartphone");
        System.out.println(result2.getProductName());
    }
}
