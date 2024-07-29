public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Ram", 250.75),
            new Order("2", "Sam", 150.50),
            new Order("3", "Arnold", 300.00),
            new Order("4", "David", 100.00)
        };

        BubbleSort.bubbleSort(orders);
        System.out.println("Sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        orders = new Order[]{
            new Order("1", "Ram", 250.75),
            new Order("2", "Sam", 150.50),
            new Order("3", "Arnold", 300.00),
            new Order("4", "David", 100.00)
        };

        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
