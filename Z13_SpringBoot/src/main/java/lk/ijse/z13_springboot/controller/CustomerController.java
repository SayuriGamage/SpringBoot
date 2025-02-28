package lk.ijse.z13_springboot.controller;


import lk.ijse.z13_springboot.dto.CustomerDTO;
import lk.ijse.z13_springboot.entity.Customer;
import lk.ijse.z13_springboot.service.CustomerService;
import lk.ijse.z13_springboot.service.impl.CustomerServiceImpl;
import lk.ijse.z13_springboot.util.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")

public class CustomerController {
  @Autowired
    //property injection

  private CustomerServiceImpl customerService;

    @PostMapping("save")
    public ResponseUtill saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return new ResponseUtill(201,"Customer Saved",null);
    }

    @DeleteMapping("delete/{id}")
    public ResponseUtill deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
        return  new ResponseUtill(200,"Customer Deleted",null);
    }


    @PutMapping("update")
    public ResponseUtill updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
        return new ResponseUtill(200,"Customer Updated",null);
    }

    @GetMapping("getAll")
    public ResponseUtill getAllCustomer() {
        return  new ResponseUtill(200,"all customers",customerService.getAllCustomers());
    }

}
