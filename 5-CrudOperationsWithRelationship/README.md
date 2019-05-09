# SpringBootRestApiApplication
Spring boot JPA and Embedded Apache Dorby database.
CRUD operations on Database using JPA.

use Postman to check it -  

localhost:8080/expense : GET - show list of expenses
localhost:8080/expense/1 : GET - show expense of id 1
localhost:8080/expense : PUT - edit expense - id will be fetched from given expense JSON in body
localhost:8080/expense/1 : DELETE - delete expense of id 1
localhost:8080/expense : PUT - add a new expense
localhost:8080/category/1/expense : GET - get all expense of category id 1
localhost:8080/category/1/expense : POST - add an expense in category id 1
localhost:8080/category/1/expense/1 : PUT - edit expense of expense id 1 of category id 1
localhost:8080/category : GET - get all categories
localhost:8080/category/1 : GET - get category of category id 1
localhost:8080/category/1 : PUT - edit category of category id 1
localhost:8080/category/1 : DELETE - delete category of category id 1
localhost:8080/category : POST - add a category


these all operations are done on embedded database.