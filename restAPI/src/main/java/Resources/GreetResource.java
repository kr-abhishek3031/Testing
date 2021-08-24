package Resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greet")
public class GreetResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greet() {
        return "Hello!";
    }
}
