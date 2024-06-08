package ma.fpl.ecoapp.Repository;

import ma.fpl.ecoapp.Entity.Product;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
@ComponentScan(basePackages = {"Repository"})
public interface ProductRepository extends CassandraRepository<Product, UUID> {
}
