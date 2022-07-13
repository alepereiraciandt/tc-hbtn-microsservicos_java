package com.example.product.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Product {
    private Long id;
    private String code;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime createdOne;
    private Boolean status;

    public Product() {
    }

    public Product(Long id, String code, String name, String description, BigDecimal price, LocalDateTime createdOne, Boolean status) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdOne = createdOne;
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCreatedOne(LocalDateTime createdOne) {
        this.createdOne = createdOne;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDateTime getCreatedOne() {
        return createdOne;
    }

    public Boolean getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!id.equals(product.id)) return false;
        if (code != null ? !code.equals(product.code) : product.code != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        if (createdOne != null ? !createdOne.equals(product.createdOne) : product.createdOne != null) return false;
        return status != null ? status.equals(product.status) : product.status == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (createdOne != null ? createdOne.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
