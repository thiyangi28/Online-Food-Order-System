package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

        @Autowired
    CustomerRepository customerRepository;



    public List<Customer> getAllDetails() {
        List<CustomerEntity> all = customerRepository.findAll();
        List<Customer> customers = new ArrayList<>();

        for (CustomerEntity customerEntity:all){
            customers.add(new Customer(
                    customerEntity.getCustId(),
                    customerEntity.getCustTitle(),
                    customerEntity.getCustName(),
                    customerEntity.getCustphone(),
                    customerEntity.getCity()

            ));
        }
        return customers;
    }

    public void add(Customer addCustomer) {
        customerRepository.save(new CustomerEntity(
                addCustomer.getCustId(),
                addCustomer.getCustTitle(),
                addCustomer.getCustName(),
                addCustomer.getCustphone(),
                addCustomer.getCity()
        ));
    }

    public  void update(Customer updateCustomer){
        customerRepository.save(new CustomerEntity(
                updateCustomer.getCustId(),
                updateCustomer.getCustName(),
                updateCustomer.getCustTitle(),
                updateCustomer.getCustphone(),
                updateCustomer.getCity()
        ));
    }

    public void deleteId(String id){
        customerRepository.deleteById(Long.parseLong(id));
    }
}
