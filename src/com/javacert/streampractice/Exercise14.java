package com.javacert.streampractice;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise14 {
    public static void main(String[] args) {
//        Exercise 14 — Obtain a data map with list of product name by category
//        This exercise helps you get familiar with the way to transform the data output of data map entries.
//        If you only use Collectors.groupingBy(Product::getCategory),
//        then the output will be Map<Category, List of Products> but the expected output should be Map<Category, List of Product Name>.
//        You can use Collectors.mapping() to convert product objects to product names for the data map construction.

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);
        Product product2 = new Product(1,"Harry Potter", "Books", 1000.00);
        Product product3 = new Product(1,"Goosebumps", "Books", 150.00);

        Set<Product> productList = new HashSet<>();

        productList.add(product);
        productList.add(product2);
        productList.add(product3);

        Map<String, List<String>> result = productList
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.mapping(p -> p.getName(), Collectors.toList())
                        )
                );

        System.out.println(result);
    }
}
