package cribeiro.experiments;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/joke")
public class JokeResource {

    @Inject
    JokeService jokeService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getJoke() {
        return jokeService.getRandomJoke();
    }
}
