package org.iceberg.dao;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBDao {
	// To directly connect to a single MongoDB server
	// (this will not auto-discover the primary even if it's a member of a replica set)
//	MongoClient mongoClient = new MongoClient();
//
//	// or
//	MongoClient mongoClient = new MongoClient( "localhost" );

	// or
	MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

	// or, to connect to a replica set, with auto-discovery of the primary, supply a seed list of members
//	MongoClient mongoClient = new MongoClient(
//	  Arrays.asList(new ServerAddress("localhost", 27017),
//	                new ServerAddress("localhost", 27018),
//	                new ServerAddress("localhost", 27019)));

	// or use a connection string
//	MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017,localhost:27018,localhost:27019");
//	MongoClient mongoClient = new MongoClient(connectionString);

	MongoDatabase database = mongoClient.getDatabase("hello-world");
	
	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		MongoDatabase database = mongoClient.getDatabase("hello-world");
		MongoCollection<Document> collection = database.getCollection("user");
		
//		Document doc = new Document("name", "MongoDB")
//        .append("type", "database")
//        .append("count", 1)
//        .append("info", new Document("x", 203).append("y", 102));
//		collection.insertOne(doc);
		
		Document document = collection.find().first();
		System.out.println(document.toJson());
	}
}
