package io.flyingnimbus;

import io.flyingnimbus.domain.Book;
import io.flyingnimbus.domain.Stubs;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.CollectionOptions;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * @author Kye
 */
@SpringBootApplication
public class LibraryApp {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApp.class, args);
    }

    @Bean
    public CommandLineRunner initData(MongoOperations mongo) {
        return (String... args) -> {

            mongo.dropCollection(Book.class);
            mongo.createCollection(Book.class, CollectionOptions.empty().size(1000000).capped());
            mongo.save(Stubs.BOOK_1);
            mongo.save(Stubs.BOOK_2);
            mongo.save(Stubs.BOOK_3);
        };
    }

}