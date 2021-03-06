package one.digitalinnovationexperts.productcatalog.controller;


import one.digitalinnovationexperts.productcatalog.model.Product;
import one.digitalinnovationexperts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // metodo criar produtp
    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){

        return productRepository.save(product);

    }

    // Consulta produto pelo id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id){

        return productRepository.findById(id);
    }
}
