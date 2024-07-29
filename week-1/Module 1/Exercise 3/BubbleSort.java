public class BubbleSort {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (orders[i - 1].getTotalPrice() > orders[i].getTotalPrice()) {
                    Order temp = orders[i - 1];
                    orders[i - 1] = orders[i];
                    orders[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
