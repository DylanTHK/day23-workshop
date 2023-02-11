package com.workshop.day23.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import static com.workshop.day23.query.Queries.*;


// class to extract data from SQL (Query)
@Repository
public class OrderRepo {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void getOrderDetails(Integer id) {
        SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_DETAILS_BY_ID, id);
        
    }




}
