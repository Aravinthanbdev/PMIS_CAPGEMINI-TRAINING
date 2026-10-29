# Spring Boot Beans Examples

A small Spring Boot Maven project demonstrating Spring beans, `@Bean`, `@Component`, `@Service`, `@Repository`, constructor injection, and singleton/prototype scopes.

## Requirements
- JDK 17 or newer
- IntelliJ IDEA (or another Java IDE)
- Internet connection for Maven to download dependencies on the first build

## Run
1. Extract the ZIP.
2. Open the `BeansSpringBootProject` folder in IntelliJ IDEA as a Maven project.
3. Wait for Maven to import dependencies.
4. Run `src/main/java/com/spring/beans/BeansApplication.java`.
5. Check the Run console for the greeting and bean-scope examples.

## Actuator endpoints
With the application running, these endpoints are available on the default port 8080:
- `http://localhost:8080/actuator/health`
- `http://localhost:8080/actuator/beans`

The beans endpoint lists Spring-managed beans; it is not a database and does not persist business data.

## Project structure
```
src/main/java/com/spring/beans/
├── basic/BasicBean.java
├── BeansApplication.java
├── BeanConfiguration.java
├── BeanMethodExample.java
├── BeanScopeExample.java
├── ComponentBeanExample.java
├── ConstructorInjectionExample.java
├── GreetingService.java
├── MessageRepository.java
├── MessageService.java
├── PrototypeBean.java
├── ScopeConfiguration.java
└── SingletonBean.java
src/main/resources/application.properties
```
