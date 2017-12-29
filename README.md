# Run Steps
This is a SpringBoot application using HTTPS SSL certificate. Just a simple hello rest ws.

## Create your own SSL/TLS Certificate
All you need is to navigate your JRE/bin folder to use keytool as below
```shell
C:\Program Files\Java\jre1.8.0_111\bin>keytool -genkey -alias diyar21 -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore D:\keystore.p12 -validity 3650
```


![CMD screenshot](https://github.com/dagistankaradeniz/images/blob/master/keytoolssl.JPG)


> **Note:**
>
> I moved my generated keystore.p12 PGP file under my SpringBoot resources folder
> then set my application.properties as: server.ssl.key-store: classpath:keystore.p12
> You can see whole application.properties file under src/main/resources folder.


> **Note:**
>
> You will security.ignored:/** inside application.properties file. Explanation is also there.


## Run Project
Run project and try to reach http://localhost:8080/hello


> You will see the page is redirecting to https (https://localhost:8443/hello) and also you will be informed for unauthorized certificate.
> If you pay for an authorized one, you will not see any warning/inform etc.


That easy :+1: Good luck
