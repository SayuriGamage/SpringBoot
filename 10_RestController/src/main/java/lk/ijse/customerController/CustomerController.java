package lk.ijse.customerController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("customer")
@RestController
public class CustomerController {

@GetMapping
    public String getCustomer(){
        return "customer Controller";
    }
}
