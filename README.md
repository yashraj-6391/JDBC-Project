# JDBC-Project

To create a simple JDBC project follow 

Enviroment Settings :

Inside your IDE set perspective to JAVA EE and create a new java project.

and inside buildpath-> configure buildpath -> add mysql-connector-java.jar file apply and OK.

# Basic 5 steps of JDBC connection

step 1: Register the Driver using Class.ForName("") or using import.
      $ import java.sql.DriverManager;
      
step 2: Get Connection using,
 		$ Connection cn= DriverManager.grtConnection();

step 3: Create a statement 
		$ Statement stmt=con.createStatement(); use create or prepare

step 4: Execute a query 
            ResultSet rst=stmt.executeQuery();

step 5: close the connection
		cn.close();
