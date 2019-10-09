package DescendingOrder;

public class DescendingOrderTest {
    public static void main(String[] args) {
        int number = 12345;
        int result = 0;
        result = DescendingOrder.sortDesc(number);
        DescendingOrder.sortDesc(number);
        System.out.println("Resultat " + number + " -> " + result);
    }
}
