package lk.ijse.z13_springboot.dto;

public class OrderDetailsDTO {

    private  int orderDetailId;
    private  int orderId;
    private int ItemId;
    private  int qty;

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public OrderDetailsDTO(int orderDetailId, int orderId, int itemId, int qty) {
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        ItemId = itemId;
        this.qty = qty;
    }

    public OrderDetailsDTO() {
    }
}
