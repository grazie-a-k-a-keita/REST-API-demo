## REST API demo

### Skill

- Java(Spring Boot)

### Api List

| Method | Path                   | Note             |
| ------ | ---------------------- | ---------------- |
| GET    | /demo/users            | -                |
| GET    | /demo/users/{ gender } | gender: "M", "F" |
| POST   | /demo/user             | -                |
| PUT    | /demo/user/{ id }      | -                |
| DELETE | /demo/user/{ id }      | -                |

```json
{
  "firstName": "山田",
  "lastName": "次郎",
  "gender": "M"
}
```
