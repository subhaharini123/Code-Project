import java.util.Scanner;
public class Hotelstars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hotelName = "HOTEL GRAND TASTE";
    int totalAmount = 0;
    // initialize to a default value so the variable is definitely assigned
    char moreOrder = 'n';

        System.out.println("==================================");
        System.out.println("       WELCOME TO " + hotelName);
        System.out.println("==================================");

        do {
            System.out.println("\nMAIN MENU:");
            System.out.println("1) FRIED RICE");
            System.out.println("2) FRIED NOODLES");
            System.out.println("3) SIDES");
            System.out.print("Enter your choice (1-3): ");
            int choice = sc.nextInt();

            int price = 0, qty = 0;

            switch (choice) {
                // FRIED RICE SECTION
                case 1:
                    System.out.println("\n--- FRIED RICE VARIETIES ---");
                    System.out.println("1) Veg Fried Rice - Rs.100");
                    System.out.println("2) Egg Fried Rice - Rs.120");
                    System.out.println("3) Chicken Fried Rice - Rs.150");
                    System.out.println("4) Prawn Fried Rice - Rs.180");
                    System.out.print("Select your Fried Rice type: ");
                    int riceChoice = sc.nextInt();

                    switch (riceChoice) {
                        case 1: price = 100; break;
                        case 2: price = 120; break;
                        case 3: price = 150; break;
                        case 4: price = 180; break;
                        default:
                            System.out.println("Invalid Fried Rice choice!");
                            continue;
                    }
                    System.out.print("Enter number of plates: ");
                    qty = sc.nextInt();
                    totalAmount += price * qty;
                    break;

                // FRIED NOODLES SECTION
                case 2:
                    System.out.println("\n--- FRIED NOODLES VARIETIES ---");
                    System.out.println("1) Veg Noodles - Rs.90");
                    System.out.println("2) Egg Noodles - Rs.110");
                    System.out.println("3) Chicken Noodles - Rs.130");
                    System.out.println("4) Schezwan Noodles - Rs.150");
                    System.out.print("Select your Noodles type: ");
                    int noodleChoice = sc.nextInt();

                    switch (noodleChoice) {
                        case 1: price = 90; break;
                        case 2: price = 110; break;
                        case 3: price = 130; break;
                        case 4: price = 150; break;
                        default:
                            System.out.println("Invalid Noodles choice!");
                            continue;
                    }
                    System.out.print("Enter number of plates: ");
                    qty = sc.nextInt();
                    totalAmount += price * qty;
                    break;

                // SIDES SECTION
                case 3:
                    System.out.println("\n--- SIDES VARIETIES ---");
                    System.out.println("1) Chicken 65 - Rs.160");
                    System.out.println("2) Gobi Manchurian - Rs.100");
                    System.out.println("3) Paneer Chilli - Rs.140");
                    System.out.println("4) French Fries - Rs.90");
                    System.out.print("Select your Side Dish: ");
                    int sideChoice = sc.nextInt();

                    switch (sideChoice) {
                        case 1: price = 160; break;
                        case 2: price = 100; break;
                        case 3: price = 140; break;
                        case 4: price = 90; break;
                        default:
                            System.out.println("Invalid Side choice!");
                            continue;
                    }
                    System.out.print("Enter number of plates: ");
                    qty = sc.nextInt();
                    totalAmount += price * qty;
                    break;

                default:
                    System.out.println("Invalid Main Menu choice!");
            }

            System.out.print("\nDo you want to order more items? (y/n): ");
            moreOrder = sc.next().charAt(0);

        } while (moreOrder == 'y' || moreOrder == 'Y');

        System.out.println("\n-----------------------------------");
        System.out.println("Total Amount to Pay: Rs." + totalAmount);
        System.out.println("You enjoyed your meal at " + hotelName + "!");
        System.out.println("---------- WELCOME AGAIN ----------");
    }
}

