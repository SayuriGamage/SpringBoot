package lk.ijse.z13_springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class OrderDetails {
    @Id
    private  int orderDetailId;
   @ManyToOne
   private Order order;
    private int ItemId;
    private  int qty;

    public OrderDetails() {
    }

    public OrderDetails(int orderDetailId, Order order, int itemId, int qty) {
        this.orderDetailId = orderDetailId;
        this.order = order;
        ItemId = itemId;
        this.qty = qty;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
