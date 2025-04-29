D:
cd "D:\program\postgreSQL\bin>"
psql -h localhost -p 5432 -U admin_dell -d dellstore

psql -h localhost -p 5432 -U admin_dell -d dellstore -f psql -h localhost -p 5432 -U admin_dell -d dellstore -f "D:\th csdl\dellstore2-normal-1.0 (1).sql"


SELECT *
FROM orders
WHERE orderdate =' 2004-01-27 '
LIMIT 10;


-- List of product categories
SELECT category, count(*)
FROM products
GROUP BY category
ORDER BY category;


SELECT * 
FROM categories;

SELECT * 
FROM categories_category_seq;
--LIMIT 10;

 --List of products in the "Documentary" category
SELECT s.prod_id productid, s.category, s.title, c.categoryname
FROM products s FULL OUTER JOIN categories c USING (category)
WHERE c.categoryname = 'Documentary'
ORDER BY category;

 --List of product categories along with the corresponding number of products
SELECT c.category, count(prod_id), c.categoryname
FROM products s FULL OUTER JOIN categories c USING (category)
GROUP BY c.category
ORDER BY c.category;
 --List of products that have never been ordered
 /*
SELECT * 
FROM orderlines
LIMIT 20;

SELECT *
FROM products
ORDER BY prod_id
LIMIT 20;


WITH tmp AS 
    (SELECT count(o.prod_id), o.prod_id
        FROM products s FULL OUTER JOIN orderlines o USING (prod_id)
        GROUP BY o.prod_id
    )
SELECT prod_id,  count(prod_id)
FROM tmp
GROUP BY prod_id
HAVING count(prod_id) = 0;
*/

SELECT count(o.prod_id), s.prod_id
FROM products s FULL OUTER JOIN orderlines o USING (prod_id)
GROUP BY s.prod_id
HAVING count(o.prod_id) = 0;


SELECT * 
FROM products
WHERE prod_id NOT IN (SELECT prod_id FROM orderlines);
/*
WITH tmp AS 
    (SELECT c.clazz_id, name, count(student_id) as sosinhvien
        FROM students s FULL OUTER JOIN clazz c USING (clazz_id)
        GROUP BY c.clazz_id
    )
SELECT  *
FROM tmp
-- comment      
WHERE sosinhvien = ( SELECT MAX(sosinhvien) FROM tmp);
*/
 --Where do our customers come FROM? (List of countries)
SELECT country 
FROM customers
GROUP BY country;
 --List of countries along with the number of customers FROM each country
SELECT country country, count(country) numberCusOfCountry
FROM customers
GROUP BY country;

#VIEW 


 1.List of product categories
 SELECT  DISTINCT categoryname FROM categories
 2.List of products in the "Documentary" category
SELECT *
FROM products 
JOIN categories ON categories.category= products.category
WHERE lower(categories.categoryname) = 'documentary' ;

3.List of product categories along with the corresponding number of products
SELECT c.category, c.categoryname, COUNT(p.prod_id)
FROM products p
JOIN categories c ON p.category = c.category
GROUP BY c.category, c.categoryname
ORDER BY c.category;

4.List of products that have never been ordered
SELECT *
FROM products p
LEFT JOIN orderlines o ON  p.prod_id = o.prod_id
WHERE o.prod_id IS NULL
ORDER BY o.prod_id;

SELECT * FROM orderlines 
WHERE prod_id BETWEEN 1970 AND 2020
ORDER BY prod_id;
5.Where do our customers come FROM? (List of countries)
CREATE VIEW myview AS
SELECT DISTINCT country 
FROM customers;

INSERT INTO myview VALUES ('vietnam'),('lao'),('campuchia')
6.List of countries along with the number of customers FROM each country
SELECT  country, COUNT(country)
FROM customers
GROUP BY country;

INSERT INTO customers(firstname, lastname, address1, city, country, region, gender, creditcardtype, creditcard, creditcardexpiration, age, username, password ) VALUES ('Luong Van ','Hung', 'Lang Son', 'Ha Noi', 'VietNam',3, 'M', 1, '1000000000',  2012/03 , 18, 'luong van hung', 'password')

7.List of customers who have never placed an order
SELECT * 
FROM customers c
LEFT JOIN orders o ON c.customerid = o.customerid
WHERE o.customerid IS NULL
ORDER BY c.customerid;
-- 8.Number of orders by date
SELECT orderdate ,  COUNT(orderid )
FROM orders 
GROUP BY orderdate
ORDER BY orderdate;
-- 9.Number of products purchased on February 3, 2004 

SELECT SUM(ol.quantity)
FROM orders o
JOIN orderlines ol ON o.orderid= ol.orderid
WHERE ol.orderdate = '02-03-2004';

SELECT *
FROM orderlines
WHERE orderdate = '02-03-2004';
-- 10. Display the average order value (i.e., the average total amount per 
-- order) 
SELECT avg(totalamount)
FROM orders;
-- 11. Display a list of the best-selling products
SELECT * 
FROM inventory i
JOIN products p ON p.prod_id = i.prod_id
WHERE i.sales > 30
ORDER BY i.sales DESC;
-- 12. List of regular customers (based on the number of orders). A regular 
-- customer is someone who has made more than three purchases 
-- FROM the store.
SELECT  c.customerid, c.firstname, c.lastname, count(o.customerid) 
FROM orders o
JOIN customers c ON c.customerid = o.customerid
GROUP BY c.customerid
HAVING count(o.customerid)>3
ORDER BY count DESC;
-- 13. How many customers have credit card that expired in September 
-- 2008

-- 14. Provide detailed information about the products in the order with 
-- Order ID 942, including: orderlineid, prod_id, product title, quantity, 
-- unit price (with currency unit), amount (with currency unit):
-- Orderlineid |Prod_id | Title     |Quantity|Unitprice|amount
-- 1           |  7979  |   Aladin  |     3  |28.99 $  |86.99$
SELECT ol.orderlineid, p.prod_id, p.title, ol.quantity, p.price, p.price*ol.quantity amount
FROM orderlines ol
JOIN products p ON p.prod_id = ol.prod_id
JOIN orders o ON o.orderid = ol.orderid
WHERE o.orderid = 942
LIMIT 10;
15. How many orders have been placed by the customer with ID 
19887?

16. Display information (full name, address, email, and phone 
number) of customers who have placed at least 4 orders.
17. Display the order date and total amount of the highest-value 
order placed by the customer with ID 19887.
18. Show the full name and email of customers who ordered the 
product "AFFAIR ALAMO" in the largest quantity.
19. Display statistics on customers who have ordered products. For 
each product and each customer gender, show the number of 
customers, average age, and average income. 
20. Which products have been ordered by male customers with an 
income above 65,000? Display the quantity ordered for each 
product and sort the results in descending order by quantity 
ordered.
21. Create a high_price_products table with the same structure 
as the products table
22. Insert into the high_price_products table all products 
with a price greater than 21.99
23. In the high_price_products table:
 ▪ Products in category 1 should be moved to category 2.
 ▪ Products priced at 29.99 should be marked as "special products."
 ▪ Increase the price of all products currently priced between 23.00 and 
26.99 (inclusive) by 1 unit ($).
 ▪ Delete products with a price below 23.00.
24. Remove the high_price_products table