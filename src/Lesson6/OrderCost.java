package Lesson6;

public class OrderCost {
    public static double getOrderCost(int product1Amount, double product1Price,
                                      int product2Amount, double product2Price) {
        double totalPrice = product1Amount * product1Price + product2Amount * product2Price;
        int productsAmount = product1Amount + product2Amount;

        final double discountRate1 = 0.9;
        final double discountRate2 = 0.95;

        final int discountQuantityThreshold = 10;
        final int discountPriceThreshold = 1000;

        double finalCost;

        if (productsAmount >= discountQuantityThreshold && totalPrice >= discountPriceThreshold) {
            finalCost = totalPrice * discountRate1;
        } else if (productsAmount >= discountQuantityThreshold || totalPrice >= discountPriceThreshold) {
            finalCost = totalPrice * discountRate2;
        } else {
            finalCost = totalPrice;
        }

        return finalCost;
    }

    public static void main(String[] args) {
        System.out.println(getOrderCost(5, 80, 5, 20));
    }
} 