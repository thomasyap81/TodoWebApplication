##Todo

id
username
description
targetDate
Done

-create Todo class/bean for fields declared
-create TodoService class to handle all the fields in static List

##Create a Page to list the Todos
-create TodoController
-redirect to listTodos.jsp

<!--
 'bootstrap.min.css' Bootstrap CSS file: 
 -<link> tag imports the Bootstrap CSS file
 -to apply Bootstrap styles to the HTML elements in the page 
 -This CSS file contains styles for various Bootstrap components, 
 such as buttons, forms, and navigation bars, ensuring that they look consistent and visually appealing
 
 'bootstrap.min.js' Bootstrap JavaScript file:
 -to enhance the functionality of Bootstrap components.
 -For example, Bootstrap's JavaScript provides features 
 like drop-down menus, modal dialogs, and form validation.

 jQuery a JavaScript library:
 -simplifies the process of interacting with the HTML DOM and handling events.
 -Bootstrap's JavaScript components often rely on jQuery for their functionality.
 -jQuery needs to be included before the Bootstrap JavaScript file 
 to ensure that Bootstrap's JavaScript components work correctly. 

 taglib prefix="c" uri="jakarta.tags.core" (search JSTL core tags):
 -This directive imports the JSTL (JavaServer Pages Standard Tag Library) core tag library into the JSP file.
 -It assigns a prefix (c in this case) that can be used to reference tags from this library in the JSP file.
 -The uri attribute specifies the location of the tag library descriptor (TLD) file for the JSTL core library. 
 In this case, the URI is jakarta.tags.core, which is the standard URI for the JSTL core library.
 
 taglib prefix="form" uri="http://www.springframework.org/tags/form 
 	(search spring form tag library documentation) 
 	https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/view.html:
 - to configure a form backing object in JSP file
 - This directive imports the Spring form tag library into the JSP file.
 - It assigns a prefix (form in this case) that can be used to reference tags from this library in the JSP file.
 - The uri attribute specifies the location of the tag library descriptor (TLD) file for the Spring form library. 
   In this case, the URI is http://www.springframework.org/tags/form, 
   which is the standard URI for the Spring form library.

-->

##Docker
docker run --detach 
--env MYSQL_ROOT_PASSWORD=dummypassword 
--env MYSQL_USER=todos-user 
--env MYSQL_PASSWORD=dummytodos 
--env MYSQL_DATABASE=todos 
--name mysql 
--publish 3306:3306 mysql:8-oracle

#-- to check: cmd: 
--docker version
--docker container ls
#-- Using MySQL Shell to connect database
-- mysqlsh
-- \connect root@localhost:3306
-- \use todos
-- \sql
-- GRANT PROCESS ON *.* TO 'todos-user'@'localhost';
-- FLUSH PRIVILEGES;

or

--mysqlsh
--\connect todos-user@localhost:3306
-- \use todos
--\sql
--select * from todo;





