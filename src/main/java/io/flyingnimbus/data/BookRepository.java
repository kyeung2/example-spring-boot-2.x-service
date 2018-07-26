package io.flyingnimbus.data;

import io.flyingnimbus.domain.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author Kye
 */
public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}
