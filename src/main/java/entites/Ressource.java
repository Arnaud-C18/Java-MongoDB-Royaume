package entites;

public class Ressource {
    private String type;
    private int quantite;

    public Ressource(String type, int quantite) {
        this.type = type;
        this.quantite = quantite;
    }

    public void afficherDetails() {
        System.out.println("Ressource: " + type + "\nQuantité: " + quantite);
    }
}
