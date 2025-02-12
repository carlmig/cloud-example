package cribeiro.experiments;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/trivia")
public class TriviaResource {

    @Inject
    TriviaService triviaService;

    @Inject
    @RestClient
    JokeService jokeService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTrivia() {

        StringBuilder sb = new StringBuilder();
        sb.append("Trivia: ").append(triviaService.getRandomTrivia()).append("\nJoke: ").append(jokeService.getJoke());
        return sb.toString();
    }
}
