import executables.ConnexionMongoDB;

public class Main {
    public static void main(String[] args) {
        ConnexionMongoDB connexion = new  ConnexionMongoDB();
        connexion.testConnexionMongoDB();
    }
}
