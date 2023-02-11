package com.workshop.day23.query;

public class Queries {
    public static final String GET_DETAILS_BY_ID = """
        SELECT 
            o.id AS order_id, 
            DATE_FORMAT(order_date, '%d/%m/%Y') AS order_date,
            o.customer_id,
            -- od.quantity as quantity,
            sum(od.quantity * od.unit_price) AS total_price,
            sum(od.quantity * od.unit_price * od.discount) AS discount,
            sum(od.quantity * od.unit_price * (1 - od.discount)) AS discounted_price,
            sum(od.quantity * p.standard_cost) AS total_cost
        FROM 
            orders as o
            LEFT JOIN order_details AS od 
            ON o.id = od.order_id
            LEFT JOIN products AS p 
            ON od.product_id = p.id 
            WHERE order_id=?;""";
            
}
