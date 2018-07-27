package io.flyingnimbus;

import io.flyingnimbus.domain.Book;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.core.CollectionOptions;
import org.springframework.data.mongodb.core.MongoOperations;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;


/**
 * @author Kye
 */
@SpringBootApplication
public class Application   {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner initData(MongoOperations mongo) {
        return (String... args) -> {


            mongo.dropCollection(Book.class);
            mongo.createCollection(Book.class, CollectionOptions.empty().size(1000000).capped());
            mongo.save(Book.builder().title("Sapiens").subTitle("A Brief History of Humankind").author("Yuval Noah Harari").description("What makes us brilliant? What makes us deadly? What makes us Sapiens? This bestselling history of our species challenges everything we know about being human.").genre("History of Civilisation & Culture").isbn("0099590085").build());
            mongo.save(Book.builder().title("Homo Deusw").subTitle("A Brief History of Tomorrow").author("Yuval Noah Harari").description("Sapiens showed us where we came from. Homo Deus shows us where we're going. War is obsolete. You are more likely to commit suicide than be killed in conflict. Famine is disappearing. You are at more risk of obesity than starvation. Death is just a technical problem. Equality is out - but immortality is in. What does our future hold? Yuval Noah Harari, author of the bestselling phenomenon Sapiens envisions a not-too-distant world in which we face a new set of challenges. Homo Deus explores the projects, dreams and nightmares that will shape the twenty-first century - from overcoming death to creating artificial life. It asks the fundamental questions: Where do we go from here? And how will we protect this fragile world from our own destructive powers? \"Homo Deus will shock you. It will entertain you. Above all, it will make you think in ways you had not thought before\". (Daniel Kahneman, author of Thinking Fast, and Slow).").genre("History of Civilisation & Culture").isbn("1784703931").build());
            mongo.save(Book.builder().title("Meditations").author("Marcus Aurelius").description("Written in Greek by an intellectual Roman emperor without any intention of publication, the \"Meditations\" of Marcus Aurelius (AD 121-180) offer a wide range of fascinating spiritual reflections and exercises developed, as the leader struggled to understand himself and make sense of the universe. Spanning from doubt and despair to conviction and exaltation, they cover such diverse topics as the question of virtue, human rationality, the nature of the gods and Aurelius's own emotions. But while the Meditations were composed to provide personal consolation, in developing his beliefs Marcus also created one of the greatest of all works of philosophy: a series of wise and practical aphorisms that have been consulted and admired by statesmen, thinkers and ordinary readers for almost two thousand years.").genre("Religious Nature & Existence of God").isbn("0140449337").build());


            Properties properties = System.getProperties();

            System.out.println();


        };
    }

}