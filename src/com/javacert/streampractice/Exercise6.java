package com.javacert.streampractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {

//        Exercise 6 — Get the 3 most recent placed order
//        Similar to previous exercise, the obvious solution is to sort the order records by order date field.
//        The tricky part is that the sorting this time should be in descending order such that you can obtain the order records with the most recent order date.
//        It can be achieved simply by calling Comparator.reversed().

        LocalDate orderdate1 = LocalDate.of(2017, 1, 13);
        LocalDate deliverydate1 = LocalDate.of(2017, 1, 13);
        LocalDate orderdate2 = LocalDate.of(2018, 8, 17);
        LocalDate deliverydate2 = LocalDate.of(2018, 9, 3);
        LocalDate orderdate3 = LocalDate.of(2019, 3, 21);
        LocalDate deliverydate3 = LocalDate.of(2019, 5, 22);
        LocalDate orderdate4 = LocalDate.of(2021, 8, 17);
        LocalDate deliverydate4 = LocalDate.of(2021, 9, 3);
        LocalDate orderdate5 = LocalDate.of(2016, 8, 17);
        LocalDate deliverydate5 = LocalDate.of(2016, 9, 3);

        Order order1 = new Order(1, orderdate1, deliverydate1, "delivered");
        Order order2 = new Order(2, orderdate2, deliverydate2, "delivered");
        Order order3 = new Order(3, orderdate3, deliverydate3, "delivered");
        Order order4 = new Order(4, orderdate4, deliverydate4, "delivered");
        Order order5 = new Order(5, orderdate5, deliverydate5, "delivered");

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);

        List<Order> result = orders
                .stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
        result.forEach(order -> {
            System.out.println(order.getId());
        });
    }
}
