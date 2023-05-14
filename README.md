# Spring Boot using Sqlite with JPA/Hibernate

I did some failed experiments, I didn't the exact problem.

List of possible error now that it works
- version of dependencies
- SQLiteDialect

## Video Reference of succesful attempt

[SQLite CRUD with Spring Data JPA in Spring Boot](SQLite CRUD with Spring Data JPA in Spring Boot)
Event thought it has no audio is super helpful

## zsolfabok/sqlite-dialect dependency

After that, I added the next dependency to avoid some issues
```
<dependency>
    <groupId>com.zsoltfabok</groupId>
    <artifactId>sqlite-dialect</artifactId>
    <version>1.0</version>
</dependency>
```
With this dependency I can remove the custom SqliteDialect

## ddl-auto need new SQLiteDialect - New Custom SQLiteDialect

With the previous configuration if the ddl-auto property is set tu true, hibernate can't create new columns

I found the next topic to avoid the problem
https://stackoverflow.com/questions/34649256/dialect-schema-for-sqlite-and-hibernate