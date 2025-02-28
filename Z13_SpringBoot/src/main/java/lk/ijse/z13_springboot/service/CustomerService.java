package lk.ijse.z13_springboot.service;

import lk.ijse.z13_springboot.dto.CustomerDTO;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    public void deleteCustomer(int id);
    public void updateCustomer(CustomerDTO customerDTO);
    public Object getAllCustomers();
}
