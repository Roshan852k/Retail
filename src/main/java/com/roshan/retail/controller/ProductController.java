package com.roshan.retail.controller;


import com.roshan.retail.dto.ProductRequest;
import com.roshan.retail.dto.ProductResponse;
import com.roshan.retail.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

}
