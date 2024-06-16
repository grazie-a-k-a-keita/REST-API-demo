## Spring Boot REST API demo

### Skill

- Java(Spring Boot)

### Api List

| Method | Path              | Note |
| ------ | ----------------- | ---- |
| GET    | /demo/users       | -    |
| GET    | /demo/user/{ id } | -    |
| POST   | /demo/user        | \*1  |
| PUT    | /demo/user/{ id } | \*1  |
| DELETE | /demo/user/{ id } | -    |

#### \*1: Body

```json
{
  "firstName": "林",
  "lastName": "かおり",
  "age": 19
}
```
