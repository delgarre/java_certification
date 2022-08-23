package com.javacert.streampractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[] args) {

//        Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
//        This is obviously a filtering logic, the output should fulfill the two filtering requirements.
//        So, you can apply 2 filter() operations to obtain the result.

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);

//        product.setName("Diary of a wimpy kid");
//        product.setCategory("Books");
//        product.setPrice(50.00);
//        product.setName("Goosebumps");
//        product.setCategory("Books");
//        product.setPrice(150.00);
//
//        product.setName("Toilet tissue");
//        product.setCategory("Toiletries");
//        product.setPrice(250.00);
        List<Product> productList = new ArrayList<>();



        productList.add(product);
//        productList.add(product2);
//        productList.add(product3);

        List<Product> result = productList
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
        result.forEach(pr ->{
            System.out.println(pr.getCategory());
        });
        //System.out.println(product.getId());
        System.out.println(productList.size());
    }
    public static List getName(List<Product> names){

        names.forEach(n ->{
             n.getName();
            System.out.println(n.getName());
        });
        return names;
    }

}
