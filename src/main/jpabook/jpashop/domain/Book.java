package src.main.jpabook.jpashop.domain;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Book extends Item {

  private String author;
  private String isbn;

}
