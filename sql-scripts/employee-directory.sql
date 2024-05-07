CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;


--
-- Data for table `employee`
--


-- Create the "address" table
CREATE TABLE address (
    empid INT,
    addressLine1 VARCHAR(255),
    addressLine2 VARCHAR(255),
    cityID INT,
    stateID INT,
    country VARCHAR(100),
    postalCode VARCHAR(20),
    PRIMARY KEY (empid)
);

-- Create the "demographics" table
CREATE TABLE demographics (
    empid INT PRIMARY KEY,
    phone VARCHAR(20),
    gender VARCHAR(20),
    pronouns VARCHAR(50),
    identified_race VARCHAR(100),
    DOB DATE,
    SSN VARCHAR(20)
);

-- Create the "division" table
CREATE TABLE division (
    ID INT PRIMARY KEY,
    Name VARCHAR(100),
    city VARCHAR(100),
    addressLine1 VARCHAR(255),
    addressLine2 VARCHAR(255),
    state VARCHAR(100),
    country VARCHAR(100),
    postalCode VARCHAR(20)
);

-- Create the "employee" table
CREATE TABLE employee (
    id INT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(100),
    SSN VARCHAR(20),
    HireDate DATE,
    Salary DECIMAL(10, 2)
);

-- Create the "employee_division" table
CREATE TABLE employee_division (
    empid INT,
    div_ID INT,
    PRIMARY KEY (empid, div_ID),
    FOREIGN KEY (empid) REFERENCES employee(id),
    FOREIGN KEY (div_ID) REFERENCES division(ID)
);

-- Create the "employee_job_titles" table
CREATE TABLE employee_job_titles (
    empid INT,
    job_title_id INT,
    PRIMARY KEY (empid, job_title_id),
    FOREIGN KEY (empid) REFERENCES employee(id)
);

-- Create the "job_titles" table
CREATE TABLE job_titles (
    job_title_id INT PRIMARY KEY,
    job_title VARCHAR(100)
);

-- Create the "part_time_payroll" table
CREATE TABLE part_time_payroll (
    payrollID INT PRIMARY KEY,
    empid INT,
    pay_date DATE,
    hours_worked DECIMAL(5, 2),
    hourly_wage DECIMAL(10, 2),
    earnings DECIMAL(10, 2),
    fed_tax DECIMAL(10, 2),
    fed_med DECIMAL(10, 2),
    fed_SS DECIMAL(10, 2),
    state_tax DECIMAL(10, 2),
    FOREIGN KEY (empid) REFERENCES employee(id)
);

-- Create the "payroll" table
CREATE TABLE payroll (
    payID INT PRIMARY KEY,
    pay_date DATE,
    earnings DECIMAL(10, 2),
    fed_tax DECIMAL(10, 2),
    fed_med DECIMAL(10, 2),
    fed_SS DECIMAL(10, 2),
    state_tax DECIMAL(10, 2),
    retire_401k DECIMAL(10, 2),
    health_cost DECIMAL(10, 2),
    empid INT,
    FOREIGN KEY (empid) REFERENCES employee(id)
);












INSERT INTO employee (id, first_name, last_name, email, SSN, HireDate, Salary)
VALUES
    (1, 'John', 'Doe', 'john.doe@example.com', '123-45-6789', '2020-05-01', 50000.00),
    (2, 'Jane', 'Smith', 'jane.smith@example.com', '987-65-4321', '2018-09-15', 65000.50),
    (3, 'Michael', 'Johnson', 'michael.johnson@example.com', '456-78-9012', '2022-03-20', 45500.75),
    (4, 'Emily', 'Williams', 'emily.williams@example.com', '234-56-7890', '2019-11-01', 58000.25),
    (5, 'David', 'Brown', 'david.brown@example.com', '876-54-3210', '2021-07-15', 62000.00);



-- Inserts
INSERT INTO `employee` VALUES 
	(1,'Leslie','Andrews','leslie@luv2code.com'),
	(2,'Emma','Baumgarten','emma@luv2code.com'),
	(3,'Avani','Gupta','avani@luv2code.com'),
	(4,'Yuri','Petrov','yuri@luv2code.com'),
	(5,'Juan','Vega','juan@luv2code.com');




-- Populate the "address" table
INSERT INTO address (empid, addressLine1, addressLine2, cityID, stateID, country, postalCode)
VALUES
    (1, '123 Main St', NULL, 1, 1, 'USA', '12345'),
    (2, '456 Oak Rd', 'Apt 2B', 2, 2, 'USA', '67890'),
    (3, '789 Elm Ave', NULL, 3, 3, 'Canada', 'A1B2C3'),
    (4, '321 Maple Ln', 'Suite 100', 4, 4, 'USA', '54321'),
    (5, '987 Pine Blvd', NULL, 5, 5, 'Mexico', '98765');

-- Populate the "demographics" table
INSERT INTO demographics (empid, phone, gender, pronouns, identified_race, DOB, SSN)
VALUES
    (1, '1234567890', 'Male', 'He/Him', 'White', '1990-05-15', '123456789'),
    (2, '9876543210', 'Female', 'She/Her', 'Asian', '1985-11-22', '987654321'),
    (3, '5555555555', 'Other', 'They/Them', 'Black', '1992-03-01', '456789123'),
    (4, '1112223333', 'Male', 'He/Him', 'Hispanic', '1988-07-10', '789123456'),
    (5, '4445556666', 'Female', 'She/Her', 'White', '1995-12-25', '321654987');

-- Populate the "division" table
INSERT INTO division (ID, Name, city, addressLine1, addressLine2, state, country, postalCode)
VALUES
    (1, 'Sales', 'New York', '100 Park Ave', NULL, 'New York', 'USA', '10001'),
    (2, 'Marketing', 'Los Angeles', '200 Sunset Blvd', 'Suite 300', 'California', 'USA', '90001'),
    (3, 'Finance', 'Toronto', '300 Bay St', NULL, 'Ontario', 'Canada', 'M5H2S6'),
    (4, 'IT', 'Chicago', '400 N State St', 'Floor 10', 'Illinois', 'USA', '60601'),
    (5, 'HR', 'Miami', '500 Brickell Ave', NULL, 'Florida', 'USA', '33131');


-- Populate the "employee_division" table
INSERT INTO employee_division (empid, div_ID)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5);

-- Populate the "employee_job_titles" table
INSERT INTO employee_job_titles (empid, job_title_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5);

-- Populate the "job_titles" table
INSERT INTO job_titles (job_title_id, job_title)
VALUES
    (1, 'Sales Representative'),
    (2, 'Marketing Coordinator'),
    (3, 'Financial Analyst'),
    (4, 'Software Engineer'),
    (5, 'HR Manager');

-- Populate the "part_time_payroll" table
INSERT INTO part_time_payroll (payrollID, empid, pay_date, hours_worked, hourly_wage, earnings, fed_tax, fed_med, fed_SS, state_tax)
VALUES
    (1, 1, '2023-04-01', 80.00, 20.00, 1600.00, 160.00, 24.00, 99.20, 80.00),
    (2, 2, '2023-04-15', 60.00, 25.00, 1500.00, 150.00, 22.50, 93.00, 75.00),
    (3, 3, '2023-04-30', 90.00, 30.00, 2700.00, 270.00, 40.50, 167.40, 135.00),
    (4, 4, '2023-05-15', 75.00, 22.00, 1650.00, 165.00, 24.75, 102.30, 82.50),
    (5, 5, '2023-05-31', 100.00, 18.00, 1800.00, 180.00, 27.00, 111.60, 90.00);

-- Populate the "payroll" table
INSERT INTO payroll (payID, pay_date, earnings, fed_tax, fed_med, fed_SS, state_tax, retire_401k, health_cost, empid)
VALUES
    (1, '2023-04-30', 5000.00, 500.00, 75.00, 310.00, 250.00, 300.00, 200.00, 1),
    (2, '2023-04-30', 6000.00, 600.00, 90.00, 372.00, 300.00, 360.00, 240.00, 2),
    (3, '2023-04-30', 7000.00, 700.00, 105.00, 434.00, 350.00, 420.00, 280.00, 3),
    (4, '2023-04-30', 5500.00, 550.00, 82.50, 340.50, 275.00, 330.00, 220.00, 4),
    (5, '2023-04-30', 6500.00, 650.00, 97.50, 402.50, 325.00, 390.00, 260.00, 5);
    
   
   INSERT INTO job_titles (job_title_id, job_title) VALUES
(1, 'Software Engineer'),
(2, 'Data Scientist'),
(3, 'Marketing Manager'),
(4, 'Sales Representative'),
(5, 'Graphic Designer');


ALTER TABLE payroll
ADD health_cost DECIMAL(10, 2);

UPDATE payroll
SET health_cost = Salary * 0.002;