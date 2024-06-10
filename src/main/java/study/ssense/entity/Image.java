package study.ssense.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import study.ssense.entity.item.Item;

import static jakarta.persistence.FetchType.*;
import static lombok.AccessLevel.*;

@Entity
@NoArgsConstructor(access = PROTECTED)
public class Image {

    @Id @GeneratedValue
    @Column(name = "image_id")
    private long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    private String image;
}
