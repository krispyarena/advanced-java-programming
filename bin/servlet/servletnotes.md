JEE/J2EE

    - used to create dynamic web application in Java

Java Technologies used for WebApp:

    - JSP/Servlets
    - EJB [Enterprise Java Bean]
    - Strut
    - Spring MVC Native
    - SpringBoot

HTTP

    Data communication protocol used to establish communication between client and server.

HttpRequest

    It is the request sent by computer to a web server that contains all sorts of potentially interesting information.

    a. get
        - default request
        - used to open view pages
        - not secured
        - data limit
        - eg: hyperlink

    b. post
        - syntax: <form method = "post">
        - used to submit form data to server
        - secured
        - no data limit

WebServer

    - used to run web application as there is no main method to run on console
    - eg: Tomcat, Apache, etc

web.xml File

    - It defines mapping between URL paths and the servlets that handle request with those paths.
    - The web server uses this configuration to identify the servlet to handle a given request and call the class method that corresoponds to the request methods.

        Example : doGet() method is called for HTTP GET requests.