package Entity;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import com.datastax.oss.driver.api.core.type.codec.TypeCodecs;


import java.util.UUID;


@Table("test_table")
public class User {

  @PrimaryKey

 // private UUID id;
  private  long id ;

  private String email;
  private String name;
  private String password;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
/*
  public User(UUID id, String email, String name, String password) {
    this.id = id;
    this.email = email;
    this.name = name;
    this.password = password;

  }
 */

  public User(long id, String email, String name, String password) {
  //  this.id = UUID.fromString(String.valueOf(id));
    this.id = id ;
    this.email = email;
    this.name = name;
    this.password = password;
  }


}
