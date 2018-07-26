package io.flyingnimbus.data;

import io.flyingnimbus.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Kye
 */
public interface BookRepository extends MongoRepository<Book, String> {

    Book findByIsbn(String isbn);

    List<Book> findByAuthor(String author);
}
