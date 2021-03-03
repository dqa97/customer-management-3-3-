package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Nghia", "nghianguyen@gmail.com", "Ha Noi"));
        customers.put(2, new Customer(2, "Vinh", "vinhthitlon@gmail.com", "Ha Noi"));
        customers.put(3, new Customer(3, "Quoc Anh", "dqa97@gmail.com", "Vinh"));
        customers.put(4, new Customer(4, "Thanh", "thanhlu@gmail.com", "Ha Noi"));
        customers.put(5, new Customer(5, "To Tam", "matot.duong@gmail.com", "Vinh"));
        customers.put(6, new Customer(6, "Lam Oanh", "lamoanh303@gmail.com", "Vinh"));
    }

    @Override
    public List findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remote(int id) {
        customers.remove(id);
    }
}
