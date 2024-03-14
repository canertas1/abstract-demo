package org.example.service;

import org.example.entities.Customer;

public class StarbucksCustomerService extends BaseCustomerService  {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerService(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }

    }

}
