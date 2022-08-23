package com.javacert.streampractice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {

//        Exercise 5 — Get the cheapest products of “Books” category

//        One of the effective ways to obtain the product with the lowest price is to sort the product list by price in an ascending order and get the first element.
//        Java Stream API provides sorted() operation for stream data sorting based on specific field attributes.
//        In order to obtain the first element in the stream, you can use the terminal operation findFirst().
//                The operation returns the first data element wrapped by Optional as it is possible that the output stream can be empty.
//
//        This solution can only return a single product record with the lowest price.
//                If there are multiple product records with the same lowest price, the solution should be modified such that it looks for the lowest price amount
//        first and then filters product records by the price amount so as to get a list of products with the same lowest price.

//        UPDATE:
//
//        Thanks
//        Александр Шаклеин
//        for your suggestion,
//        use min() is a better solution as the code is cleaner and it can be done
//        using 2 operatorsn(filter →min) instead of 3 (filter → sorted →findFirst).

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);
        Product product2 = new Product(1,"Harry Potter", "Books", 1000.00);
        Product product3 = new Product(1,"Goosebumps", "Books", 150.00);

        Set<Product> productList = new HashSet<>();

        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        System.out.println(productList.size());
        productList.forEach(p->{
            System.out.println(p.getName());
        });

        //Just in case list is empty
//        Optional<Product> result = productList
//                .stream()
//                .filter(p->p.getCategory().equalsIgnoreCase("Books"))
//                .min(Comparator.comparing(Product::getPrice));
       //To print result for testing
        String result = productList
                .stream()
                .filter(p->p.getCategory().equalsIgnoreCase("Books"))
                .min(Comparator.comparing(Product::getPrice))
                .get().getName();

        System.out.println(result);

    }
}
