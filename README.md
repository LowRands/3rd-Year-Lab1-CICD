# CICD-1 Catalog Service

## Overview

The Catalog Service is a Spring Boot microservice responsible for managing product data.

This service exposes a REST API that allows users to:

- Create products
- View all products

For Lab 1, product data is stored temporarily in an in-memory Java `List`. No database integration has been implemented yet.

## Technology Stack

- Java 21
- Spring Boot
- Maven
- Spring Web
- Spring Validation
- Lombok
- Springdoc OpenAPI (Swagger UI)

## Service Configuration

| Property | Value |
|-----------|---------|
| Service Name | catalog-service |
| Port | 8081 |
