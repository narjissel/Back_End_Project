package ma.fpl.ecoapp;

import Entity.User;
import Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import java.util.UUID;

@EnableCassandraRepositories(basePackages = {"Repository"})
@ComponentScan(basePackages = {"Repository"})
@SpringBootApplication
public class EcoAppApplication implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository ;

	public static void main(String[] args) {
		SpringApplication.run(EcoAppApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    // Création d'un nouvel UUID
    UUID userId = UUID.randomUUID();

    // Création d'un nouvel utilisateur avec l'UUID généré
    User user = new User(1L, "master@DevOps.com", "Master ", "password123");

    // Enregistrement de l'utilisateur dans la base de données
    userRepository.save(user);

    // Affichage d'un message de confirmation
    System.out.println("New user registered successfully!");
  }

}
