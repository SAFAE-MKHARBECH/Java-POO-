package pk;

public class Livre implements Comparable<Livre> {
    protected String titre;
    protected String auteur;
    protected double prix;
    protected int nombrePages;
    private static int nombreTotalLivres = 0;
    private static double prixMax = 100;
    private static double prixMin = 500;

    public Livre(String titre, String auteur, double prix, int nombrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nombrePages = nombrePages;
        nombreTotalLivres++;
        prixMax = Math.max(prixMax, prix);
        prixMin = Math.min(prixMin, prix);
    }

    public static int getNombreTotalLivres() {
        return nombreTotalLivres;
    }

    public static double getPrixMax() {
        return prixMax;
    }

    public static double getPrixMin() {
        return prixMin;
    }

    @Override
    public int compareTo(Livre autreLivre) {
        return Double.compare(this.prix, autreLivre.prix);
    }

    @Override
    public String toString() {
        return "Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", nombrePages=" + nombrePages + "]";
    }

    public void afficher() {
        System.out.println("Type: Livre");
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Prix: " + prix);
        System.out.println("Nombre de pages: " + nombrePages);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

