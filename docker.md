### Docker
Docker is a platform to run a application in isolated environment called container.

Download and Install docker desktop by [click here.](https://docs.docker.com/get-started/get-docker/)

**Note** <br>
| Terms | Uses |
| --- | --- |
|image | It's a blueprint that we later used to run a container. |
| container | It's used to run a application. |
| docker | It's a engine to manage and run containers. |
| Dockerfile | It has a container configuration. |
| docker-compose.yaml | It is used to run multiple container with Dockerfile configuration. |

#### Docker important commands

| Commands | Summery |
| --- | --- |
| docker images | show all images |
| docker ps | show all running containers |
| docker build -t <image_name>:<tag_name> . | It's used to create blueprint of the application |
| docker run -d -p <host_port>:<container_port> <image_name> | It's used to create and run container |
| docker kill <container_id> | It's stop running container |
| docker compose up --build -d | It's run multiple containers configured in the docker-compose.yaml file |
| docker compose down | It's stop running containers |

Refer following sample [Dockerfile.](Dockerfile)
