CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;



CREATE TABLE employee (
    id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(50),
    SSN CHAR(9),
    HireDate DATE,
    Salary DECIMAL(10, 2),
    hire_date DATE
);

CREATE TABLE job_titles (
    job_title_id INT PRIMARY KEY,
    job_title VARCHAR(50)
);

CREATE TABLE employee_job_titles (
    empid INT,
    job_title_id INT,
    PRIMARY KEY (empid, job_title_id),
    FOREIGN KEY (empid) REFERENCES employee(id),
    FOREIGN KEY (job_title_id) REFERENCES job_titles(job_title_id)
);

CREATE TABLE division (
    ID INT PRIMARY KEY,
    Name VARCHAR(50),
    city VARCHAR(50),
    addressLine1 VARCHAR(100),
    addressLine2 VARCHAR(100),
    state VARCHAR(50),
    country VARCHAR(50),
    postalCode VARCHAR(10)
);

CREATE TABLE employee_division (
    empid INT,
    div_ID INT,
    PRIMARY KEY (empid, div_ID),
    FOREIGN KEY (empid) REFERENCES employee(id),
    FOREIGN KEY (div_ID) REFERENCES division(ID)
);

CREATE TABLE address (
    empid INT PRIMARY KEY,
    addressLine1 VARCHAR(100),
    addressLine2 VARCHAR(100),
    cityID INT,
    stateID INT,
    country VARCHAR(50),
    postalCode VARCHAR(10),
    FOREIGN KEY (empid) REFERENCES employee(id)
);

CREATE TABLE demographics (
    empid INT PRIMARY KEY,
    phone VARCHAR(20),
    gender VARCHAR(10),
    pronouns VARCHAR(20),
    identified_race VARCHAR(50),
    DOB DATE,
    SSN CHAR(9),
    FOREIGN KEY (empid) REFERENCES employee(id)
);

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

CREATE TABLE payroll (
    payID INT PRIMARY KEY,
    pay_date DATE,
    earnings DECIMAL(10, 2)
);

CREATE TABLE deductions (
    fed_tax DECIMAL(10, 2),
    fed_med DECIMAL(10, 2),
    fed_SS DECIMAL(10, 2),
    state_tax DECIMAL(10, 2),
    retire_401k DECIMAL(10, 2),
    health_cost DECIMAL(10, 2),
    empid INT,
    PRIMARY KEY (empid),
    FOREIGN KEY (empid) REFERENCES employee(id)
);

CREATE TABLE cities (
    cityID INT PRIMARY KEY,
    city VARCHAR(100) NOT NULL,
    stateID INT,
    INDEX cityID_IDX (cityID),
    FOREIGN KEY (stateID) REFERENCES states(stateID)
);

CREATE TABLE states (
    stateID INT PRIMARY KEY,
    state VARCHAR(100) NOT NULL,
    INDEX stateID_IDX (stateID)
);