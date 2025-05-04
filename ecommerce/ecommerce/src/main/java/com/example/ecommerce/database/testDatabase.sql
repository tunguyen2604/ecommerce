-- Tạo bảng Customers
CREATE TABLE IF NOT EXISTS Customers (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Chèn dữ liệu mẫu
INSERT INTO Customers (username, password, email)
VALUES 
    ('john_doe', '$2a$10$Kf1hYtZTdcXWgXaz6i5UfeS/p3cMa8kkpjqxX8mUtqDZxykRtYVoC', 'john@example.com'),
    ('jane_smith', '$2a$10$VrLkxrw4kn4hG/6G6QH5kO5Ao4nHxKlvSy/TxNSHD0O8l2VYXBAZq', 'jane@example.com');
