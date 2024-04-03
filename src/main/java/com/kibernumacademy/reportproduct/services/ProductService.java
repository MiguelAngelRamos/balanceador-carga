package com.kibernumacademy.reportproduct.services;

import com.kibernumacademy.reportproduct.models.Product;
import com.kibernumacademy.reportproduct.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {


  private final ProductRepository productRepository;
  public List<Product> listAllProducts() {
    return productRepository.getAllProducts();
  }
  public Product saveOrUpdateProduct(Product product) {
    return productRepository.createProduct(product);
  }

//  public Optional<Product> getProductById(Long id) {
//    return productRepository.findById(id);
//  }

//  public void deleteProductById(Long id) {
//    productRepository.deleteById(id);
//  }


}
