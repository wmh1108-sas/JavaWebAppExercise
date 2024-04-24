## SAS Spring Security Web Application

### Summary

This is a simple Java Web Application using Spring 6.

### Key Dependencies

- Java 17
- Spring 6.1.6
- Spring Security 6.2.4
- Tomcat Server 10

### Build the Project
- After cloning the project, import it into Eclipse:<br>
From Eclipse, Import -> Existing Projects into Workspace -> select the directory containing the cloned project<br>
- Build the project:<br>
From Eclipse, Project -> enable "Build Automatically" or Project -> Build Project<br>

### Run the Project

- In Eclipse, go to Servers tab (if not showing, click Window -> Show View -> Servers). 
- Right click anywhere in the pane and click New -> Server
- Find "Tomcat 10" by using the search box, select it and click Next
- Click the button that says Download Tomcat 10, wait a few seconds until the Finish button becomes available and press it.
- RMB on the project and select "Run As" -> "Run on Servers" -> Select "localhost: Tomcat v10.0 Server at localhost" -> Make sure that your project is added to the "Configured" pane -> Finish.<br>
- This will start the Tomcat server and deploy the web application on it. It will also bring up a web browser window at "localhost:8080/JavaWebAppExercise/" and return "Hello" in the browser content window. <br>
- Alternatively, you can bring up a web browser yourself and go to http://localhost:8080/JavaWebAppExercise/admin or http://localhost:8080/JavaWebAppExercise/user.<br>
- A logon popup screen will be displayed. Enter "user/password" for user and "admin/password" for admin user.<br>
- You should see on the content window "Hello, User!" for user, "Hello, Admin!" for admin user.<br>
