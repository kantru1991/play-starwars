package bdoisw.test.mongodb;

import com.mongodb.MongoClient;

public class MongoConnection {
	private static MongoClient mongoClient = new MongoClient("http://localhost:27017");

	public static MongoClient getMongoClient() 
	{
		return mongoClient;
	}
}