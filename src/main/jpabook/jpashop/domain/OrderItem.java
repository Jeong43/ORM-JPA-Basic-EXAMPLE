package src.main.jpabook.jpashop.domain;

import static javax.persistence.FetchType.LAZY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class OrderItem extends BaseEntity {

  @Id
  @GeneratedValue
  @Column(name = "ORDER_ITEM_ID")
  private Long id;
  @ManyToOne(fetch = LAZY)
  @JoinColumn(name = "ORDER_ID")
  private Order order;
  @ManyToOne
  @JoinColumn(name = "ITEM_ID")
  private Item item;
  private int orderPrice;
  private int count;
}
