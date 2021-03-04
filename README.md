### Jumia Test Task

**To run this application on Windows Or Linux follow the below steps and please verify that Java 8 is installed on your machine:**

1- you can run this project as a Jar (attached in the project zip file extracted folder) with command:

`java -jar jumia-0.0.1-SNAPSHOT.jar`

NOTE: please make sure to have port 8080 is not used by any other process

2- open your browser and goto url http://localhost:8080/

3- you will see a page listed with all country results.

4- in filter field, you can filter by any field or value.

5- click on beside any column name to sort by this column values (an arrow will appear).

6- you find a paginator on the right-bottom of the page view to navigate through pages, and you can choose the number and size of every page. 


**To run this application with Docker, follow the below steps:**

1- command to build image : `docker build -t jumia-task .`

2- command to run the container and the application from image: `docker run -p 8080:8080 jumia-task`
