package lk.ijse.spring_boot.service;

import lk.ijse.spring_boot.DTO.CustomerDTO;
import lk.ijse.spring_boot.entity.Customer;
import lk.ijse.spring_boot.repo.CustomerRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class  CustomerService {

    @Autowired
   private CustomerRepos customerRepository;
    public boolean addCustomer(CustomerDTO customerDTO){
       Customer customer = new Customer(customerDTO.getCustomerId(), customerDTO.getCustomerName(), customerDTO.getCustomerAddress());
       customerRepository.save(customer);
       return true;
    }


    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerDTO> customerDTOs = new ArrayList<>();
      for (Customer customer : customers) {
         CustomerDTO customerDTO=new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress());
         customerDTOs.add(customerDTO);

      }
     return customerDTOs;
    }

    public boolean updateCustomer(CustomerDTO customerDTO) {
        if(customerRepository.existsById(customerDTO.getCustomerId())){
            Customer customer=new Customer(customerDTO.getCustomerId(), customerDTO.getCustomerName(), customerDTO.getCustomerAddress());
            customerRepository.save(customer);
            return true;
        }
        return false;
    }


    public boolean deleteCustomer(int id) {
        if(customerRepository.existsById(id)){
            customerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public CustomerDTO searchCustomer(int id) {
        if(customerRepository.existsById(id)){
            Customer customer=customerRepository.findById(id).get();
            CustomerDTO customerDTO=new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress());
            return customerDTO;
        }
        return null;
    }
}
