# Docker Deployment Demo

## Table of Contents

* [Docker](#docker)
* [Docker Important Commands](#docker-important-commands)
* [Project Setup](#project-setup)

---

## Docker

Docker is a platform to run a application in isolated environment called container.

Download and Install Docker Desktop by [click here](https://docs.docker.com/get-started/get-docker/).

### Note

| Terms                   | Uses                                                                |
| ----------------------- | ------------------------------------------------------------------- |
| **image**               | It's a blueprint that we later used to run a container.             |
| **container**           | It's used to run a application.                                     |
| **docker**              | It's a engine to manage and run containers.                         |
| **Dockerfile**          | It has a container configuration.                                   |
| **docker-compose.yaml** | It is used to run multiple container with Dockerfile configuration. |

---

## Docker Important Commands

| Commands                                                     | Summary                                                                 |
| ------------------------------------------------------------ | ----------------------------------------------------------------------- |
| `docker images`                                              | show all images                                                         |
| `docker ps`                                                  | show all running containers                                             |
| `docker build -t <image_name>:<tag_name> .`                  | It's used to create blueprint of the application                        |
| `docker run -d -p <host_port>:<container_port> <image_name>` | It's used to create and run container                                   |
| `docker kill <container_id>`                                 | It's stop running container                                             |
| `docker compose up --build -d`                               | It's run multiple containers configured in the docker-compose.yaml file |
| `docker compose down`                                        | It's stop running containers                                            |

Refer following sample [Dockerfile](Dockerfile).

---

## Project Setup

### Step 1

Navigate to the docker file directory.

### Step 2

Docker build.

```bash
docker build -t my-deplyoment-demo .
```

### Step 3

Run docker.

```bash
docker run -d -p 8081:8080 my-deplyoment-demo
```

Run docker compose.

```bash
docker compose up --build -d
```

### Step 4

Test the following API.

```text
http://localhost:8081/api/welcome
```
