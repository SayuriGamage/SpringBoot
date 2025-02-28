package lk.ijse.z13_springboot.repo;

import lk.ijse.z13_springboot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo  extends JpaRepository<Item, Integer> {
}
