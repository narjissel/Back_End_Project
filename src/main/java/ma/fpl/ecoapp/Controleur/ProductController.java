package ma.fpl.ecoapp.Controleur;

import ma.fpl.ecoapp.Entity.Product;
import ma.fpl.ecoapp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping
  public List<Product> getAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping("/{id}")
  public Optional<Product> getProductById(@PathVariable UUID id) {
    return productService.getProductById(id);
  }

  @PostMapping
  public Product createProduct(@RequestBody Product product) {
    product.setId(UUID.randomUUID()); // Generate UUID for new products
    return productService.saveProduct(product);
  }

  @PutMapping("/{id}")
  public Product updateProduct(@PathVariable UUID id, @RequestBody Product product) {
    product.setId(id);
    return productService.saveProduct(product);
  }

  @DeleteMapping("/{id}")
  public void deleteProduct(@PathVariable UUID id) {
    productService.deleteProduct(id);
  }
}

