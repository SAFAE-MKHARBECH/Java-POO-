package pk;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		 
        Employe[] employes = new Employe[3];
        employes[0] = new Vendeur("meryem", "laafar", 30, 2010, 10000);
        employes[1] = new Ouvrier("meryem2", "laafar", 25, 2015, 200);
        employes[2] = new OuvrierARisque("manal", "Boukheffa", 35, 2008, 150, 100);

        // 2. Afficher les informations : type de l’employé + son prénom et son nom. Et aussi son salaire.
        for (Employe employe : employes) {
            System.out.println(employe.getNom() + ", Salaire: " + employe.CalculerSalaire() + " Francs");
        }

        // 3. Trier le tableau des employés par salaire, afficher à nouveau le tableau ;
        Arrays.sort(employes, (e1, e2) -> Double.compare(e2.CalculerSalaire(), e1.CalculerSalaire()));
        System.out.println("\nAprès le tri par salaire :");
        for (Employe employe : employes) {
            System.out.println(employe.getNom() + ", Salaire: " + employe.CalculerSalaire() + " Francs");
        }

        // 4. Ajouter un nouvel employé (de votre choix);
        Employe nouvelEmploye = new Vendeur("White", "Alice", 28, 2018, 12000);
        employes = Arrays.copyOf(employes, employes.length + 1);
        employes[employes.length - 1] = nouvelEmploye;

        // 5. Supprimer le premier employé dans le tableau.
        if (employes.length > 0) {
            employes = Arrays.copyOfRange(employes, 1, employes.length);
        }

        System.out.println("\nAprès l'ajout et la suppression :");
        for (Employe employe : employes) {
            System.out.println(employe.getNom() + ", Salaire: " + employe.CalculerSalaire() + " Francs");
        }
    }
}