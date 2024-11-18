package entites;

public class Citoyen {
    private String metier;
    private int nombre;
    private String role;

    public Citoyen(String metier, int nombre, String role) {
        this.metier = metier;
        this.nombre = nombre;
        this.role = role;
    }

    public void afficherDetails() {
        System.out.println("Citoyens: " + metier + "\nNombre: " + nombre + "\nRole: " + role);
    }
}
