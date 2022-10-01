# 🧮 Alticci Sequence Service
![Python Tests CI](https://img.shields.io/github/workflow/status/rarycoringa/alticci-sequence-service/Python%20Tests%20CI?label=tests&logo=pytest&logoColor=white)
![Docker Image CI](https://img.shields.io/github/workflow/status/rarycoringa/alticci-sequence-service/Docker%20Image%20CI?label=docker&logo=docker&logoColor=white)
![Heroku Deploy CD](https://img.shields.io/github/workflow/status/rarycoringa/alticci-sequence-service/Heroku%20Deploy%20CD?label=heroku&logo=heroku&logoColor=white)
![Release](https://img.shields.io/github/v/release/rarycoringa/alticci-sequence-service?include_prereleases)
![Tag](https://img.shields.io/github/v/tag/rarycoringa/alticci-sequence-service?include_prereleases)
![License](https://img.shields.io/github/license/rarycoringa/alticci-sequence-service)

## Table of Content

- [About the application](#about-the-application)
  - [Alticci sequence definition](#alticci-sequence-definition)
  - [Technologies](#technologies)
- [Clone the repository](#clone-the-repository)
- [Run using docker and docker-compose](#run-using-docker-and-docker-compose)
- [Run in development mode](#run-in-development-mode)
  - [Environment settings](#environment-settings)
## About the application

## About the application

This is a Rest API microservice which aims to calculate and return the **$A_n$** term of the **Alticci Sequence**.

You can access the service here: https://alticci-sequence-service.herokuapp.com

### Alticci sequence definition

The Alticci Sequence ($A_n$) is defined following these math rules:

$$
A_n =
  \begin{cases}
    \nexists           & \quad \text{if } n < 0\\
    0                  & \quad \text{if } n = 0\\
    1                  & \quad \text{if } n = 1\\
    1                  & \quad \text{if } n = 2\\
    A_{n-3} + A_{n-2}  & \quad \text{if } n > 2
  \end{cases}
$$

### Technologies

This service is using these technologies:

![java version](https://img.shields.io/github/pipenv/locked/python-version/rarycoringa/alticci-sequence-service?color=lightgray&label=Java&logo=java&logoColor=white)
![spring version](https://img.shields.io/github/pipenv/locked/dependency-version/rarycoringa/alticci-sequence-service/flask?color=lightgray&label=Springboot&logo=spring&logoColor=white)
![swagger version](https://img.shields.io/github/pipenv/locked/dependency-version/rarycoringa/alticci-sequence-service/gunicorn?color=lightgray&label=swagger&logo=swagger&logoColor=white)
![mvn --version](https://img.shields.io/github/pipenv/locked/dependency-version/rarycoringa/alticci-sequence-service/redis?color=lightgray&label=Maven&logo=Maven&logoColor=white)
![Pytest version](https://img.shields.io/github/pipenv/locked/dependency-version/rarycoringa/alticci-sequence-service/dev/pytest?color=lightgray&label=Pytest&logo=pytest&logoColor=white)

## Clone the repository

The first step is to clone the repository of the project available in the GitHub:

```bash
$ git clone https://github.com/MaqhobelaKao/alticci-sequence-api.git
```

After cloned, make sure you are accessing the project root directory using this command:

```bash
$ cd alticci-sequence-api
```

## Run using docker and docker-compose

If you just would like to use the service's resources, please make sure that Docker and docker-compose is installed and available on your local machine and then run this command on your bash:

```bash
$ docker build --tag=alticci-service:latest .
```

Presuming you don't have any resource running on the port `8080`, you are now able to use all the service's resources on your local machine.

The following endpoint will to provide a Swagger UI with all required documentation about that resources:

- **GET** `http://localhost:8000/swagger-ui`

> You can use a browser to access http://localhost:8000/swagger-ui/ and read the API documentation.

## Run in development mode

### Environment settings

The configuration endpoint is optional, since we have default values to the required configurations. But you can custom development settings with this following environment variables:

```bash
DEBUG=True
USE_REDIS=False
CACHE_DEFAULT_TIMEOUT=60
CACHE_REDIS_HOST=0.0.0.0
CACHE_REDIS_PORT=6379

```

``

Presuming you don't have any resource running on the port `8080`, you are now able to use all the service's resources on your local machine.

The following endpoint will to provide a Swagger UI with all required documentation about that resources:

- **GET** `http://localhost:8080/swagger-ui`  where is the nth term in sequence

> You can use a browser to access http://localhost:8080/swagger-ui and read the API documentation.