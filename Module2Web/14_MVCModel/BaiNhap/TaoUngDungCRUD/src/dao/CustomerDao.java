package dao;

import model.Customer;

import java.util.*;

public class CustomerDao {
    private static Map<Integer, Customer> listCustomer = new HashMap<Integer, Customer>();

    static {
        initCustomers();

    }

    private static void initCustomers() {
        Customer customer1 = new Customer(1, "a", "a", "a");
        listCustomer.put(customer1.getId(), customer1);
        Customer customer2 = new Customer(2, "b", "b", "b");
        listCustomer.put(customer2.getId(), customer2);
        Customer customer3 = new Customer(3, "c", "c", "c");
        listCustomer.put(customer3.getId(), customer3);
        Customer customer4 = new Customer(4, "d", "d", "d");
        listCustomer.put(customer4.getId(), customer4);
    }

    //get 1 customer theo id
    public static Customer getCustomer(int customerId) {
        return listCustomer.get(customerId);
    }

    //them 1 cus vao danh sach
    public static void addNewCustomer(Customer customer) {
        listCustomer.put(customer.getId(), customer);
    }

    //update 1 customer
    public static Customer updateAndCreateCustomer(Customer customer) {
        listCustomer.put(customer.getId(), customer);
        return customer;
    }

    //delete
    public static void deleteCustomer(int customerId) {
        listCustomer.remove(customerId);
    }
    //lay danh sach tat ca customer
    public static List<Customer> getAllCustomer() {
        Collection<Customer> c = listCustomer.values();
        List<Customer> list = new ArrayList<Customer>();
        list.addAll(c);
        return list;
    }


}
