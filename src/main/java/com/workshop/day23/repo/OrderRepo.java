package com.workshop.day23.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.workshop.day23.model.Order;

import static com.workshop.day23.query.Queries.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;


// class to extract data from SQL (Query)
@Repository
public class OrderRepo {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Order getOrderDetails(Integer id) throws InvalidResultSetAccessException, ParseException {
        SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_DETAILS_BY_ID, id);
        rs.next();
        Order o = new Order();
        o.setOrderId(rs.getInt("order_id"));
        o.setOrderDate(new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString("order_date")));
        o.setCustomerId(rs.getInt("customer_id"));
        o.setTotalPrice(rs.getFloat("total_price"));
        o.setDiscount(rs.getFloat("discount"));
        o.setDiscountedPrice(rs.getFloat("discounted_price"));
        o.setTotalCost(rs.getFloat("total_cost"));
        
        return o;
    }




}
