package lk.ijse.z13_springboot.controller;


import jakarta.persistence.criteria.Order;
import lk.ijse.z13_springboot.dto.OrderDTO;
import lk.ijse.z13_springboot.service.PlaceOrder;
import lk.ijse.z13_springboot.util.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    @Autowired
 private PlaceOrder placeOrder;

  @PostMapping("save")
    public ResponseUtill saveOrder(@RequestBody OrderDTO orderDTO) {
      placeOrder.saveOrder(orderDTO);
      return new ResponseUtill(201,"order save successfully",null);
  }
}
