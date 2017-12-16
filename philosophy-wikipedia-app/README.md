#Getting to Philosophy

This is a full-stack app built using Spring MVC. It takes Wikipedia URL as input, displays the total hops and path taken to reach  Philosophy page by clicking the first valid link on each page and then saves this information to MySQL database.

However there are a few conditions, link is not valid if:
1. Parenthesized or italicized.
2. External link, links to current page, or red links (links to non-existent pages).

Running instructions: The application is built using Apache Tomcat server and Eclipse IDE. So, to run the application find the file WikiApplication.java and run it as a java application.It will compile the project and in turn start the tomcat server.Copy the entire project and paste it into the webapps-ROOT folder under the apache tomcat directory folder. 
Then, start the browser and type localhost:8080 in url section for tomcat and you will see the index page.

Database:The database in question is MySql.

The steps visited or paths taken will be stored in the database.
The path taken will be shown on the front end and in the backend in table article.
The number of hops taken to reach philosophy article will be shown in wiki_philosophy_router table.The table is self updated and hence it will not show the previous records for viewing the number of hops.New record replaces old entry.

Each link on the path in front end will open to the respective url address on the web in new window.