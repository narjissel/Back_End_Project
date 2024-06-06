package ma.fpl.ecoapp.Controleur;

import ma.fpl.ecoapp.Entity.LoginRequest;
import ma.fpl.ecoapp.Entity.User;
import ma.fpl.ecoapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  private UserService userService;


  @PostMapping("/register")
  public ResponseEntity<User> registerUser(@RequestBody User user) {
    User savedUser = userService.saveUser(user);
    return ResponseEntity.ok(savedUser);
  }


  @PostMapping("/creat")
  public User createUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @PostMapping("/login")
  public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
    User user = userService.loginUser(loginRequest.getEmail(), loginRequest.getPassword());
    if (user != null) {
      return ResponseEntity.ok(user);
    } else {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
    }
  }


  @GetMapping
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }
}
