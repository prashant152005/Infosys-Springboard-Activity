// Activity 2
// Design a Java program to: 
// Accept user credentials Verify the login information.
// Identify the role of the user.
// Display appropriate access message based on role
// The program must clearly handle: 
// Invalid login attempts 
// Unauthorized access 
// Successful login with role display


import java.util.Scanner;

class User {
    String username;
    String password;
    String role;
    int attempts = 0;
    boolean locked = false;

    User(String u, String p, String r) {
        username = u;
        password = p;
        role = r;
    }
}

public class InventoryLoginSystem {
    static final int MAX_ATTEMPTS = 3;
    public static void main(String[] args) {
        User[] users = {
            new User("admin", "admin123", "ADMIN"),
            new User("manager", "manager123", "MANAGER"),
            new User("staff", "staff123", "STAFF")
        };
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String uname = sc.nextLine();

        User currentUser = null;
        for (User u : users) {
            if (u.username.equals(uname)) {
                currentUser = u;
                break;
            }
        }

        if (currentUser == null) {
            System.out.println("Unauthorized Access: User not found");
            return;
        }

        if (currentUser.locked) {
            System.out.println("Account Locked. Contact Administrator.");
            return;
        }

        while (currentUser.attempts < MAX_ATTEMPTS) {

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            if (currentUser.password.equals(pass)) {
                System.out.println("\nLogin Successful");
                showMenu(currentUser.role, sc);
                return;
            } else {
                currentUser.attempts++;
                System.out.println("Invalid Password");

                if (currentUser.attempts == MAX_ATTEMPTS) {
                    currentUser.locked = true;
                    System.out.println("Account Locked due to multiple failed attempts");
                }
            }
        }

        sc.close();
    }

    static void showMenu(String role, Scanner sc) {

        int choice;

        do {
            System.out.println("\n--- MENU ---");

            if (role.equals("ADMIN")) {
                System.out.println("1. Manage Users");
                System.out.println("2. View Inventory");
                System.out.println("3. Generate Reports");
            } else if (role.equals("MANAGER")) {
                System.out.println("1. View Inventory");
                System.out.println("2. Update Stock");
            } else if (role.equals("STAFF")) {
                System.out.println("1. View Inventory");
            }

            System.out.println("0. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Logged out successfully");
            } else {
                System.out.println("Action executed(Just for testing phase)");
            }

        } while (choice != 0);
    }
}
