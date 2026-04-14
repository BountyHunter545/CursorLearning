# CursorLearning

Basic multi-module Spring Boot starter built with Gradle.

## Project Structure

```text
.
|-- app/
|   |-- src/main/java/com/cursorlearning/app/
|   |   |-- controller/
|   |   `-- CursorLearningApplication.java
|   |-- src/main/resources/
|   `-- src/test/java/com/cursorlearning/app/
|-- functional-test/
|   `-- src/test/java/com/cursorlearning/functionaltest/
|-- deploy/
|-- iac/
|-- schema/
|-- build.gradle
|-- gradle.properties
`-- settings.gradle
```

## Modules

- `app`: Spring Boot application module with a sample REST endpoint.
- `functional-test`: Separate test module for higher-level application tests.
- `iac`, `schema`, `deploy`: Placeholder directories for infrastructure, API schema, and deployment YAML assets.
