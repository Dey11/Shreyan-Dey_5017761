public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        image1.display(); // Loading and displaying photo1.jpg
        image1.display(); // Displaying photo1.jpg

        image2.display(); // Loading and displaying photo2.jpg
        image2.display(); // Displaying photo2.jpg
    }
}
