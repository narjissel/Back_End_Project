package ma.fpl.ecoapp.Repository;

import ma.fpl.ecoapp.Entity.User;
//import org.springframework.data.cassandra.config.EnableCassandraAuditing;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"Repository"})

public interface UserRepository extends CassandraRepository<User, String> {
  @AllowFiltering
  User findByEmailAndPassword(String email, String password);
}
