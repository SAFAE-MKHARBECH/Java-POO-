package pk;

public abstract class Employe {

	private String nom,prenom;
	private int age,date;
	public Employe(String nom, String prenom, int date, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.age = age;
	}
	public String getNom() {
		return this.getClass().getSimpleName()+"Nom: "+this.nom+"Prenom: "+this.prenom;
	}
	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", date=" + date + "]";
	}
	public abstract double CalculerSalaire();
	
	
	
 
}

