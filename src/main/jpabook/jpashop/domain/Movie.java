package src.main.jpabook.jpashop.domain;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Movie extends Item {

  private String director;
  private String actor;

}
