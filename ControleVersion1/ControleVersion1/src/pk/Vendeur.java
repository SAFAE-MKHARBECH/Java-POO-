package pk;

public class Vendeur extends Employe  {
	private double CA;

	public Vendeur(String nom, String prenom, int date, int age, double cA) {
		super(nom, prenom, date, age);
		CA = cA;
	}

	@Override
	public String toString() {
		return "Vendeur [CA=" + CA + "]";
	}
	@Override
	public double CalculerSalaire() {
		return CA*0.2+400;
	}
	

}
