package study.ssense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.ssense.entity.order.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
