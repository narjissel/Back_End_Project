package ma.fpl.ecoapp;

import ma.fpl.ecoapp.Entity.Product;
import ma.fpl.ecoapp.Entity.User;
import ma.fpl.ecoapp.Repository.ProductRepository;
import ma.fpl.ecoapp.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;

@EnableCassandraRepositories(basePackages = {"ma.fpl.ecoapp.Repository"})

//@ComponentScan(basePackages = {"ma.fpl.ecoapp.Repository"})
@SpringBootApplication
public class EcoAppApplication implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository ;

  @Autowired
  private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcoAppApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {

    // Création d'un nouvel UUID pour le produit
    UUID productId = UUID.randomUUID();

    // Création d'un nouveau produit avec l'UUID généré
    Product product1 = new Product(
      UUID.randomUUID(),
      "smart TV sumsung ",
      "A high-quality smart tv",
      "https://i.pinimg.com/564x/53/67/23/536723d385c116190aa27235573ef619.jpg",
      "smart tv sumsung",
      new BigDecimal("9699.99"),
      "High-Quality tv "
    );

    Product product2 = new Product(
      UUID.randomUUID(),
      "samrt phone sumsung ",
      "samrt phone r",
      "https://i.pinimg.com/564x/dd/f7/66/ddf7664b505258ce0532658ae86456f6.jpg",
      "samrt phone  ",
      new BigDecimal("3199.99"),
      "samrt phone "
    );

    Product product3 = new Product(
      UUID.randomUUID(),
      "tablet",
      "A best-selling tablet ",
      "https://i.pinimg.com/736x/a9/68/81/a968818dc6aad5ac5ec6874facb4ac7a.jpg",
      "Novel",
      new BigDecimal("1115.99"),
      "Best ablet "
    );

    // Enregistrement des produits dans la base de données
    productRepository.saveAll(Arrays.asList(product1, product2, product3));

    // Affichage d'un message de confirmation
    System.out.println("Products registered successfully!");



    /////////////////////////////////////////////////////////////////////////////////////////////////
    // Création d'un nouvel UUID
    UUID userId = UUID.randomUUID();

    // Création d'un nouvel utilisateur avec l'UUID généré
    User user = new User(1L, "master@DevOps.com", "Master ", "password123");

   // User user = new User(4L, "narjiss@DevOps.com", "Narjiss ", "password");
    //User user = new User(5L, "nono11@DevOps.com", "nono ", "password987");

    // Enregistrement de l'utilisateur dans la base de données
    //userRepository.save(user);

    // Affichage d'un message de confirmation
    System.out.println("New user registered successfully!");



  }

}
