package Lesson6;

public class OrderCost {
    public static double getOrderCost(int product1Amount, double product1Price,
                                      int product2Amount, double product2Price) {
        double fullCost = product1Amount * product1Price + product2Amount * product2Price;
        int productsAmount = product1Amount + product2Amount;

        final double maxDiscountRate = 0.9;
        final double partialDiscountRate = 0.95;

        final int discountAmountThreshold = 10;
        final int discountCostThreshold = 1000;

        double finalCost;

        if (productsAmount >= discountAmountThreshold && fullCost >= discountCostThreshold) {
            finalCost = fullCost * maxDiscountRate;
        } else if (productsAmount >= discountAmountThreshold || fullCost >= discountCostThreshold) {
            finalCost = fullCost * partialDiscountRate;
        } else {
            finalCost = fullCost;
        }

        return finalCost;
    }

    public static void main(String[] args) {
        System.out.println(getOrderCost(5, 80, 5, 20));
    }
} 