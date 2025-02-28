package lk.ijse.z13_springboot.repo;

import lk.ijse.z13_springboot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends JpaRepository<Order,Integer> {
}
