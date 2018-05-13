# Technologies
- Java 8
- JPA Repositories
- MySQL Database
- Maven
- Prime Faces 6.1
- Lombok
- Spring Boot

### Database
You need create data base 'db_contact' in MySQL Server.
Name DB or user credentials for DB you can change in 'application.properties'

Tables will be created after the application will be started.

### Build application
'mvn clean install'

### Run application
'mvn spring-boot:run'

- application page
'http://localhost:8899/index.faces'

# Test Task:

Необходимо реализовать web приложение контактная книга, которое содержит таблицу контактов(Имя, фамилия, номер телефона - имя и фамилия поля обязательные для ввода) и кнопку добавить. По нажатию на кнопку показывается диалог для ввода информации о контакте.

Необходимо использовать:
- Java 8
- prime faces (last stable version)
- maven
- mysql

Код должен быть чистым и частично покрыт тестами.
