package com.wecp.progressive.service;

<<<<<<< HEAD

import com.wecp.progressive.dao.CustomerDAO;
import com.wecp.progressive.dao.CustomerDAOImpl;
=======
import com.wecp.progressive.dao.CustomerDAO;
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
import com.wecp.progressive.entity.Customers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

<<<<<<< HEAD
    CustomerDAO customerDAO;
    private static List<Customers> customersList = new ArrayList<>();

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return customerDAO.getAllCustomers();
=======
    private static List<Customers> customersList = new ArrayList<>();

    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return null;
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
<<<<<<< HEAD
        return customerDAO.getCustomerById(customerId);
=======
        return null;
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
<<<<<<< HEAD
        return customerDAO.addCustomer(customers);
=======
        return -1;
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
<<<<<<< HEAD
        customerDAO.updateCustomer(customers);
=======

>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
<<<<<<< HEAD
        customerDAO.deleteCustomer(customerId);
=======

>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
<<<<<<< HEAD
        List<Customers> sortedCustomers = customerDAO.getAllCustomers();
        if (sortedCustomers != null) {
            Collections.sort(sortedCustomers);
        }
        return sortedCustomers;
=======
        return null;
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        return customersList;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        customersList.add(customers);
        return customersList;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList(){
        List<Customers> sortedCustomers = customersList;
        Collections.sort(sortedCustomers);
        return sortedCustomers;
    }

    @Override
    public void emptyArrayList() {
        customersList = new ArrayList<>();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
