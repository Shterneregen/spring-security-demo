
### Create user
```shell
curl --location --request POST 'localhost:8080/register' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "admin",
    "password": "password"
}'
```

### Get token
```shell
curl --location --request POST 'localhost:8080/authenticate' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "admin",
    "password": "password"
}'
```

### Call secured endpoint
```shell
curl --location --request POST 'localhost:8080/hello' \
--header 'Authorization: Bearer TOKEN'
```