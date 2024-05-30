CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    phone_number VARCHAR(9),
    username VARCHAR(50) UNIQUE,
    password VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Property (
    id INT AUTO_INCREMENT PRIMARY KEY,
    address VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(50),
    zip_code VARCHAR(10),
    purchase_price DECIMAL(10, 2),
    property_type VARCHAR(50),
    square_footage INT,
    bedrooms INT,
    bathrooms INT,
    year_built INT,
    fk_user_id INT,
    FOREIGN KEY (fk_user_id) REFERENCES Users(id)
);

CREATE TABLE Investments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_property_id INT,
    fk_user_id INT,
    down_payment DECIMAL(10, 2),
    loan_amount DECIMAL(10, 2),
    interest_rate DECIMAL(5, 2),
    loan_term_years INT,
    purchase_date DATE,
    closing_cost DECIMAL(10, 2),
    FOREIGN KEY (fk_property_id) REFERENCES Property(id),
    FOREIGN KEY (fk_user_id) REFERENCES Users(id)
);

CREATE TABLE RentalIncome (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_property_id INT,
    fk_user_id INT,
    monthly_rent DECIMAL(10, 2),
    vacancy_rate DECIMAL(5, 2),
    FOREIGN KEY (fk_property_id) REFERENCES Property(id),
    FOREIGN KEY (fk_user_id) REFERENCES Users(id)
);

CREATE TABLE Expense (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_property_id INT,
    fk_user_id INT,
    expense_type VARCHAR(50),
    amount DECIMAL(10, 2),
    frequency VARCHAR(20),
    recurring BOOLEAN,
    FOREIGN KEY (fk_property_id) REFERENCES Property(id),
    FOREIGN KEY (fk_user_id) REFERENCES Users(id)
);

CREATE TABLE SaleInformation (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_property_id INT,
    fk_user_id INT,
    sale_price DECIMAL(10, 2),
    sale_date DATE,
    selling_costs DECIMAL(10, 2),
    FOREIGN KEY (fk_property_id) REFERENCES Property(id),
    FOREIGN KEY (fk_user_id) REFERENCES Users(id)
);

CREATE TABLE FinancialMetrics (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_property_id INT,
    fk_user_id INT,
    cash_flow DECIMAL(10, 2),
    cap_rate DECIMAL(5, 2),
    roi DECIMAL(5, 2),
    FOREIGN KEY (fk_property_id) REFERENCES Property(id),
    FOREIGN KEY (fk_user_id) REFERENCES Users(id)
);