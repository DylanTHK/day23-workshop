package com.workshop.day23.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.workshop.day23.model.Order;

import static com.workshop.day23.query.Queries.*;


import java.util.LinkedList;
import java.util.List;


// class to extract data from SQL (Query)
@Repository
public class OrderRepo {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Order getOrderDetails(Integer id) {
        SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_DETAILS_BY_ID, id);
        List<Order> orders = new LinkedList<>();
        
        while (rs.next()) {
            Order o = new Order();

            if (rs.getInt("order_id") == 0) {
                break;
            }
            System.out.println("Valid Row Found, Continuing");
            o.setOrderId(rs.getInt("order_id"));
            // o.setOrderDate(new DateTime(
            //     DateTimeFormat.forPattern("dd/MM/yyyy")
            //             .parseDateTime(rs.getString("order_date"))));
            o.setCustomerId(rs.getInt("customer_id"));
            o.setTotalPrice(rs.getFloat("total_price"));
            o.setDiscount(rs.getFloat("discount"));
            o.setDiscountedPrice(rs.getFloat("discounted_price"));
            o.setTotalCost(rs.getFloat("total_cost"));
            orders.add(o);
            System.out.println("ADDED ORDER");
        } 
        
        System.out.println("EXITED WHILE LOOP");
        if (orders.size() > 0) {
            System.out.println("List Value: " + orders.get(0));
            return orders.get(0);
        }
        return null;
    }




}
