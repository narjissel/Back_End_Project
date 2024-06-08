package ma.fpl.ecoapp.Entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Table("products")
public class Product {

  @PrimaryKey
  private UUID id;
  private String category;
  private String description;
  private String image;
  private String name;
  private BigDecimal price;
  private String title;

  // Constructeur par défaut
  public Product() {
  }

  // Constructeur avec paramètres
  public Product(UUID id, String category, String description, String image, String name, BigDecimal price, String title) {
    this.id = id;
    this.category = category;
    this.description = description;
    this.image = image;
    this.name = name;
    this.price = price;
    this.title = title;
  }



  // Getters and setter
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
