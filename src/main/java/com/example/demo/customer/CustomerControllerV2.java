package com.example.demo.customer;
import java.util.Collections;
import java.util.List;

import com.example.demo.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v2/customers")
public class CustomerControllerV2 {
    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable ("customerId") Long id){
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable ("customerId") Long id){
        throw new ApiRequestException("ApiRequestException for customer " + id);
    }

    @PostMapping
    void addCustomer(@RequestBody @Valid Customer request){
        System.out.println("POST REQUEST");
        System.out.println(request);
    }

    @PutMapping
    void updateCustomer(@RequestBody @Valid Customer request){
        System.out.println("PUT REQUEST");
        System.out.println(request);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable ("customerId") Long id){
        System.out.println("DELETE REQUEST FOR ID ..>>" + id);
    }

}
