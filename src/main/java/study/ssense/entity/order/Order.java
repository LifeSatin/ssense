package study.ssense.entity.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import study.ssense.entity.CreatedDateBaseEntity;
import study.ssense.entity.member.Member;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.*;
import static jakarta.persistence.FetchType.*;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "orders")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Order extends CreatedDateBaseEntity {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Enumerated(STRING)
    private OrderStatus status;
}
