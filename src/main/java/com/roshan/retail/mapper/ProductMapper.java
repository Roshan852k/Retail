package com.roshan.retail.mapper;

import com.roshan.retail.dto.ProductRequest;
import com.roshan.retail.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {

    public Product toEntity(ProductRequest request) {
        return Product.builder()
                .name(request.name())
                .price(request.price())
                .build();
    }
}
