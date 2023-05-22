package com.project.fullstack_ecommerce.repositories;

import com.project.fullstack_ecommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

// collectionResourceRel -> Name of Json Entry
// path -> /product-category
@RepositoryRestResource(collectionResourceRel = "products", path="products")
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

//     access a custom query method through the REST API, you need to use the /search
//    http://localhost:8080/api/products/search/findByCategoryId?id=1
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
