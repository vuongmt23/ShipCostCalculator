import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");

        double price;
        if (in.hasNextDouble()) {
            price = in.nextDouble();
            double shippingCost = price >= 100 ? 0 : price * 0.02;
            double totalCost = price + shippingCost;

            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total cost: $" + totalCost);
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
