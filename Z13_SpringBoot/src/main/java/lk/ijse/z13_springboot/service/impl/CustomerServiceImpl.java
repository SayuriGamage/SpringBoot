package lk.ijse.z13_springboot.service.impl;

import lk.ijse.z13_springboot.dto.CustomerDTO;
import lk.ijse.z13_springboot.entity.Customer;
import lk.ijse.z13_springboot.repo.CustomerRepo;
import lk.ijse.z13_springboot.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        if(customerRepo.existsById(customerDTO.getId())){
            throw  new RuntimeException("Customer already exists");
        }
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
    }

    public void deleteCustomer(int id) {
        if(customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }
    }


    public void updateCustomer(CustomerDTO customerDTO) {
        if(customerRepo.existsById(customerDTO.getId())){
       customerRepo.save(modelMapper.map(customerDTO,Customer.class));
        }
    }

    public Object getAllCustomers() {
        return modelMapper.map(customerRepo.findAll(),new TypeToken<List<CustomerDTO>>(){}.getType());
    }
}
