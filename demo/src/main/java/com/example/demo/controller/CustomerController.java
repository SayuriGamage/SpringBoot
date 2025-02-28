package com.example.demo.controller;



import com.example.demo.dto.CustomerDTO;
import com.example.demo.service.impl.CustomerServiceImpl;
import com.example.demo.util.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/customer")

public class CustomerController {
  @Autowired
    //property injection

  private CustomerServiceImpl customerService;

    @PostMapping("save")
    public ResponseUtill saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return new ResponseUtill(201,"Customer Saved",null);
    }



}
