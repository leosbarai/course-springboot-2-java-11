package br.com.leonardosbarai.course.repositories;

import br.com.leonardosbarai.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
