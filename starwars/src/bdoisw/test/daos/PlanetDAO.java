package bdoisw.test.daos;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import bdoisw.test.entities.*;
import bdoisw.test.mongodb.*;

public class PlanetDAO
{
	private static MongoDatabase starWarsDatabase = MongoConnection.getMongoClient().getDatabase("starwars");
	
	public static List<Planet> listPlanets(int id)
	{
		MongoCollection<Planet> collection = starWarsDatabase.getCollection(Planet.entityName, Planet.class);
		
		FindIterable<Planet> documents = collection.find();
		
		if(documents == null)
		{
			return null;
		}
		
		List<Planet> resultList = new ArrayList<Planet>();
		
		for(Planet planet : documents)
		{
			resultList.add(planet);
		}
		
		return resultList;
	}
}