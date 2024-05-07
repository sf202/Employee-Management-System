
# Employee Management System Instructions

## User Scenario:

Your software development team is asked to deliver a minimal working UX for a basic 
employee management system for company ‘Z’. The software design document will be a set of 
designs for this software system involving its data and programming schemas. They have NO 
GUI/UX for their needed system. They have one person putting the data into their database using 
dBeaver and MySQL scripts. 


## Objective: 
Develop a full-stack application that allows users to interact with an employeeData MySQL database. Users should be able to search, insert, update, and delete employee records(CRUD).

- The system must support the generation of several key reports:
  - Detailed information on full-time employees, including their pay statement history.
  - Total monthly pay categorized by job title.
  - Total monthly pay categorized by division.

## Project Deliverables

In the project repository, you'll find:

Database Schema Diagram: 
- Created using dBeaver, it illustrates both the original schema and additional components, including:
- Additional Tables:
  - Employee addresses, encompassing demographic details such as gender, pronouns, race, date of birth, and contact information.
  - Tables for city and state information, with corresponding IDs linked in the address table.
  - Primary and Foreign Key Connections:
  - employees.empid (primary) linked to employee_division.empid (foreign)
  - employees.empid (primary) linked to payroll.empid (foreign)
  - employees.empid (primary) linked to employee_job_titles.empid (foreign)
  - employee_division.div_ID (primary) linked to division.ID (foreign)
  - employee_job_titles.job_title_id (primary) linked to job_titles.job_title_id (foreign)
  - employees.empid (primary) linked to address.empid (foreign)



##  Technical Decisions: 
- Frontend: HTML / CSS

- Backend: Spring Boot (Java)

- Database: SQLite




## Setup Instructions : Spring Boot

### 1.	Configure Application Properties
application.properties

spring.datasource.username=<your-username>

spring.datasource.password=<your-password>
### 2.	Install IntelliJ IDEA Community Edition
Install IntelliJ IDEA Community Edition for optimal compatibility.
### 3.	Install 7-Zip
Download and install 7-Zip to resolve Windows long path directory issues during extraction.
### 4.	Run SQL Script
Execute the employee-directory.sql script in DBeaver.
### 5.	Run the Application
ThymeleafdemoApplication.java

Run the application using the ThymeleafdemoApplication class.
### 6.	Access the Web Application
Navigate to http://localhost:8080/employees/list in your web browser.


