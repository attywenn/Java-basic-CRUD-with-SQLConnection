import java.util.Scanner;

public class MainMenu {
    public static void main (String [] args) {
        Scanner sc= new Scanner(System.in);
        
        while (true) {
            System.out.println("\n====> MAIN MENU OF INVENTORY SYSTEM");
            System.out.println("1. Create Product");
            System.out.println("2. Read Inventory DB");
            System.out.println("3. Update Inventory");
            System.out.println("4. Delete Product");
            System.out.println("5. DELETE ALL RECORDS");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 0:
                    System.out.println("Thank you!");
                    return;
                case 1:
                    System.out.println("===> CREATE PRODUCT");
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: " );
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    Create.create(name, qty, price);
                    break;
                case 2: 
                    System.out.println("===> READ INVENTORY");
                    Read.read();
                    break;
                case 3:
                    System.out.println("===> UPDATE INVENTORY");
                    System.out.print("Enter Product ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New product name: ");
                    String newName = sc.nextLine();
                    System.out.print("New quantity: ");
                    int newQty = sc.nextInt();
                    System.out.print("New price: ");
                    double newPrice = sc.nextDouble();
                    
                    Update.update(uid, newName, newQty, newPrice);
                    break;
                case 4:
                    System.out.println("===> DELETE A PRODUCT IN INVENTORY DATABASE");
                    System.out.print("Enter product ID: ");
                    int del_id = sc.nextInt();
                    Delete.delete(del_id);
                    break;
                case 5:
                    while (true) {
                        System.out.println("==> TRUNCATE (CLEAR) TABLE");
                        System.out.println("Do you want to remove the whole code?");
                        System.out.print("Choice(y/n): ");
                        char ch = sc.next().charAt(0);
                        sc.nextLine();
                        
                        
                        if (ch == 'y') {
    
                                String sumpa = "Yes, I confirm";
                                System.out.println("TYPE THIS FIRST:\n"+sumpa);
                                System.out.print("Enter: ");
                                String input = sc.nextLine();
                                
                                if (input.equals(sumpa)) {
                                    TRUNCATE.delete();
                                    System.out.println("Successfully cleared!");
                                    break;
                                } else {
                                    System.out.println("Invalid, or you may have a typo on your sinumpaan.");
                                }
            
                        } else if (ch=='n') {
                            break;
                        } else {
                            System.out.println("Invalid.");
                        }
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid option... Pls try again.");
            }
        }
    }
}