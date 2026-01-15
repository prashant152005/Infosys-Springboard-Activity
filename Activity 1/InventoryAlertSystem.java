// Activity 1
// Scenario: You have to code for is in the Inventory System. 
// Alerts are generated whenever stock levels cross certain limits. 
// At any moment, the Inventory Manager wants to know only the most recent alert because it reflects the current situation. 
// Task description:  
// Write a program that creates a stack to store inventory alert messages. 
// Add multiple alert messages into the stack. 
// Display the latest alert generated without removing it from the stack.

import java.util.Scanner;
import java.util.Stack;

class User {
    String username;
    String password;
    String role;

    User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}

public class InventoryAlertSystem {

    public static void main(String[] args) {

        User admin = new User("admin", "admin123", "ADMIN");
        User staff = new User("staff", "staff123", "STAFF");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String uname = sc.nextLine();

        System.out.print("Enter Password: ");
        String pwd = sc.nextLine();

        User loggedInUser = null;

        if (uname.equals(admin.username) && pwd.equals(admin.password))
            loggedInUser = admin;
        else if (uname.equals(staff.username) && pwd.equals(staff.password))
            loggedInUser = staff;

        if (loggedInUser == null) {
            System.out.println("Invalid Login");
            return;
        }

        System.out.println("Login Successful");
        System.out.println("Role: " + loggedInUser.role);

        if (!loggedInUser.role.equals("ADMIN")) {
            System.out.println("Unauthorized Access: Alerts visible only to Admin");
            return;
        }

        Stack<String> alertStack = new Stack<>();

        alertStack.push("ALERT: Stock below minimum level for Item A");
        alertStack.push("ALERT: Reorder level reached for Item B");
        alertStack.push("ALERT: Overstock detected for Item C");
        alertStack.push("ALERT: Item D out of stock");

        System.out.println("\nLatest Alert:");
        System.out.println(alertStack.peek());

        System.out.println("\nAcknowledging Latest Alert...");
        System.out.println("Removed: " + alertStack.pop());

        System.out.println("\nCurrent Latest Alert:");
        System.out.println(alertStack.peek());

        sc.close();
    }
}
