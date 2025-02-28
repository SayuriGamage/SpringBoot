package lk.ijse.spring_boot.repo;

import lk.ijse.spring_boot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepos extends JpaRepository<Customer,Integer> {
}
