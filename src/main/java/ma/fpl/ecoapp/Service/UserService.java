package ma.fpl.ecoapp.Service;

import ma.fpl.ecoapp.Entity.User;
import ma.fpl.ecoapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;


  public User saveUser(User user) {
    // Logique de validation des données utilisateur
    // Enregistrement de l'utilisateur dans la base de données Cassandra
    return userRepository.save(user);
  }

  public User loginUser(String email, String password) {
    // Logique de vérification des informations d'identification de l'utilisateur
    return userRepository.findByEmailAndPassword(email, password);
  }



  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
