package com.roshan.retail.repo;


import com.roshan.retail.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    /*
    @Query("SELECT p FROM Product p WHERE p.id = :id")
    Product findByProductID(@Param("id") Integer id);
     */

    //void deleteByProductId(Long productId);
}
