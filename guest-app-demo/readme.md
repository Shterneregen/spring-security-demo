##### Build the project
```shell
cd guest-services
gradlew clean build
cd ..
cd guest-app
gradlew clean build
cd ..
```

##### Run the project with Docker
- Start
```shell
docker-compose up -d
```
Visit http://localhost:8099/
- Stop
```shell
docker-compose down
```

---
##### How to get an access token using HTTPie:  

`auth_info` - base64 encoded string `client_id:client_secret`

Get an access token:  
```shell
http --form POST localhost:8100/oauth/token Authorization:"Basic auth_info" grant_type=client_credentials
```

Check an access token:  
```shell
http --form localhost:8100/oauth/check_token Authorization:"Bearer access_token" token="access_token"
```
