﻿# REST-API-demo
 
## Skill
- Java(Spring Boot)
- MySQL

## REST API List
- GET
  - /demo/users
  - /demo/users/{ gender }
- POST
  - /demo/user
- PUT
  - /demo/user/{ id }
- DELETE
  - /demo/user/{ id }

## DB (Table Design)
```
CREATE TABLE user (
  id INT(11) AUTO_INCREMENT NOT NULL COMMENT 'ID', 
  first_name VARCHAR(15) NOT NULL COMMENT '性',
  last_name VARCHAR(15) NOT NULL COMMENT '名',
  gender ENUM('M','F') NOT NULL COMMENT '性別',
  age INT(3) NOT NULL COMMENT '年齢',
  primary key (id)
) COMMENT 'ユーザー';
```
