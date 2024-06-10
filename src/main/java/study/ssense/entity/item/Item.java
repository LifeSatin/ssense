package study.ssense.entity.item;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.ssense.entity.CreatedDateBaseEntity;

import static jakarta.persistence.InheritanceType.*;
import static lombok.AccessLevel.*;

@Entity
@Getter
@Inheritance(strategy = JOINED)
@DiscriminatorColumn
@NoArgsConstructor(access = PROTECTED)
public class Item extends CreatedDateBaseEntity {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private long id;

    private String item_name;
    private int price;
    private String designer;
    private int stock;
    private int view;

    public void addStock(int quantity) {
        this.stock += quantity;
    }

    public void removeStock(int quantity) {
        int restStock = this.stock - quantity;
        if (restStock < 0) {
            throw new RuntimeException("need more stock");
        }
        this.stock = restStock;
    }
}
