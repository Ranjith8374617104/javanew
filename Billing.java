import java.util.*;

class BillApplication {
    String customerName;
    double dressCost;
    double discountPercentage;
    double totalCost;
    public BillApplication(String cname) {
        this.customerName = cname;
        this.dressCost = 0;
        this.discountPercentage = 0;
        this.totalCost = 0;
    }
    public void addDressCost(double cost) {
        this.dressCost += cost;
        System.out.println("Added dress cost: $" + cost);
    }
    public void applyDiscount(double discount) {
        this.discountPercentage = discount;
        System.out.println("Applied discount: " + discount + "%");
    }
    public void calculateTotalCost() {
        totalCost = dressCost - (dressCost * discountPercentage / 100);
        System.out.println("Total cost after discount: $" + totalCost);
    }
    public void displayBillSlip() {
        System.out.println("\n------ Bill Slip ------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Dress Cost: $" + dressCost);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Total Cost After Discount: $" + totalCost);
        System.out.println("-----------------------");
    }
    public void exitApplication() {
        System.out.println("Exiting the application. Thank you for shopping!");
        System.exit(0);
    }
}

public class Billing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Customer Name:");
        String cname = scanner.nextLine();
        BillApplication bill = new BillApplication(cname);

        while (true) {
            System.out.println("\n--- Bill Application Menu ---");
            System.out.println("1. Add Dress Cost");
            System.out.println("2. Apply Discount");
            System.out.println("3. Calculate Total Cost");
            System.out.println("4. Display Bill Slip");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter dress cost to add: ");
                    double cost = scanner.nextDouble();
                    bill.addDressCost(cost);
                    break;
                case 2:
                    System.out.print("Enter discount percentage: ");
                    double discount = scanner.nextDouble();
                    bill.applyDiscount(discount);
                    break;
                case 3:
                    bill.calculateTotalCost();
                    break;
                case 4:
                    bill.displayBillSlip();
                    break;
                case 5:
                    bill.exitApplication();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}