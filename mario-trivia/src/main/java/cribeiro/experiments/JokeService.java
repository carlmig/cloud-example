package cribeiro.experiments;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * To use it via injection.
 *
 * {@code
 *     @Inject
 *     @RestClient
 *     MyRemoteService myRemoteService;
 *
 *     public void doSomething() {
 *         Set<MyRemoteService.Extension> restClientExtensions = myRemoteService.getExtensionsById("io.quarkus:quarkus-hibernate-validator");
 *     }
 * }
 */
@RegisterRestClient(configKey = "joke-service")
public interface JokeService {

    @GET
    @Path("/joke")
    String getJoke();

}
