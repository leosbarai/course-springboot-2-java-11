package br.com.leonardosbarai.course.repositories;

import br.com.leonardosbarai.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
