package ma.fpl.ecoapp.Service;

import ma.fpl.ecoapp.Entity.Product;
import ma.fpl.ecoapp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  public Optional<Product> getProductById(UUID id) {
    return productRepository.findById(id);
  }

  //creation
  public Product saveProduct(Product product) {
    return productRepository.save(product);
  }

  public void deleteProduct(UUID id) {
    productRepository.deleteById(id);
  }
}
