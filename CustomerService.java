import java.util.*;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void viewCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    public void updateCustomer(int id, String name, String email) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                c.setName(name);
                c.setEmail(email);
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    public void deleteCustomer(int id) {
        customers.removeIf(c -> c.getId() == id);
    }
}