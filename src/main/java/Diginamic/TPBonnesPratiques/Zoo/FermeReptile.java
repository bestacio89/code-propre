package Diginamic.TPBonnesPratiques.Zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une ferme de reptiles contenant des informations sur les types, les noms et les comportements des reptiles.
 * Fournit des méthodes pour ajouter des animaux, afficher la liste des animaux, compter le nombre d'animaux et calculer la quantité de nourriture requise par jour.
 *
 * @author DIGINAMIC
 */
public class FermeReptile {

    /** Liste des types de reptiles dans la ferme. */
    private List<String> types;

    /** Liste des noms des reptiles dans la ferme. */
    private List<String> noms;

    /** Liste des comportements des reptiles dans la ferme. */
    private List<String> comportements;

    /** Quantité de nourriture par jour pour un reptile en kilogrammes. */
    private static final double NOURRITURE_PAR_REPTILE_PAR_JOUR = 0.1;

    /**
     * Constructeur pour initialiser les listes des reptiles.
     */
    public FermeReptile() {
        this.types = new ArrayList<>();
        this.noms = new ArrayList<>();
        this.comportements = new ArrayList<>();
    }

    /**
     * Ajoute un reptile à la ferme avec son type, son nom et son comportement.
     *
     * @param typeAnimal le type du reptile.
     * @param nomAnimal le nom du reptile.
     * @param comportement le comportement du reptile.
     * @throws IllegalArgumentException si l'un des paramètres est null ou vide.
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        if (typeAnimal == null || typeAnimal.trim().isEmpty()) {
            throw new IllegalArgumentException("Le type du reptile ne peut pas être nul ou vide.");
        }
        if (nomAnimal == null || nomAnimal.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du reptile ne peut pas être nul ou vide.");
        }
        if (comportement == null || comportement.trim().isEmpty()) {
            throw new IllegalArgumentException("Le comportement du reptile ne peut pas être nul ou vide.");
        }
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    /**
     * Affiche la liste des noms des reptiles dans la ferme.
     */
    public void afficherListeAnimaux() {
        if (noms.isEmpty()) {
            System.out.println("Aucun reptile dans la ferme.");
            return;
        }
        for (String nom : noms) {
            System.out.println(nom);
        }
    }

    /**
     * Compte le nombre total de reptiles dans la ferme.
     *
     * @return le nombre total de reptiles.
     */
    public int compterAnimaux() {
        return noms.size();
    }

    /**
     * Calcule la quantité totale de nourriture nécessaire par jour pour tous les reptiles dans la ferme.
     *
     * @return la quantité totale de nourriture en kilogrammes.
     */
    public double calculerKgsNourritureParJour() {
        return noms.size() * NOURRITURE_PAR_REPTILE_PAR_JOUR;
    }
}
