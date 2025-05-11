-- T?o b?ng Customers
CREATE TABLE IF NOT EXISTS Customers (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE IF NOT EXISTS order_lines (
    id SERIAL PRIMARY KEY,
    customer_id BIGINT,
    order_id BIGINT,
    product_name TEXT,
    product_image TEXT,
    product_price NUMERIC,
    quantity INTEGER,
    total_price NUMERIC,
    status TEXT,
    delivery_date DATE,
    rating_status BOOLEAN DEFAULT FALSE
);


-- Chèn d? li?u m?u
INSERT INTO Customers (username, password, email)
VALUES 
    ('john_doe', '$2a$10$Kf1hYtZTdcXWgXaz6i5UfeS/p3cMa8kkpjqxX8mUtqDZxykRtYVoC', 'john@example.com'),
    ('jane_smith', '$2a$10$VrLkxrw4kn4hG/6G6QH5kO5Ao4nHxKlvSy/TxNSHD0O8l2VYXBAZq', 'jane@example.com');

INSERT INTO order_lines (customer_id, order_id, product_name, product_image, product_price, quantity, total_price, status, delivery_date, rating_status) VALUES
(1, 1001, 'Bit mat ngu cao cap', '/images/eye-mask.jpg', 48000, 1, 48000, 'HOAN THANH', '2025-05-01', TRUE),
(1, 1002, 'Bo nut tai chong on Mack', '/images/earplugs.jpg', 79000, 1, 79000, 'HOAN THANH', '2025-05-02', FALSE),
(1, 1003, 'Sim 4G Mobifone 100GB', '/images/sim4g.jpg', 689000, 1, 689000, 'DA DANH GIA', '2025-05-01', TRUE),
(2, 1004, 'Tai nghe Bluetooth X5', '/images/headphones.jpg', 299000, 2, 598000, 'CHO GIAO HANG', '2025-05-07', FALSE),
(2, 1005, 'Binh giu nhiet LockLock', '/images/bottle.jpg', 199000, 1, 199000, 'DANG GIAO', '2025-05-06', FALSE),
(3, 1006, 'Ban phim co AKKO', '/images/keyboard.jpg', 1200000, 1, 1200000, 'HOAN THANH', '2025-04-30', TRUE),
(3, 1007, 'Chuot gaming Logitech G102', '/images/mouse.jpg', 490000, 1, 490000, 'DA HUY', '2025-05-03', FALSE),
(1, 1008, 'Ao hoodie nam form rong', '/images/hoodie.jpg', 220000, 2, 440000, 'HOAN THANH', '2025-05-01', TRUE),
(2, 1009, 'Gia do dien thoai xe hoi', '/images/phone-holder.jpg', 65000, 1, 65000, 'CHO THANH TOAN', '2025-05-10', FALSE),
(1, 1010, 'Den ngu LED cam ung', '/images/nightlight.jpg', 87000, 3, 261000, 'HOAN THANH', '2025-05-04', TRUE);

UPDATE order_lines
SET product_image = 'arya.jpg';
