package org.example.service;

import org.example.entities.Customer;

public abstract class BaseCustomerService implements CustomerService{


    @Override
    public void save(Customer customer){
        System.out.println("saved to db : "+customer.getFirstName());
    }


}
