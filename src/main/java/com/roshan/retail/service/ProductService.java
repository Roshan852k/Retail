package com.roshan.retail.service;

import com.roshan.retail.dto.ProductRequest;
import com.roshan.retail.entity.Product;
import com.roshan.retail.mapper.ProductMapper;
import com.roshan.retail.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo repo;
    private final ProductMapper mapper;

    public String addProduct(ProductRequest request) {
        Product product = mapper.toEntity(request);
        repo.save(product);
        return "Product Added Successfully";
    }
}
