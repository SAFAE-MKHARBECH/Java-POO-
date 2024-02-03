package pk;

public class Roman extends Livre {
    private String maisonEdition;
    private int nbExemplaire;

    public Roman(String titre, String auteur, double prix, int nombrePages, String maisonEdition, int nbExemplaire) {
        super(titre, auteur, prix, nombrePages);
        this.maisonEdition = maisonEdition;
        this.nbExemplaire = nbExemplaire;
    }

    @Override
    public String toString() {
        return "Roman [maisonEdition=" + maisonEdition + ", nbExemplaire=" + nbExemplaire + ", " + super.toString() + "]";
    }

    @Override
    public void afficher() {
        System.out.println("Type: Roman");
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Prix: " + prix);
        System.out.println("Nombre de pages: " + nombrePages);
        System.out.println("Maison d'édition: " + maisonEdition);
        System.out.println("Nombre d'exemplaires: " + nbExemplaire);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

