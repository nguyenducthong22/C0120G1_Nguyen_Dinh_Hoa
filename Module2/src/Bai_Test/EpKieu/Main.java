package Bai_Test.EpKieu;

public class Main {
    public static void main(String[] args) {
//        Customer customer = new CustomerChild();
//        CustomerChild customerChild = new CustomerChild();
//
//        customer.setName("asd");
//        customerChild.setAge("asd");
//
//        ((CustomerChild) customer).setAge("18");
//
//
//        customerChild = (CustomerChild) customer;
//
//        System.out.println(customer);
//        System.out.println(customerChild);

        Customer customerChild = new CustomerChild(); // ep tu sub type ->super type
        ((CustomerChild) customerChild).setAge("asd");  //ep tu super type -> subtype




    }

}
