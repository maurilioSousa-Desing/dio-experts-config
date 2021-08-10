package one.digitalinnovationexperts.productcatalog.repository;

import one.digitalinnovationexperts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
