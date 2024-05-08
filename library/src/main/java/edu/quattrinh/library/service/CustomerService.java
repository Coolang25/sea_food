package edu.quattrinh.library.service;

import edu.quattrinh.library.dto.CustomerDto;
import edu.quattrinh.library.model.Customer;

public interface CustomerService {
    Customer save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer update(CustomerDto customerDto);

    Customer changePass(CustomerDto customerDto);

    CustomerDto getCustomer(String username);
}
