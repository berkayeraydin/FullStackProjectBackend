package com.fullStackProjectBackend.berkay.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product,Integer> {
}
