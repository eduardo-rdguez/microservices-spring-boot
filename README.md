# Welcome to microservices-spring-boot 🚀

![Version](https://img.shields.io/badge/version-0.1.0-blue.svg?cacheSeconds=2592000)
[![Documentation](https://img.shields.io/badge/documentation-yes-brightgreen.svg)](https://github.com/eduardo-rdguez/microservices-spring-boot/blob/main/README.md)
[![License: MIT](https://img.shields.io/github/license/eduardo-rdguez/microservices-spring-boot)](./LICENSE)
[![Twitter: \_eduardguez](https://img.shields.io/twitter/follow/_eduardguez.svg?style=social)](https://twitter.com/_eduardguez)

> This project has been developed with Spring Boot, Spring Data JPA, Gradle, Groovy, Kotlin, Java, H2 Database, ActiveMQ, Gateway, Eureka Server and Docker Compose to demonstrate how to build microservices.

## Tech Specs 🔖

- Java `8`
- Gradle `7.1.1`
- Spring Boot `2.5.2`
- Spring Data JPA `2.5.2`
- Kotlin `1.5.20`
- Groovy `3.0.8`
- H2 Database `1.4.200`
- ActiveMQ `2.5.2`
- Gateway `3.0.3`
- Eureka Client/Server `3.0.3`
- Docker Compose `3.9`

## Run

Runs this project as a Spring Boot application:

```sh
gradle bootRun
```

## Build

Assembles this project:

```sh
gradle build
```

## Tests

Run tests this project:

```sh
gradle test
```

## JAR

Assembles an executable jar archive:

```sh
gradle bootJar
```

## Docker Compose

Start and run all the background services:

```sh
docker-compose up -d --build
```

Stops running containers without removing them. They can be started again with `docker-compose start`:

```sh
docker-compose stop
```

Stops containers and removes containers, networks, volumes, and images created by `up`:

```sh
docker-compose down --rmi all -v
```

```sh
docker-compose down --rmi local -v
```

## Author

* Website: https://eduardo-rdguez.github.io/
* Twitter: [@\_eduardguez](https://twitter.com/\_eduardguez)
* Github: [@eduardo-rdguez](https://github.com/eduardo-rdguez)

## License

Copyright © 2021 [Eduardo Rodríguez](https://github.com/eduardo-rdguez).

This project is [MIT](https://github.com/eduardo-rdguez/microservices-spring-boot/blob/main/LICENSE) licensed.