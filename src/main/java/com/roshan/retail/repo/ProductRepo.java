package com.roshan.retail.repo;


import com.roshan.retail.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product, Long> {

    /*
    @Query("SELECT p FROM Product p WHERE p.id = :id")
    Product findByProductID(@Param("id") Integer id);
     */



    Optional<Product> findByName(String name);


    //void deleteByProductId(Long productId);
}
