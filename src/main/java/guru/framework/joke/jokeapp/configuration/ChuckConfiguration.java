package guru.framework.joke.jokeapp.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//marks a class that contains one or more beans defined
// inside or as a source of programmatic configuration.
//This class is usually created when bringing in a bean
//from another library not controlled by you.
//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
