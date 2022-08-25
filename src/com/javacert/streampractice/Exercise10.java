package com.javacert.streampractice;

import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.Set;

public class Exercise10 {
    public static void main(String[] args) {

//        Exercise 10 — Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”
//        What if you need to get sum, average, max, min and count at the same time?
//        Should we run the data stream 5 times to get those figures one by one? Such an approach is not quite effective.
//        Luckily, stream API provides a convenient way to get all those values at once by using terminal operation summaryStatistics().
//        It returns a data type DoubleSummaryStatistics which contains all the required figures.

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);
        Product product2 = new Product(1,"Harry Potter", "Books", 1000.00);
        Product product3 = new Product(1,"Goosebumps", "Books", 150.00);

        Product product4 = new Product(1,"Music", "Entertainment", 250.00);
        Product product5 = new Product(1,"Code source", "Books", 100.00);
        Product product6 = new Product(1,"Cheese", "Food", 30.00);

        Set<Product> productList = new HashSet<>();

        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        DoubleSummaryStatistics statistics = productList
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .mapToDouble(p -> p.getPrice())
                .summaryStatistics();

        System.out.println(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f",
                statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum()));
    }
}
