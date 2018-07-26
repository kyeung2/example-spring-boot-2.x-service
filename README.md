# example-spring-boot-2.x-service
creating a simple Spring-boot 2.X service to compare with different frameworks




## The example service
A simple service with one endpoint GET /books. This is serviced by a Spring MVC controller, which passes the call to a Spring Data Mongo Repository for the list of Books. 


`>curl -X GET http://localhost:8080/books`


##  Spring Boot 2.X features

* Spring Framework 5
* event-loop execution model
    - asynchronous and non-blocking
    - thread pool can be smaller than Spring Boot 1.5.X
* Support for **Reactive Streams** API (Spring implementation: **Project Reactor** )
* have choice of migrating from Spring Boot 1.5.X incrementally
    - do nothing at all and continue to use the blocking stack, Spring MVC Spring Data
    - migrate the Reactive Spring Data only. i.e. continue to use controllers but return a Flux or Mono.
* Reactive stack
    - **Spring WebFlux** (non-blocking reactive alternative web framework to Spring MVC.)
    - **Reactive Spring Data** (where the DB supports e.g. spring-boot-starter-data-mongodb-reactive)
    - Netty, Servlet 3.1 (async runtime)


## Resources

- https://www.youtube.com/watch?v=TasMZsZxLCA