import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Email: ");
                String email = scanner.nextLine();

                service.addCustomer(new Customer(id, name, email));

            } else if (choice == 2) {
                service.viewCustomers();

            } else if (choice == 3) {
                System.out.print("Enter ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("New Name: ");
                String name = scanner.nextLine();

                System.out.print("New Email: ");
                String email = scanner.nextLine();

                service.updateCustomer(id, name, email);

            } else if (choice == 4) {
                System.out.print("Enter ID to delete: ");
                int id = scanner.nextInt();
                service.deleteCustomer(id);

            } else {
                break;
            }
        }
    }
}