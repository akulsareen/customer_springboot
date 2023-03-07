package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "email@gmail.com", "Nidhi Sareen", "mommie"),
                new Customer(2L, "email@gmail.com", "Vinayak Sareen", "bhaiya"),
                new Customer(3L, "email@gmail.com", "Umesh Sareen", "papa")
        );
    }
}
