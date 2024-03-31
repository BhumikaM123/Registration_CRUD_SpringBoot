# Registration_CRUD_SpringBoot
CRUD Operations on Registration Functionality.
This project demonstrates the implementation of CRUD (Create, Read, Update, Delete) operations on a Registration table using Spring Boot, MySQL, Spring Web, and Spring Data JPA.

NOTE :   PLEASE ENSURE THE SQL DATABASE WHETHER DATA WAS THERE,  FIRST CREATE THE DATA.

Steps:
Setup Spring Boot Project:

1. Create a new Spring Boot project using your preferred IDE or Spring Initializr.
2. Include dependencies for Spring Web and Spring Data JPA.
3. Set Up MySQL Database.
4. Install MySQL if not already installed.
5. Create a new database for the project.
6. Configure Database Connection:
7. Open application.properties file in the src/main/resources directory.
8. Create Registration Entity:
9. Create Registration Repository:
10.Implement CRUD Operations:
11.Create Controller:
12.Test the Application:
13.Start the Spring Boot application.
14.Use tools like Postman or curl to test the CRUD operations.
15.Additional Enhancements:
Implement pagination, sorting, and filtering for retrieval operations.
Add additional validation constraints as needed.

Documentation:


Run in local POSTMAN:
1.Create:  http://localhost:8080/registrations(POST)
2.Read:  http://localhost:8080/registrations(GET)
3.Update: http://localhost:8080/registrations/id(PUT)(eg:/2)
4.Delete: http://localhost:8080/registrations/id(DELETE)(eg:/3)

MY SQL QUERIES:
CREATE TABLE Registration (
    ->     ID INT PRIMARY KEY AUTO_INCREMENT,
    ->     Name VARCHAR(255) NOT NULL,
    ->     Email VARCHAR(255) NOT NULL,
    ->     DateOfBirth DATE,
    ->     Gender ENUM('Male', 'Female', 'Other') NOT NULL,
    ->     PhoneNumber VARCHAR(15) NOT NULL,
    ->     CONSTRAINT UC_Email UNIQUE (Email),
    ->     CONSTRAINT CHK_Gender CHECK (Gender IN ('Male', 'Female', 'Other')),
    ->     CONSTRAINT CHK_PhoneNumber CHECK (LENGTH(PhoneNumber) >= 10 AND LENGTH(PhoneNumber) <= 12)
    -> );

ALTER TABLE Registration
    -> DROP CONSTRAINT CHK_PhoneNumber;

ALTER TABLE Registration
    -> CHANGE COLUMN PhoneNumber phone_number VARCHAR(15);

ALTER TABLE Registration
    -> ADD CONSTRAINT CHK_PhoneNumber CHECK (LENGTH(phone_number) >= 10 AND LENGTH(phone_number) <= 12);




Deploy the Application:
Deploy the application to a server or cloud platform as per your requirements.
Feel free to customize the project structure, class names, package names, and configurations according to your preferences.
