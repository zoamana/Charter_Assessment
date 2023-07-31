# Charter Assignment

This is a Spring Boot application that uses JPA to connect to a PostgreSQL database.

## Requirements

* Java SDK v20
* Gradle
* PostgreSQL

## Setup

1. Clone the repository.
2. Create a PostgreSQL database and user.
3. Update the `application.properties` file with the database connection information.

## Running the application

1. Open the project directory in an IDE like IntelliJ.
2. Build the gradle and Run the AssignmentApplication.java 

`The application will start running on port 8080.`

## Testing the application

You can test the application by making requests to the following endpoints:

* `GET http://localhost:8080/api/reward/points`: Get all rewards for each customer earned per month and total.

## Resources

* [Spring Boot documentation](https://spring.io/projects/spring-boot)
* [PostgreSQL documentation](https://www.postgresql.org/docs/)

#### Note
- Transactions dummy data for 3 months insertion query is written in import.sql file in resources folder.
- The database will be initialised with these data when after we run the application.
