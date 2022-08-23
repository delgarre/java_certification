package com.javacert.streampractice;

import java.util.Set;

public class Product {

    private int id;

    private String name;
    private String category;
    private Double price;
    private Double withPrice;

    public Product(int id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.withPrice = withPrice;
        this.orders = orders;
    }

    //    @ManyToMany(mappedBy = "products")
//    @ToString.Exclude
    private Set<Order> orders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Double getWithPrice() {
        return withPrice;
    }

    public Product setWithPrice(Double withPrice) {
        Product product = new Product(1, "Peace", "Toys", 5.0);
        product.setPrice(withPrice);
        return product;
    }
}
