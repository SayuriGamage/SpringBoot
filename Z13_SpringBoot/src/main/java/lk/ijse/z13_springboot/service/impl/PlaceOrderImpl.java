package lk.ijse.z13_springboot.service.impl;
import lk.ijse.z13_springboot.entity.Order;
import jakarta.transaction.Transactional;
import lk.ijse.z13_springboot.dto.OrderDTO;
import lk.ijse.z13_springboot.dto.OrderDetailsDTO;
import lk.ijse.z13_springboot.entity.Item;
import lk.ijse.z13_springboot.entity.OrderDetails;
import lk.ijse.z13_springboot.repo.ItemRepo;
import lk.ijse.z13_springboot.repo.OrderDetailsRepo;
import lk.ijse.z13_springboot.repo.OrdersRepo;
import lk.ijse.z13_springboot.service.PlaceOrder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlaceOrderImpl implements PlaceOrder {
    @Autowired
    private OrdersRepo ordersRepo;
    @Autowired
    private OrderDetailsRepo orderDetailsRepo;
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional
    public void saveOrder(OrderDTO orderDTO) {
        if(ordersRepo.existsById(orderDTO.getId())){
            throw new RuntimeException("order already exists");
        }

        //save order
     Order   order = modelMapper.map(orderDTO, Order.class);
        ordersRepo.save(order);

        //update item qty
         for(OrderDetailsDTO orderDetailsDTO: orderDTO.getOrderDetails()){
             Optional<Item> optionalItem=itemRepo.findById(orderDetailsDTO.getItemId());
             Item item=optionalItem.get();
             item.setQuantity(item.getQuantity()-orderDetailsDTO.getQty());
             itemRepo.save(item);

             //save orderDetails
             OrderDetails orderDetails=modelMapper.map(orderDetailsDTO, OrderDetails.class);
             orderDetails.setOrder((lk.ijse.z13_springboot.entity.Order) order);
             orderDetailsRepo.save(orderDetails);
         }
    }
}
