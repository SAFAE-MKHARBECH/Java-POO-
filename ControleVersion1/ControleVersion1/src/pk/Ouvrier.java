package pk;

public class Ouvrier extends Employe {
	private double nbrunite;

	public Ouvrier(String nom, String prenom, int date, int age, double nbrunite) {
		super(nom, prenom, date, age);
		this.nbrunite = nbrunite;
	}

	@Override
	public String toString() {
		return "Ouvrier [nbrunite=" + nbrunite + "]";
	}
	@Override
	public double CalculerSalaire() {
		return this.nbrunite*5;
	}
	

}
