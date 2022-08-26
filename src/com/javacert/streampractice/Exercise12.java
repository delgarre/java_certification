package com.javacert.streampractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise12 {
    public static void main(String[] args) {
//        Exercise 12 — Produce a data map with order records grouped by customer
//        This exercise is to consolidate a list of orders by customer.
//        Collectors.groupingBy() is a handy function, you can just simply specify what is the key data element, it will then aggregate data for you.


        Customer customer1 = new Customer(1, "Delenis", 3);
        Customer customer2 = new Customer(2, "Tim", 5);
        Customer customer3 = new Customer(3, "Jake", 2);
//        Customer customer4 = new Customer(4, "KeeAna", 1);

//        Customer customer5 = new Customer(5, "Josh", 3);
//        Customer customer6 = new Customer(6, "Ben", 1);
//        Customer customer7 = new Customer(7, "Tia", 4);
//        Customer customer8 = new Customer(8, "Kita", 3);
//
//        Customer customer9 = new Customer(9, "Bill", 4);
//        Customer customer10 = new Customer(10, "Nick", 2);
//        Customer customer11 = new Customer(11, "Pete", 5);
//        Customer customer12 = new Customer(12, "John", 1);

        LocalDate orderdate1 = LocalDate.of(2021, 2, 13);
        LocalDate deliverydate1 = LocalDate.of(2021, 4, 13);
        LocalDate orderdate2 = LocalDate.of(2018, 8, 17);
        LocalDate deliverydate2 = LocalDate.of(2018, 9, 3);
        LocalDate orderdate3 = LocalDate.of(2019, 3, 21);
        LocalDate deliverydate3 = LocalDate.of(2019, 5, 22);


        Order order1 = new Order(1, orderdate1, deliverydate1, "delivered");
        Order order2 = new Order(2, orderdate2, deliverydate2, "delivered");
        Order order3 = new Order(3, orderdate3, deliverydate3, "delivered");

        order1.setCustomer(customer1);
        order2.setCustomer(customer2);
        order3.setCustomer(customer3);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        Map<Customer, List<Order>> result = orders
                .stream().collect(
                        Collectors.groupingBy(Order::getCustomer)
                );

        //Use key set to loop through Map
        result.keySet().stream().forEach(customer -> {
            System.out.println(customer.getName());
        });
    }
}
