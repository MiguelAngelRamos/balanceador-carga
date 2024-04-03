package com.kibernumacademy.reportproduct.repositories;

import com.kibernumacademy.reportproduct.beans.LoadBalancerConfiguration;
import com.kibernumacademy.reportproduct.models.Product;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name="product-msv")
@LoadBalancerClient(name="product-msv", configuration = LoadBalancerConfiguration.class)
public interface ProductRepository {
//  http://localhost:55519/product-msv/products
  @GetMapping(path="/product-msv/products")
  public List<Product> getAllProducts();

  @PostMapping(path="/product-msv/products")
  public Product createProduct(@RequestBody Product product);

}
