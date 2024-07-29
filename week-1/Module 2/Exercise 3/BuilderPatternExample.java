public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setMotherboard("ASUS ROG")
                .build();

        Computer computer2 = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("AMD Radeon RX 6900 XT")
                .setMotherboard("MSI MPG")
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
