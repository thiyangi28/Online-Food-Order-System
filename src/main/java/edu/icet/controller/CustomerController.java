package edu.icet.controller;

import edu.icet.model.dto.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    //get all details of customer
    @GetMapping("/all")
    public List<Customer>getAllDetail(){
        return customerService.getAllDetails();
    }

    //add customer
    @PostMapping("/add")
    public  void add(@RequestBody Customer customer){
        customerService.add(customer);
    }

    @PutMapping("/update")
    public void update(@RequestBody Customer customer){
        customerService.update(customer);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable String id){
        customerService.deleteId(id);
    }

}
