package io.flyingnimbus.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author Kye
 */
@Data
@Builder
public class Book {

    private String title;
    private String subTitle;
    private String genre;
    private String description;
    @Id
    private String isbn;
    private String author;

}
