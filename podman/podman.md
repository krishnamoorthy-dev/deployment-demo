# Podman Deployment Demo

## Table of Contents

* [Podman](#podman)
* [Podman Important Commands](#podman-important-commands)
* [Project Setup](#project-setup)

---

## Podman

Podman is a platform to run a application in isolated environment called container.

Download and Install Podman Desktop by [click here](https://podman-desktop.io/downloads).

### Note

| Terms                   | Uses                                                                |
| ----------------------- | ------------------------------------------------------------------- |
| **image**               | It's a blueprint that we later used to run a container.             |
| **container**           | It's used to run a application.                                     |
| **docker**              | It's a engine to manage and run containers.                         |
| **Dockerfile**          | It has a container configuration.                                   |
| **docker-compose.yaml** | It is used to run multiple container with Dockerfile configuration. |

---

## Podman Important Commands

| Commands                                                     | Summary                                                                 |
|--------------------------------------------------------------| ----------------------------------------------------------------------- |
| `podman images`                                              | show all images                                                         |
| `podman ps`                                                  | show all running containers                                             |
| `podman build -t <image_name>:<tag_name> .`                  | It's used to create blueprint of the application                        |
| `podman run -d -p <host_port>:<container_port> <image_name>` | It's used to create and run container                                   |
| `podman kill <container_id>`                                 | It's stop running container                                             |
| `podman compose up -d`                                       | It's run multiple containers configured in the docker-compose.yaml file |
| `podman compose down`                                        | It's stop running containers                                            |

Refer following sample [Dockerfile](Dockerfile).

---

## Project Setup

### Step 1

Navigate to the podman file directory.

### Step 2

Podman build.

```bash
podman build -t my-deplyoment-demo .
```

### Step 3

Run podman.

```bash
podman run -d -p 8081:8080 my-deplyoment-demo
```

Run docker compose.

```bash
podman compose up -d
```

### Step 4

Test the following API.

```text
http://localhost:8081/api/welcome
```
