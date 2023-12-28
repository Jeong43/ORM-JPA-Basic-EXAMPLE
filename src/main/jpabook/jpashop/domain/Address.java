package src.main.jpabook.jpashop.domain;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Value;

@Embeddable
@Value
public class Address {

  @Column(length = 10)
  String city;
  @Column(length = 20)
  String street;
  @Column(length = 5, name = "ZIPCODE")
  String zipcode;

  public Address() {
    city = null;
    street = null;
    zipcode = null;
  }

  public Address(String city, String street, String zipcode) {
    this.city = city;
    this.street = street;
    this.zipcode = zipcode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(city, address.city) && Objects.equals(street,
        address.street) && Objects.equals(zipcode, address.zipcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, street, zipcode);
  }

  public String fullAddress() {
    return city + " " + street + " " + zipcode;
  }

}
