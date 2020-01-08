package br.com.leonardosbarai.course.repositories;

import br.com.leonardosbarai.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
