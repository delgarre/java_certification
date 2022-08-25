package com.javacert.streampractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise8 {
    public static void main(String[] args) {

//        Exercise 8 — Calculate total lump sum of all orders placed in Feb 2021
//        All previous exercise was to output a record list by a terminal operation, let’s do some calculation this time.
//        This exercise is to sum up all the products ordered in Feb 2021. As you’ve gone through previous exercises,
//        you can easily obtain the list of products using filter() and flatMap() operations.
//        Next, you can make use of mapToDouble() operation to convert the stream into a stream of data type Double by specifying the price field as the mapping value.
//        At last, terminal operation sum() will help you add up all values and return the total value

        LocalDate orderdate1 = LocalDate.of(2021, 2, 13);
        LocalDate deliverydate1 = LocalDate.of(2021, 4, 13);
        LocalDate orderdate2 = LocalDate.of(2018, 8, 17);
        LocalDate deliverydate2 = LocalDate.of(2018, 9, 3);
        LocalDate orderdate3 = LocalDate.of(2019, 3, 21);
        LocalDate deliverydate3 = LocalDate.of(2019, 5, 22);
        LocalDate orderdate4 = LocalDate.of(2021, 3, 15);
        LocalDate deliverydate4 = LocalDate.of(2021, 4, 15);
        LocalDate orderdate5 = LocalDate.of(2016, 8, 17);
        LocalDate deliverydate5 = LocalDate.of(2016, 9, 3);

        Order order1 = new Order(1, orderdate1, deliverydate1, "delivered");
        Order order2 = new Order(2, orderdate2, deliverydate2, "delivered");
        Order order3 = new Order(3, orderdate3, deliverydate3, "delivered");
        Order order4 = new Order(4, orderdate4, deliverydate4, "delivered");
        Order order5 = new Order(5, orderdate5, deliverydate5, "delivered");

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);
        Product product2 = new Product(1,"Harry Potter", "Books", 1000.00);
        Product product3 = new Product(1,"Goosebumps", "Books", 150.00);

        Product product4 = new Product(1,"Music", "Entertainment", 250.00);
        Product product5 = new Product(1,"Code source", "Books", 100.00);
        Product product6 = new Product(1,"Cheese", "Food", 30.00);

        Set<Product> productList = new HashSet<>();
        Set<Product> productList2 = new HashSet<>();

        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        productList2.add(product4);
        productList2.add(product5);
        productList2.add(product6);
        order1.setProducts(productList2);
        order4.setProducts(productList);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
//        orders.add(order2);
//        orders.add(order3);
        orders.add(order4);
//        orders.add(order5);

        Double result = orders
                .stream()
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021,2,1)) >=0)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021,3,1)) <0)
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(p -> p.getPrice())
                .sum();

        System.out.println(result);


    }
}
