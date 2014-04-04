package base.vraptor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
  @Id @GeneratedValue
  private Long id;
  private String name;
  private String description;
  private Double price;

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return this.description;
  }

  public Double getPrice() {
    return this.price;
  }

  public void setName() {
    this.name = name;
  }

  public void setDescription() {
    this.description = description;
  }

  public void setPrice() {
    this.price = price;
  }
}
