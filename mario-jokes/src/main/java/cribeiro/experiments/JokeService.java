package cribeiro.experiments;

import jakarta.enterprise.context.ApplicationScoped;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.List;

@ApplicationScoped
public class JokeService {

    private final List<String> jokes = List.of(
            "Have you heard the music in Super Mario Galaxy? It’s really out of this world!",
            "Who is Mario and Luigi’s favorite singer? MC Hammer.",
            "Why did Donkey Kong stop racing? Because he was tired of monkeying around.",
            "Why did Princess Peach go to the beauty parlor? Because she wanted a \"power-up\" for her hair!",
            "Why did Mario get kicked out of the movie theater? Because he kept jumping on the seats!",
            "What do you call a Mario brother who's always making jokes? A fun-gi!",
            "Why did Mario take a mushroom to the party? Because he wanted to have a fun-gi time!"
    );


    public String getRandomJoke(){

        Random r = new SecureRandom();
        int randomIndex = r.nextInt(jokes.size());
        return jokes.get(randomIndex);
    }
}
