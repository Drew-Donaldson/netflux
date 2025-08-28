# Netflux Microservices

This repository contains the source code for the **Netflux** project, developed as part of Section 9 of the Udemy course *AWS Cloud Architecture For Java Spring Boot Developers* led by Vinoth Selvaraj. The project demonstrates a microservices architecture using Java Spring Boot, with two services communicating over REST APIs and deployed using AWS services.

## Project Overview

Netflux is a sample application comprising two microservices:

- **customer-service**: Manages customer data, including operations to retrieve and update customer information and preferences (e.g., favorite movie genres). It interacts with the `movie-service` via REST APIs.
- **movie-service**: Handles movie data, including movie details and genres, stored in a PostgreSQL database.
- **postgres**: Contains database configuration and initialization scripts (e.g., `init.sql`) for setting up the PostgreSQL database used by the microservices.

The project showcases best practices for building, testing, and deploying Spring Boot microservices on AWS, using tools like Maven, Docker, and AWS ECS or RDS, as covered in the course.

