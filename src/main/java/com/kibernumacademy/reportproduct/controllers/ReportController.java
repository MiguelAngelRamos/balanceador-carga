package com.kibernumacademy.reportproduct.controllers;

import com.kibernumacademy.reportproduct.models.Product;
import com.kibernumacademy.reportproduct.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
@AllArgsConstructor
public class ReportController {
  private final ProductService productService;
  @GetMapping
  public ResponseEntity<List<Product>> getAllProducts() {
    List<Product> products = productService.listAllProducts();
    return new ResponseEntity<>(products, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Product> createProduct(@RequestBody Product product) {
    Product savedProductDTO = productService.saveOrUpdateProduct(product);
    return new ResponseEntity<>(savedProductDTO, HttpStatus.CREATED);
  }

}
