package com.kibernumacademy.reportproduct.models;


import java.math.BigDecimal;

public class Product {

  private long id;
  private String name;
  private BigDecimal price;

  protected Product() {}

  public Product(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


}

