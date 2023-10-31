package src.main.jpabook.jpashop.domain;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Album extends Item {

  private String artist;
  private String etc;
}
