package Lesson6;

public class OrderCost {
    public static double getOrderCost(int productAmount1, double productPrice1,
                                      int productAmount2, double productPrice2) {
        double orderPrice = productAmount1 * productPrice1 + productAmount2 * productPrice2;
        int productsAmount = productAmount1 + productAmount2;
        double orderCost;
        final double sell10 = 0.9;
        final double sell5 = 0.95;
        final int productsAmount10 = 10;
        final int orderPrice1000 = 1000;

        if (productsAmount >= productsAmount10 && orderPrice >= orderPrice1000) {
            orderCost = orderPrice * sell10;
        } else if (productsAmount >= productsAmount10 || orderPrice >= orderPrice1000) {
            orderCost = orderPrice * sell5;
        } else {
            orderCost = orderPrice;
        }
        return orderCost;
    }

    public static void main(String[] args) {

        System.out.println(getOrderCost(5, 80, 5, 20));
    }
} 