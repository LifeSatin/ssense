package study.ssense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.ssense.entity.item.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
