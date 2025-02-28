package lk.ijse.controller;


import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JasonController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    public String test1(@RequestBody CustomerDTO customerDTO){
       return customerDTO.toString();
    }

    @GetMapping(path="getall" , produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> test3(){
        ArrayList<CustomerDTO> list = new ArrayList<>();
            list.add(new CustomerDTO("sayuri","yashodhara",11));
            list.add(new CustomerDTO("sayuri","yashodhara",11));
            list.add(new CustomerDTO("sayuri","yashodhara",11));
            list.add(new CustomerDTO("sayuri","yashodhara",11));
            return list;

    }
}
