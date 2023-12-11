package pk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListePersonnes {
    private List<Personne> listePersonnes;

    public ListePersonnes() {
        listePersonnes = new ArrayList<>();
    }

    
    public void ajouterPersonne(Personne personne) {
        listePersonnes.add(personne);
    }

    
    public void afficherListe() {
        for (Personne personne : listePersonnes) {
            System.out.println(personne.toString());
        }
    }

   
    public void parcourirListeAvecIterateur() {
        Iterator<Personne> iterateur = listePersonnes.iterator();
        while (iterateur.hasNext()) {
            Personne personne = iterateur.next();
            System.out.println(personne.toString());
        }
    }

    
    public void insererElement(int index, Personne personne) {
        listePersonnes.add(index, personne);
    }

    
    public Personne recupererElement(int index) {
        if (index >= 0 && index < listePersonnes.size()) {
            return listePersonnes.get(index);
        } else {
            System.out.println("Index invalide.");
            return null;
        }
    }

    
    public void supprimerElement(Personne personne) {
        listePersonnes.remove(personne);
    }

    
    public boolean rechercherElement(Personne personne) {
        return listePersonnes.contains(personne);
    }

    
    public void trierListe() {
        Collections.sort(listePersonnes);
    }

    
    public List<Personne> copierListeDansTableau() {
        return new ArrayList<>(listePersonnes);
    }


    
    public void melangerListe() {
        Collections.shuffle(listePersonnes);
    }

    
    public void inverserListe() {
        Collections.reverse(listePersonnes);
    }

    
    public List<Personne> extrairePartieListe(int debut, int fin) {
        return listePersonnes.subList(debut, fin);
    }

    
    public boolean comparerListes(List<Personne> autreListe) {
        return listePersonnes.equals(autreListe);
    }

    
    public void echangerElements(int index1, int index2) {
        Collections.swap(listePersonnes, index1, index2);
    }

    
    public void viderListe() {
        listePersonnes.clear();
    }

    
    public boolean estVide() {
        return listePersonnes.isEmpty();
    }

}