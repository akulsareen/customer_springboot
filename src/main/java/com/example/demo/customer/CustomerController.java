package com.example.demo.customer;
import java.util.List;
import com.example.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/customer")
@Deprecated
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService =  customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomer(){
        return customerService.getCustomers();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer request){
        System.out.println("POST Customer request.........");
        System.out.println(request);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer request){
        System.out.println("UPDATE Customer request.........");
        System.out.println(request);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE request for customer by id.........." + id);
    }




}
