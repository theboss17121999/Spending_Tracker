# Spending_Tracker
Spending tracker made on Java using JFrame and SQL


Requirements :
1. netbeans
2. MySQL workbench
3. XAMP


Steps to create Schema in Database which will be used in Java program
  1. open the XAMP application and turn on MySQL
  2. open MYSQL workBench
  3. make a new Schema named spendingdb
  4. Under table make two tables named category_info and spendings
     1. Definition of category table
         - column name: category, String, not null and Primary Key
     2. Definition of Spendings
         - column name: sid, int, not null, auto increment, and Primary key
         - column name: category, String, and not null
         - column name: sdate, Date, and not null
         - column name: amount, int, and not null
