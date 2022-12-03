##### Build the project
```cmd
cd guest-services
gradlew clean build
cd ..
cd guest-app
gradlew clean build
cd ..
```

##### Run the project with Docker
- Start
```cmd
docker-compose up -d
```
Visit http://localhost:8099/
- Stop
```cmd
docker-compose down
```

---
##### How to get an access token using HTTPie:  

auth_info - base64 encoded string `client_id:client_secret`

Get an access token:  
```
http --form POST localhost:8100/oauth/token Authorization:"Basic auth_info" grant_type=client_credentials
```

Check an access token:  
```
http --form localhost:8100/oauth/check_token Authorization:"Bearer access_token" token="access_token"
```
