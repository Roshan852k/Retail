package com.roshan.retail.controller;


import com.roshan.retail.dto.ProductRequest;
import com.roshan.retail.dto.ProductResponse;
import com.roshan.retail.entity.Product;
import com.roshan.retail.service.ProductService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody ProductRequest request) {
        return ResponseEntity.ok(productService.addProduct(request));
    }

    @GetMapping("/{name}")
    public ResponseEntity<ProductResponse> getCustomer(@PathVariable("name") String name) {
        return ResponseEntity.ok(productService.retrieveProduct(name));
    }

    @DeleteMapping ("/delete")
    public ResponseEntity<String> deleteProductByName(@RequestParam String name) {
        return ResponseEntity.ok(productService.deleteProductByName(name));
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateProductPrice(@RequestParam String name, @RequestParam Integer newprice) {
        return ResponseEntity.ok(productService.updateProductPrice(name, newprice));
    }

    @GetMapping("/top2InPriceRange")
    public ResponseEntity<List<Product>> getTop2Product() {
        List<Product> products = productService.getTop2Product();
        return ResponseEntity.ok(products);
    }
}
