package com.javacert.streampractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {

//        Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
//        In this exercise, you will see how to transform data using the stream API.
//        After you’ve obtained a product list with a category that belongs to “Toys” using filter(),
//                you can then apply a 10% discount to the product price by using map().

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);

//        product.setName("Diary of a wimpy kid");
//        product.setCategory("Toys");
//        product.setPrice(50.00);

        List<Product> productList = new ArrayList<>();

        productList.add(product);

        List<Product> result = productList
                .stream()
                .filter(p ->p.getCategory().equalsIgnoreCase("Toys"))
                .map(p -> p.setWithPrice(p.getPrice() * 0.9))
                .collect(Collectors.toList());

        result.forEach(p-> {
            System.out.println(result.size());
        });
        productList.forEach(product1 -> {
            product1.getCategory();
        });
    }
}
