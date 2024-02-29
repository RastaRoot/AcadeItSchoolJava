package Lesson6;

public class OrderCost {
    public static double getOrderCost(int firstProductAmount, double firstProductPrice,
                                      int secondProductAmount, double secondProductPrice) {

        double orderCost = firstProductAmount * firstProductPrice + secondProductAmount *
                secondProductPrice;
        int productAmount = firstProductAmount + secondProductAmount;

        if (productAmount >= 10 && orderCost >= 1000) { // проверить дабл с числом
            orderCost = orderCost - (orderCost * 0.1);
            return orderCost;
        } else if (productAmount >= 10 || orderCost >= 1000) {
            orderCost = orderCost - (orderCost * 0.05);
            return orderCost;
        } else {
            return orderCost;
        }
    }

    public static void main(String[] args) {
        System.out.println(getOrderCost(5,80,5,20));
    }
} 