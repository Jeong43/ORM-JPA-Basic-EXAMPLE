package src.main.jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public abstract class Item extends BaseEntity {

  @Id
  @GeneratedValue
  @Column(name = "ITEM_ID")
  private Long id;
  private String name;
  private int price;
  private int stockQuantity;
  @ManyToMany(mappedBy = "items")
  private List<Category> categories = new ArrayList<>();
}
