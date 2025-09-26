# Servlet Projects

This repository contains simple **Java Servlet-based web application** projects.

The project follows a standard **Java EE (Jakarta EE)** folder structure with clearly separated source code, web resources, and configuration files.  

## Repository Structure
```plaintext
.
├── project_name/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── file_name/      # Java Servlet code
│   │   │   ├── webapp/
│   │   │   │   ├── index.html          # Frontend HTML file
│   │   │   │   ├── ...other HTML files
│   │   │   │   └── WEB-INF/
│   │   │   │       └── web.xml         # Deployment descriptor (Servlet config)
│   │   │   └── ...
│   └── ...
├── .metadata/                          # Tomcat server configuration files (not part of source code)


• src/main/java/com/file_name → Contains Java Servlet classes.

̐• src/main/webapp → Contains HTML files (frontend UI).

• src/main/webapp/WEB-INF/web.xml → Deployment descriptor for servlet mapping.

• .metadata → Tomcat server metadata (can be ignored in most cases).

Features :

    Demonstrates Servlet basics: handling HTTP requests and responses.

    Includes HTML forms to take user input for currency conversion.

    Uses web.xml for servlet configuration and mapping.

    Structured in a standard Maven-style project layout for Java EE.

 Getting Started :

1. Prerequisites

   • JDK 8+

   • Apache Tomcat (or any Java EE-compatible server)

   • IDE like Eclipse / IntelliJ IDEA

2. Running the Project

   ̐ Clone this repository.

   • Import the project into your IDE as a Dynamic Web Project or Maven Project.

   • Configure Apache Tomcat server in your IDE.

   • Deploy the project to Tomcat.


 Notes

    The .metadata folder contains IDE/Tomcat-specific configurations and is not part of the application logic.

    The project is meant for learning purposes (Servlets, HTML, XML config).
