# Ride Platform -- Distributed Microservice Backend

## Overview

This repository contains a distributed backend system implementing a
ride‑dispatch platform similar to Uber or Bolt.

The system is composed of multiple independent microservices
communicating through gRPC using Protocol Buffers. Each service is
responsible for its own domain logic and can be deployed independently.

Key architectural goals:

-   Microservice isolation
-   High scalability
-   Contract-based communication
-   Containerized deployment
-   Clear domain boundaries

------------------------------------------------------------------------

# Architecture

Services included in the platform:

-   ClientService
-   RiderService
-   DispatchService
-   TrackerService
-   AnalyticService

High level flow:

ClientService → RiderService → DispatchService → TrackerService →
AnalyticService

------------------------------------------------------------------------

# Services

## ClientService

Handles authentication and authorization.

Responsibilities:

-   JWT token generation
-   Authentication logic
-   gRPC authentication interface

Main files:

src/main/java/org/example/AuthService\
src/main/proto/auth.proto

------------------------------------------------------------------------

## RiderService

Manages rider lifecycle and ride requests.

Responsibilities:

-   Rider registration
-   Ride request creation
-   Ride state management

------------------------------------------------------------------------

## DispatchService

Core orchestration service responsible for ride matching.

Responsibilities:

-   Rider-driver matching
-   Dispatch algorithm
-   Ride lifecycle coordination

------------------------------------------------------------------------

## TrackerService

Handles real-time ride tracking.

Responsibilities:

-   GPS updates
-   Location streaming
-   Trip state updates

------------------------------------------------------------------------

## AnalyticService

Responsible for analytics and statistics aggregation.

Responsibilities:

-   Ride statistics
-   Usage metrics
-   Financial insights

Example entity:

Entity/Account.java

------------------------------------------------------------------------

# Communication

Services communicate via:

-   gRPC
-   Protocol Buffers

Proto files are located in:

src/main/proto

Generated sources:

target/generated-sources/protobuf

Advantages:

-   Low latency
-   Strong typing
-   Efficient binary protocol

------------------------------------------------------------------------

# Build

The project uses Maven with wrapper support.

Build all services:

./mvnw clean install

Windows:

mvnw.cmd clean install

------------------------------------------------------------------------

# Running Services

Each microservice includes a Docker Compose configuration.

Start a service:

docker compose up

------------------------------------------------------------------------

# Development Requirements

-   Java 21
-   Maven
-   Docker
-   Protocol Buffers

Recommended IDE:

-   IntelliJ IDEA
-   VSCode
-   JetBrains Rider

------------------------------------------------------------------------

# Testing

Tests are located in:

src/test/java

Run tests:

./mvnw test

------------------------------------------------------------------------

# Repository Structure

. ├── ClientService ├── RiderService ├── DispatchService ├──
TrackerService ├── AnalyticService ├── pom.xml ├── mvnw └── mvnw.cmd

Typical service structure:

src ├── main │ ├── java │ ├── proto │ └── resources └── test

------------------------------------------------------------------------

# Design Principles

Service Isolation\
Each microservice owns its data, API and business logic.

Contract Based Communication\
All inter-service communication is defined using protobuf contracts.

Independent Deployment\
Each service can be built, deployed and scaled independently.

------------------------------------------------------------------------

# Future Improvements

-   Kafka event streaming
-   Distributed tracing
-   Prometheus + Grafana monitoring
-   API Gateway
-   Service discovery
-   Circuit breaker patterns

------------------------------------------------------------------------

# License

MIT
