package lk.ijse.z13_springboot.service;

import lk.ijse.z13_springboot.dto.OrderDTO;

public interface PlaceOrder  {
    void saveOrder(OrderDTO orderDTO);

}
