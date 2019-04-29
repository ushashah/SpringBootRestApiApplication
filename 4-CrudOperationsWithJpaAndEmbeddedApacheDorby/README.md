# SpringBootRestApiApplication
Spring boot JPA and Embedded Apache Dorby database.
CRUD operations on Database using JPA.

use Postman to check it -  

localhost:8080/expense : GET - show list of expenses
localhost:8080/expense/1 : GET - show expense of id 1
localhost:8080/expense : PUT - edit expense - id will be fetched from given expense JSON in body
localhost:8080/expense/1 : DELETE - delete expense of id 1
localhost:8080/expense : PUT - add a new expense

these all operations are done on embedded database.