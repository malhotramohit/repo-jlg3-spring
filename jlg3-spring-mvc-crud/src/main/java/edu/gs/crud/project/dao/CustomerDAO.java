package edu.gs.crud.project.dao;


import java.util.List;

import edu.gs.crud.project.model.Customer;


public interface CustomerDAO {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}