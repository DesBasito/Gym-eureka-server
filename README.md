# Gym Discovery Service

Netflix Eureka Server for microservices service discovery and registration in the Gym CRM System.

## Overview

This service provides service registry and discovery functionality for the Gym microservices architecture, enabling:
- Automatic service registration
- Service health monitoring
- Client-side load balancing
- Dynamic service discovery

## Technology Stack

- **Spring Boot**: 3.4.5
- **Spring Cloud**: 2024.0.0
- **Netflix Eureka Server**: Service registry

## Configuration

```yaml
server:
  port: 8761

spring:
  application:
    name: Gym-discovery-service

eureka:
  client:
    register-with-eureka: false
    fetch-registry: false
```

## Running the Service

```bash
mvn spring-boot:run
```

## Access

- **Eureka Dashboard**: http://localhost:8761
- View all registered services and their health status

## Registered Services

- **gym-crm-system** (port 8081/8080)
- **workload-service** (port 8082)

## Integration

Microservices register with Eureka using:

```yaml
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
    register-with-eureka: true
    fetch-registry: true
```

## Features

- Service health monitoring with lease renewal
- Dashboard UI for service visualization
- RESTful API for service queries
- High availability support (can be clustered)

## Architecture

```
┌─────────────────────┐
│ Discovery Service   │
│   (Eureka Server)   │
│     Port: 8761      │
└──────────┬──────────┘
           │
    ┌──────┴──────┐
    │             │
┌───▼────┐   ┌───▼────┐
│ Gym-CRM│   │Workload│
│ System │   │Service │
└────────┘   └────────┘
```

## Notes

- This service does not register itself with Eureka
- Acts as standalone service registry
- Must be started before other microservices