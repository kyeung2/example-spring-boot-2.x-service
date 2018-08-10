package io.flyingnimbus.api;

import io.flyingnimbus.data.BookRepository;
import io.flyingnimbus.domain.Book;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author Kye
 */
@RestController
@AllArgsConstructor
public class ApiController {

    private final BookRepository bookRepository;

    @GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Book> index() {

        return bookRepository.findAll().log();
    }

}