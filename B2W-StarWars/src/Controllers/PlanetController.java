package Controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@Path("/v1/planet")
public class PlanetController {
		
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public String getPlanetById() {
			return "ola";
		}
}