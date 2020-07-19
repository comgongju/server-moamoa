# server-moamoa
Spring Boot CLI run

## INSTALL
```
git clone https://github.com/comgongju/server-moamoa.git
```
### JAVA
jdk 설치는 생략. Java SDK v1.8 이상을 권장합니다.
```
$ java -version
```
### Maven
Maven 버전은 3.3 이상을 권장합니다.
```
# Mac
$ brew install maven

# Ubuntu
$ sudo apt-get install maven

# Windows
$ choco install maven

$ mvn spring-boot:run
```
윈도우의 경우 power shell 에서 Chocolatey 패키지 매니저를 이용해 choco 키워드로 설치 하면 편리합니다.

### Run Spring Boot app
```
$ cd 프로젝트 경로
$ mvn spring-boot:run
```

### Additional references link
[How to install Maven](https://www.baeldung.com/install-maven-on-windows-linux-mac)  
[Installing Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html)
