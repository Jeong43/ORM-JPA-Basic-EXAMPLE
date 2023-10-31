package src.main.jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Delivery extends BaseEntity {

  @Id
  @GeneratedValue
  private Long id;
  private String city;
  private String street;
  private String zipcode;
  private DeliveryStatus status;
}
