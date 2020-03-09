package CaseStudy.Models;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomerSort implements Comparator {
    @Override
    public int compare(Object o1, Object o2)
    {
        Customer cus1 = (Customer) o1;
        Customer cus2 = (Customer) o2;

        String cus1Name = cus1.getNameCustomer();
        String cus2Name = cus2.getNameCustomer();

        final int LENGTH;
        if (cus1Name.length() > cus2Name.length())
        {
            LENGTH = cus1Name.length();
        } else if (cus1Name.length() < cus2Name.length())
        {
            LENGTH = cus2Name.length();
        } else LENGTH = cus1Name.length();

        for (int i = 0; i < LENGTH; i++)
        {
            if (cus1Name.charAt(i) == cus2Name.charAt(i))
            {
                //if(i==LENGTH-1) return 0;
                continue;
            } else if (cus1Name.charAt(i) > cus2Name.charAt(i)) return 1;
            else return -1;
        }

        return compareByBirth(cus1, cus2);
    }

    private int compareByBirth(Customer cus1, Customer cus2)
    {
        List<String> birth1 = Arrays.asList(cus1.getBirthdayCustomer().split("/"));
        List<String> birth2 = Arrays.asList(cus2.getBirthdayCustomer().split("/"));

        return Integer.valueOf(birth1.get(2)) - Integer.valueOf(birth2.get(2));
    }
}
