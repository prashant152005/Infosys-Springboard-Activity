import java.util.HashMap;
import java.util.Scanner;

class User {
    String username;
    String password;
    String role;

    User(String u, String p, String r) {
        username = u;
        password = p;
        role = r;
    }
}

class Product {
    String code;
    String name;
    int stock;

    Product(String code, String name, int stock) {
        this.code = code;
        this.name = name;
        this.stock = stock;
    }

    void addShipment(int qty) {
        stock += qty;
    }

    void display() {
        System.out.println(code + " | " + name + " | Stock: " + stock);
    }
}

public class SportsInventorySystem {

    static HashMap<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User admin = new User("admin", "admin123", "ADMIN");
        User staff = new User("staff", "staff123", "STAFF");

        User loggedIn = null;
        boolean exitSystem = false;

        // 🔐 LOGIN LOOP WITH OPTION
        while (true) {

            System.out.print("Username: ");
            String uname = sc.nextLine();

            System.out.print("Password: ");
            String pwd = sc.nextLine();

            if (uname.equals(admin.username) && pwd.equals(admin.password))
                loggedIn = admin;
            else if (uname.equals(staff.username) && pwd.equals(staff.password))
                loggedIn = staff;
            else {
                System.out.println("Invalid Login");
            }

            if (loggedIn == null) {
                System.out.println("\n1. Login Again");
                System.out.println("2. Exit");
                System.out.print("Choose option: ");
                int opt = sc.nextInt();
                sc.nextLine();

                if (opt == 2) {
                    exitSystem = true;
                    break;
                }
                continue;
            }

            System.out.println("Login Successful");
            System.out.println("Role: " + loggedIn.role);

            if (!loggedIn.role.equals("ADMIN")) {
                System.out.println("Access Denied: Inventory allowed only for Admin");

                System.out.println("\n1. Login Again");
                System.out.println("2. Exit");
                System.out.print("Choose option: ");
                int opt = sc.nextInt();
                sc.nextLine();

                if (opt == 2) {
                    exitSystem = true;
                    break;
                }

                loggedIn = null;
                continue;
            }

            break;
        }

        if (exitSystem) {
            System.out.println("Exiting System...");
            sc.close();
            return;
        }

        inventory.put("CRB101", new Product("CRB101", "Cricket Bat", 112));
        inventory.put("FTB201", new Product("FTB201", "Football", 21));
        inventory.put("BDR301", new Product("BDR301", "Badminton Racket", 55));
        inventory.put("HLM401", new Product("HLM401", "Helmet", 10));

        int choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Shipment");
            System.out.println("2. View All Products");
            System.out.println("3. View Stock of a Product");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    sc.nextLine();
                    System.out.print("Enter Product Code: ");
                    String code = sc.nextLine();

                    if (!inventory.containsKey(code)) {
                        System.out.println("Invalid Product Code");
                        break;
                    }

                    System.out.print("Enter Shipment Quantity: ");
                    int qty = sc.nextInt();
                    inventory.get(code).addShipment(qty);
                    System.out.println("Shipment Added Successfully");
                }

                case 2 -> {
                    System.out.println("\nProduct Code | Product Name | Available Stock");
                    System.out.println("--------------------------------------------");
                    for (Product p : inventory.values()) {
                        p.display();
                    }
                }

                case 3 -> {
                    sc.nextLine();
                    System.out.print("Enter Product Code: ");
                    String searchCode = sc.nextLine();

                    if (inventory.containsKey(searchCode))
                        inventory.get(searchCode).display();
                    else
                        System.out.println("Product Not Found");
                }

                case 4 -> System.out.println("Exiting Inventory Menu...");

                default -> System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
