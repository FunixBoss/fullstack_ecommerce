package com.project.fullstack_ecommerce.repositories;

import com.project.fullstack_ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

// collectionResourceRel -> Name of Json Entry
// path -> /product-category
@RepositoryRestResource(collectionResourceRel = "products", path="products")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
