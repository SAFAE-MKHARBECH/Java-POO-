package pk1;

import java.util.Arrays;
import java.util.Collections;

public class TabPersonnes {
    private Personne[] tableauPersonnes;

   
    public TabPersonnes(int taille) {
        tableauPersonnes = new Personne[taille];
    }

    public void remplirTableau(Personne[] personnes) {
    	tableauPersonnes = new Personne[personnes.length];

        for (int i = 0; i < personnes.length; i++) {
            tableauPersonnes[i] = personnes[i];
        }
    }

    public void trierTableau() {
        Arrays.sort(tableauPersonnes);
    }

    public void ajouterPersonne(Personne nouvellePersonne) {
        for (int i = 0; i < tableauPersonnes.length; i++) {
            if (tableauPersonnes[i] == null) {
                tableauPersonnes[i] = nouvellePersonne;
                return; 
            }
        }
        System.out.println("Le tableau est plein. Impossible d'ajouter une nouvelle personne.");
    }
    public void supprimerPersonne(int index) {
        if (index >= 0 && index < tableauPersonnes.length) {
            tableauPersonnes[index] = null;
            
            for (int i = index; i < tableauPersonnes.length - 1; i++) {
                tableauPersonnes[i] = tableauPersonnes[i + 1];
            }
            tableauPersonnes[tableauPersonnes.length - 1] = null; 
        } else {
            System.out.println("Index invalide. Impossible de supprimer la personne.");
        }
    }
    public int compterElements() {
        int count = 0;
        for (Personne personne : tableauPersonnes) {
            if (personne != null) {
                count++;
            }
        }
        return count;
    }

    public void inverserOrdreTableau() {
        Collections.reverse(Arrays.asList(tableauPersonnes));
    }

    public void afficherElements() {
        for (Personne personne : tableauPersonnes) {
            if (personne != null) {
                System.out.println(personne.toString());
            }
        }
    }

    public Personne obtenirPlusGrand() {
        if (tableauPersonnes.length > 0) {
            Personne plusGrand = tableauPersonnes[0];
            for (Personne personne : tableauPersonnes) {
                if (personne != null && personne.compareTo(plusGrand) > 0) {
                    plusGrand = personne;
                }
            }
            return plusGrand;
        }
        return null;
    }
    public boolean testerEgalite(Personne[] othertab) {
        return Arrays.equals(tableauPersonnes, othertab);
    }

}