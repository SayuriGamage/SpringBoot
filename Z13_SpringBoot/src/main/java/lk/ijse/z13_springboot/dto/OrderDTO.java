package lk.ijse.z13_springboot.dto;

import java.util.List;

public class OrderDTO {

    private  int id;
    private String date;
    private int customerId;
    private List<OrderDetailsDTO> orderDetails;

    public OrderDTO() {
    }

    public OrderDTO(int id, String date, int customerId, List<OrderDetailsDTO> orderDetails) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
        this.orderDetails = orderDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<OrderDetailsDTO> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetailsDTO> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
