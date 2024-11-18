package executables;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class ConnexionMongoDB {
    public void testConnexionMongoDB() {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("Royaume");
            System.out.println("Connexion réussie à la base de donnée : " + database.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
