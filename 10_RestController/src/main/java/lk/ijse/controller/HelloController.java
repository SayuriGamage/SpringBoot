package lk.ijse.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")

public class HelloController {

    @GetMapping
  public String sayHello() {

        return "get Mapping invoked";
  }
   @PostMapping
    public String sayHelloPost() {

        return " post Mapping invoked";
    }
}
