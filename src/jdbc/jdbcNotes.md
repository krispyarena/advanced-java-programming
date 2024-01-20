JDBC

    It stands for Java Database Connectivity, which is a standard JAVA API for database independent connectivity between the Java programming language and wide range of databases.

Steps to connect to database in JAVA:

    1. Register the driver class

            Class.forName("com.mysql.cj.jdbc.Driver");

    2. Creating Connection

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName", "username", "password");

            Generally username = "root" and password = ""

    3. Creating Statement

            Statement stm = con.createStatement();

    4. Executing Queries and inserting into ResultSet

            ResultSet rs = stm.executeQuery("SELECT * FROM TBL_NAME");

    5. Closing Connection

            rs.close();
            stm.close();
            con.close();

Adding a JAR File

        JAR stands for JAVA Archive. Download respective JDBC Driver JAR file.

        Place that .jar file in "Referenced Libraries"

