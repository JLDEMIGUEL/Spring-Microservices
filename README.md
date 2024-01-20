<p align="center">
  <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" width="100" />
</p>
<p align="center">
    <h1 align="center">SPRING-MICROSERVICES</h1>
</p>
<p align="center">
		<em>Developed with the software and tools below.</em>
</p>
<p align="center">
	<img src="https://img.shields.io/badge/YAML-CB171E.svg?style=flat-square&logo=YAML&logoColor=white" alt="YAML">
	<img src="https://img.shields.io/badge/Docker-2496ED.svg?style=flat-square&logo=Docker&logoColor=white" alt="Docker">
	<img src="https://img.shields.io/badge/Spring-000000.svg?style=flat-square&logo=Spring&logoColor=white" alt="Spring">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat-square&logo=openjdk&logoColor=white" alt="java">
</p>
<hr>

## 🔗 Quick Links

> - [📍 Overview](#-overview)
> - [📦 Features](#-features)
> - [📂 Repository Structure](#-repository-structure)

---

## 📍 Overview
<p>This project is an implementation of a microservices architecture using Spring Boot and various cloud-native technologies. It showcases a range of features that make it suitable for production environments, including resilience, scalability, maintainability, documentation, Dockerization, cloud-native principles, config management, service discovery, resiliency, observability, authentication, authorization, and event-driven architecture.</p>
---

## 📦 Features
The project has the following features:

* **Microservices Architecture:** The project is built using a microservices architecture.
* **Production-Ready Microservices:** The project implements the following features to make the microservices production-ready:
    * Resilience: The microservices is able to handle failures and disruptions.
    * Scalability: The microservices is able to scale horizontally to meet demand.
    * Maintainability: The microservices is easy to maintain and update.
* **Documentation:** The project is documented using OpenAPI Specification (OAS) and Swagger to ensure clear communication and understanding among developers.
* **Dockerization and Containerization:** The project uses Docker to containerize the microservices, which makes them easier to deploy and manage. The project uses Docker Compose for streamlining application deployment.
* **Cloud-Native Applications:** The project follows cloud-native principles and the 15 factor methodology to ensure that the application is optimized for cloud deployment.
* **Config Management:** The project uses Spring Cloud Config Server to implement centralized configuration management for the microservices. This ensures that all microservices are using the same consistent configuration.
* **Service Discovery and Registration:** The project uses Spring Eureka to discover and register microservices dynamically. This makes it easy for microservices to find each other and communicate with each other.
* **Resiliency and Fault Tolerance:** The project uses Resilience4J to implement resilient microservices that can handle failures and disruptions. This ensures that the application is highly available and can continue to operate even if some of the microservices fail.
* **Observability and Monitoring:** The project uses Prometheus, Loki, Promtail, Tempo, and Grafana to establish comprehensive observability and monitoring for the microservices. This allows developers to proactively detect and diagnose issues with the application.
* **Authentication and Authorization:** The project uses OAuth2, OpenID Connect, and Spring Security to implement secure authentication and authorization mechanisms for the microservices. This protects sensitive data and user access.
* **Event-Driven Architecture:** The project uses RabbitMQ, Kafka, Spring Cloud Functions, and Spring Cloud Stream to build event-driven microservices that communicate asynchronously. This enables efficient and reactive application behavior.


---

## 📂 Repository Structure

```
└── Spring-Microservices/
    ├── accounts
    ├── cards
    ├── configserver
    ├── docker-compose
    │   ├── default
    │   ├── observability
    │   ├── prod
    │   └── qa
    ├── eurekaserver
    ├── gatewayserver
    ├── loans
    └── message
```
