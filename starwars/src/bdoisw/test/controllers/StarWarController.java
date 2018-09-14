package bdoisw.test.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bdoisw.test.entities.Planet;

@Path("/api")
public class StarWarController
{
	@GET
	@Path("/planets")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Planet> listPlanets()
	{
		List<Planet> planetCollection = new ArrayList<Planet>();
		
		planetCollection.add(new Planet("ola", "iii", "nusei"));
		
		return planetCollection;
	}
}