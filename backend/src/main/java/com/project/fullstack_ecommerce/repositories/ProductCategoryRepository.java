package com.project.fullstack_ecommerce.repositories;

import com.project.fullstack_ecommerce.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-categories")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
