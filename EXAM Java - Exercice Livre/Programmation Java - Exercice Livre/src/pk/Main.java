package pk;

import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	    public static void main(String[] args) {
	        Livre[] livres = new Livre[2];
	        Roman[] romans = new Roman[2];

	        livres[0] = new Livre("Titre 1", "Auteur 1", 19.99, 300);
	        livres[1] = new Livre("Titre 2", "Auteur 2", 14.99, 250);

	        romans[0] = new Roman("Titre 3", "Auteur 3", 24.99, 400, "Maison 1", 100);
	        romans[1] = new Roman("Titre 4", "Auteur 4", 29.99, 350, "Maison 2", 150);

	        for (Livre livre : livres) {
	            livre.afficher();
	        }

	        for (Roman roman : romans) {
	            roman.afficher();
	        }

	        Arrays.sort(livres);

	        System.out.println("Tableau trié par prix:");

	        for (Livre livre : livres) {
	            livre.afficher();
	        }

	        Livre nouveauLivre = new Livre("Titre 5", "Auteur 5", 9.99, 200);
	        livres = Arrays.copyOf(livres, livres.length + 1);
	        livres[livres.length - 1] = nouveauLivre;

	        System.out.println("Tableau avec un nouveau livre ajouté:");

	        for (Livre livre : livres) {
	            livre.afficher();
	        }

	        livres = Arrays.copyOfRange(livres, 1, livres.length);

	        System.out.println("Tableau avec le premier livre supprimé:");

	        for (Livre livre : livres) {
	            livre.afficher();
	        }

	        Livre[] nouveauTableauLivres = Arrays.copyOf(livres, livres.length);

	        System.out.println("Nouveau tableau de livres:");

	        for (Livre livre : nouveauTableauLivres) {
	            livre.afficher();
	        }

	        Collections.reverse(Arrays.asList(livres));

	        System.out.println("Tableau de livres inversé:");

	        for (Livre livre : livres) {
	            livre.afficher();
	        }
	    }


}
