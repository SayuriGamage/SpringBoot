package lk.ijse.controller;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import lk.ijse.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    List<CustomerDTO> customers=new ArrayList<>();

   @PostMapping(path="save")
    public CustomerDTO addCustomer(@RequestBody CustomerDTO customer){
       customers.add(customer);
       return customer;
    }

    @GetMapping(path="getAll")
    public List<CustomerDTO> getAllCustomer(){
       return customers;
    }

    @PutMapping(path="update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customer){

       for(int i=0; i<customers.size(); i++){
         CustomerDTO updateCustomer=  customers.get(i);
         if(updateCustomer.getId().equals(customer.getId())){
             updateCustomer.setName(customer.getName());
             updateCustomer.setAddress(customer.getAddress());
             return updateCustomer;
         }
       }
       return customer;
    }

    @DeleteMapping(path="delete/{id}")
    public boolean deleteCustomer(@PathVariable("id") String id){
       for(int i=0; i<customers.size(); i++){
           CustomerDTO updateCustomer=  customers.get(i);
           if(updateCustomer.getId().equals(id)){
               customers.remove(i);
               return true;
           }
       }
       return false;
    }


}
