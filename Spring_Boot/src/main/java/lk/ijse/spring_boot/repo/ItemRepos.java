package lk.ijse.spring_boot.repo;

import lk.ijse.spring_boot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepos extends JpaRepository<Item, Integer> {


}
