import java.util.*;

public class ATM {
    static Scanner sc = new Scanner(System.in);
    static String AdminPass = "admin123";
    static int choice;
    static int choice2;

    public static void main(String[] args) {
        ATM m = new ATM();

        while (true) {
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice ");
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Plz enter only digits");
                sc.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter Admin Pasword:");
                    sc.nextLine();
                    String adpass = sc.nextLine();
                    if (AdminPass.equals(adpass)) {
                        System.out.println("Admin Login Succesfull");
                        m.AdminMenu();
                    } else {
                        System.out.println("Wrong Password");
                    }
                    break;
                case 2:m.UserMenu();
                    break;
                case 3:
                    System.out.println("Thank You for using ATM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    void AdminMenu() {
        boolean running = true;
        while (running) {
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.Exit to Main menu");
            System.out.print("Enter your choice ");
            try {
                choice2 = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Plz enter only digits");
                sc.nextLine();
                continue;
            }
            switch (choice2) {
                case 1:
                    System.out.println("Enter Your Name");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    running = false;
                    break;

            }
        }
    }

    int Dno = 1234;
    void UserMenu() {
        // TODO : Dno Fetch by Database And Then Match With Particular User.
        boolean running = true;
        System.out.println("Enter Your Debit Card no.:");
        String Dno = sc.next();
        if (running) {
            running = false;
            System.out.println("This CArd No. Not exist");
            return;
        } else {
            running = true;
        }
        while (running) {
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.Exit to Main menu");
            System.out.print("Enter your choice ");
            try {
                choice2 = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Plz enter only digits");
                sc.nextLine();
                continue;
            }
            switch (choice2) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    running = false;
                    break;

            }
        }
    }
}

