# CZ3002 assignment 2: Login application with struts 2 and MySQL database

WebsiteUrl: `http://localhost:8080/login/view/login.jsp`

## Files 
1. SQL script: `db.sql`
2. WAR file: `target -> login.war`

## Load script into MySQL: 
1. Start SQL server <br>
`cd ..\mysql\bin` <br>
`mysqld --console`

2. Start SQL client <br>
`cd ..\mysql\bin` <br>
`mysql -u myuser -p`  <br>

3. Run SQL script <br>
`source ..\struts2-assignment\db.sql;`

## Run Login Application <br>
1. Start SQL server <br>
`cd ..\mysql\bin` <br>
`mysqld --console`

2. Run the web code
`cd ..\login`  <br>
`mvn jetty:run` in CMD terminal