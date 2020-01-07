
#### How to get an access token using HTTPie:  

auth_info - base64 encoded string `client_id:client_secret`

Get an access token:  
```
http --form POST localhost:8100/oauth/token Authorization:"Basic auth_info" grant_type=client_credentials
```

Check an access token:  
```
http --form localhost:8100/oauth/check_token Authorization:"Bearer access_token" token="access_token"
```


#### Check WebFlux server using HTTPie

```
http localhost:8080/hello
http localhost:8080/roll -a admin:nimda
http localhost:8080/roll -a user:1234
```