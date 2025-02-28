package lk.ijse.spring_boot.controller;


import lk.ijse.spring_boot.DTO.CustomerDTO;
import lk.ijse.spring_boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

@Autowired
//property injection
private CustomerService customerService;

   @PostMapping("save")
   public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
      boolean res= customerService.addCustomer(customerDTO);
       return res;
   }

   @GetMapping("getAll")
    public List<CustomerDTO> getAllCustomer(){
       List<CustomerDTO> customers=customerService.getAllCustomers();
       return customers;
   }

   @PutMapping("update")
    public boolean updateCustomer(@RequestBody CustomerDTO customerDTO){
       boolean update=customerService.updateCustomer(customerDTO);
       return update;
   }

   @DeleteMapping("delete/{id}")
    public boolean deleteCustomer(@PathVariable int id){
       boolean delete =customerService.deleteCustomer(id);
       return delete;
   }

   @GetMapping("search/{id}")
    public CustomerDTO searchCustomer(@PathVariable int id){
       return  customerService.searchCustomer(id);
   }

}
