use northwind;

SELECT * FROM orders;
SELECT * FROM order_details;
SELECT * FROM products;
-- get order_id, order_date, customer_id, total_price, discount, discounted_price, total_cost
SELECT 
	o.id AS order_id, 
	DATE_FORMAT(order_date, '%d/%m/%Y') AS order_date,
	o.customer_id,
    -- od.quantity as quantity,
	sum(od.quantity * od.unit_price) AS total_price,
    sum(od.quantity * od.unit_price * od.discount) AS Discount
FROM 
	orders as o
	LEFT JOIN order_details AS od 
    ON o.id = od.order_id
	LEFT JOIN products AS p 
    ON od.product_id = p.id 
	WHERE order_id=30;
-- GROUP BY id;
-- SELECT COUNT(*) FROM orders;

-- example from kenneth 
SELECT
	o.id as order_id,
	DATE_FORMAT(o.order_date, '%d/%m/%Y') as order_date,
	o.customer_id as customer_id,
	sum(od.quantity * od.unit_price) as total_price,
	sum(od.quantity * od.unit_price * od.discount) as discount,
	sum(od.quantity * od.unit_price) - sum(od.quantity * od.unit_price * od.discount) as discounted_price,
	sum(od.quantity * p.standard_cost) as cost_price
FROM
	orders o
	LEFT JOIN order_details od
	ON o.id = od.order_id
	LEFT JOIN products p
	ON od.product_id = p.id
	WHERE o.id = 30;