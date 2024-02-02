package pk;

public class OuvrierARisque extends Ouvrier {
	private double prime;

    public OuvrierARisque(String nom, String prenom, int age, int anneeEntree, int unitesProduites, double prime) {
        super(nom, prenom, age, anneeEntree, unitesProduites);
        this.prime = prime;
    }

    @Override
    public double CalculerSalaire() {
        return super.CalculerSalaire() + prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + prime + " Francs";
    }
}
