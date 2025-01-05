import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // menu
        System.out.println("Welcome to Food Delivery Service!");
        System.out.println("Here is our menu:");
        System.out.println("1. Briyani - 299");
        System.out.println("2. Fried Rice - 199");
        System.out.println("3. Mandhi - 799");
        System.out.println("4. Shawarma - 99");
        System.out.println("5.BBQ Chicken - 499");

        System.out.println("\nEnter the number of items:");
        int numItems = scanner.nextInt();

        double totalCost = 0;
        StringBuilder orderSummary = new StringBuilder("ordered Item:\n");

        for (int i = 0; i < numItems; i++) {
            System.out.printf("Enter the Food Code here: ", i + 1);
            int itemNumber = scanner.nextInt();

            switch (itemNumber) {
                case 1:
                    orderSummary.append("Briyani\n");
                    totalCost += 299;
                    break;
                case 2:
                    orderSummary.append("Fried Rice\n");
                    totalCost += 199;
                    break;
                case 3:
                    orderSummary.append("Mandhi\n");
                    totalCost += 799;
                    break;
                case 4:
                    orderSummary.append("Shawarma\n");
                    totalCost += 99;
                    break;
                case 5:
                    orderSummary.append("BBQ Chicken\n");
                    totalCost += 499;
                    break;
                default:
                    System.out.println("EXIT");
                    i--;
            }
        }

    
        System.out.println("\nSummary:");
        System.out.println(orderSummary);
        System.out.printf("Total cost: %.2f%n", (totalCost));
        System.out.println("Thank you for ordering! Your food will be delivered shortly.");

        scanner.close();
    }
}
