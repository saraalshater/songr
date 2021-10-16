## Lab 11 Overview
This lab about how to set up a basic webapp that bult with the Spring MVC Data and Thymeleaf.

## Routers:
***AppController Class***

`http://localhost:8080/hello`

 - @GetMapping("/hello") String helloWorld(): Go to the hello.html that contain Hello world.

`http://localhost:8080/capitalize/hello`

 - @GetMapping("/capitalize/{id}") String hello(Model model, @PathVariable("id") String id): This router go to the HelloWorld.html page and this router contain id parameter, so in the html page it will render the text that store in the id parameter in upper case.

`http://localhost:8080/`
 - This is route for home page (root page).
    AlbumController Class
`http://localhost:8080/albums`
 
 - @GetMapping("/albums") public String albums( Model model) : This router go to the album.html page and this page contains the albums.
Album Class

**The Album class contains 5 variables:**

*String title*: To store the album title.

*String artist*: To store the artist name.

*int songCount*: To store the number of song in the album.

*long length* : To store the total lenght of song in seconds.

*String imgUrl* : To store the album image URL.

Create a constructor and its parameters are all variables above. And also create a getter and setter methods for all variables.

-------------------------------------------------------------------------------------------------
## lab 12 Overview 
The requirement for this lab is how the user can add albums to the albums page by fill the forms.

### Router:

`http://localhost:8080/addAlbum`
 - This route is for a page that contains a form that users fill in to add albums to the album page.

**Getting Started**
To run the app you should follow the following steps:

Getting started with Spring : This website show you how to build an application by Spring.

This is the dependencies build.gradle file
 dependencies {
 implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
 runtimeOnly('org.postgresql:postgresql')
 implementation 'org.springframework. boot:spring-boot-starter-thymeleaf'
 implementation 'org.springframework.boot:spring-boot-starter-web'
 developmentOnly 'org.springframework.boot:spring-boot-devtools'
 testImplementation 'org.springframework.boot:spring-boot-starter-test'
 }
In application.properties file you should have these lines:

spring.datasource.url=jdbc:postgresql://localhost:5432/<<put the postgres name>>
spring.datasource.username=<<username>
spring.datasource.password=<<postgres password>>
spring.jpa.database=POSTGRESQL
spring.jpa.show-sql=true
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect
spring.sql.init.platform=postgres

You should run the POSTGRESQL on the terminal by using these commands"

`sudo service postgresql start`

`sudo -i -u postgres`

`psql`

`\connect <<database name>>`

`\dt`

`select * from album;`