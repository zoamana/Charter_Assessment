-- Insert dummy data for 3 months
INSERT INTO customer (id,first_name, last_name, city) VALUES (1,'John', 'Doe', 'New York');
INSERT INTO customer (id,first_name, last_name, city) VALUES (2,'Jane', 'Doe', 'Los Angeles');
INSERT INTO customer (id,first_name, last_name, city) VALUES (3,'Mary', 'Smith', 'Chicago');

INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES (120, '2023-05-06', 11, 11, 1);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES   (200, '2023-05-07', 12, 12, 2);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES   (350, '2023-05-08', 13, 13, 3);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES   (140, '2023-05-09', 14, 14, 1);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES   (500, '2023-05-10', 15, 15, 2);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES   (330, '2023-06-06', 16, 16, 3);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES   (700, '2023-06-07', 17, 17, 1);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (830, '2023-06-08', 18, 18, 2);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (530, '2023-06-09', 19, 19, 3);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (200, '2023-06-10', 20, 20, 1);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (210, '2023-07-01', 21, 21, 2);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (220, '2023-07-02', 22, 22, 3);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (230, '2023-07-03', 23, 23, 1);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (240, '2023-07-04', 24, 24, 2);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (200, '2023-07-05', 25, 25, 3);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (260, '2023-07-06', 26, 26, 1);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (270, '2023-07-07', 27, 27, 2);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (280, '2023-07-08', 28, 28, 3);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (290, '2023-07-09', 29, 29, 1);
INSERT INTO transaction (amount, create_date, order_id, payment_id, customer_id) VALUES  (300, '2023-07-10', 30, 30, 2);