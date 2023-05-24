package ch.finecloud.springorderservice.repositories;

import ch.finecloud.springorderservice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
