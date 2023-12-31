package src.main.jpabook.jpashop.domain;

import static javax.persistence.FetchType.LAZY;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ORDERS")
public class Order extends BaseEntity {

  @Id
  @GeneratedValue
  @Column(name = "ORDER_ID")
  private Long id;
  @ManyToOne(fetch = LAZY)
  @JoinColumn(name = "MEMBER_ID")
  private Member member;
  @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
  private List<OrderItem> orderItems = new ArrayList<>();
  @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "DELIVERY_ID")
  private Delivery delivery;
  private LocalDateTime orderDate;
  @Enumerated(EnumType.STRING)
  private OrderStatus status;

  public void addOrderItem(OrderItem orderItem) {
    orderItems.add(orderItem);
    orderItem.setOrder(this);
  }
}
