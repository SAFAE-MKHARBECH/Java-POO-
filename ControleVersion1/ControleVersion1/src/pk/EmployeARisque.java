package pk;

public class EmployeARisque extends Employe {

    private double prime=200;

    public EmployeARisque(String nom, String prenom, int age, int anneeEntree, double prime) {
        super(nom, prenom, age, anneeEntree);
        this.prime = prime;
    }

	@Override
	public double CalculerSalaire() {
		// TODO Auto-generated method stub
		return 0;
	}
}
