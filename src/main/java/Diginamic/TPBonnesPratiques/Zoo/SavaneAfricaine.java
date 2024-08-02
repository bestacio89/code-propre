package Diginamic.TPBonnesPratiques.Zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une savane africaine contenant des informations sur les types, les noms et les comportements des animaux.
 * Fournit des méthodes pour ajouter des animaux, afficher la liste des animaux, compter le nombre d'animaux et calculer la quantité de nourriture requise par jour.
 *
 * @author DIGINAMIC
 */
public class SavaneAfricaine {

    /** Liste des types d'animaux dans la savane. */
    private List<String> types;

    /** Liste des noms des animaux dans la savane. */
    private List<String> noms;

    /** Liste des comportements des animaux dans la savane. */
    private List<String> comportements;

    /** Quantité de nourriture par jour pour un animal en kilogrammes. */
    private static final int NOURRITURE_PAR_ANIMAL_PAR_JOUR_EN_KG = 10;

    /**
     * Constructeur pour initialiser les listes des animaux dans la savane.
     */
    public SavaneAfricaine() {
        this.types = new ArrayList<>();
        this.noms = new ArrayList<>();
        this.comportements = new ArrayList<>();
    }

    /**
     * Ajoute un animal à la savane avec son type, son nom et son comportement.
     *
     * @param typeAnimal le type de l'animal.
     * @param nomAnimal le nom de l'animal.
     * @param comportement le comportement de l'animal.
     * @throws IllegalArgumentException si l'un des paramètres est null ou vide.
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        if (typeAnimal == null || typeAnimal.trim().isEmpty()) {
            throw new IllegalArgumentException("Le type de l'animal ne peut pas être nul ou vide.");
        }
        if (nomAnimal == null || nomAnimal.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'animal ne peut pas être nul ou vide.");
        }
        if (comportement == null || comportement.trim().isEmpty()) {
            throw new IllegalArgumentException("Le comportement de l'animal ne peut pas être nul ou vide.");
        }
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    /**
     * Affiche la liste des noms des animaux dans la savane.
     */
    public void afficherListeAnimaux() {
        if (noms.isEmpty()) {
            System.out.println("Aucun animal dans la savane.");
            return;
        }
        for (String nom : noms) {
            System.out.println(nom);
        }
    }

    /**
     * Compte le nombre total d'animaux dans la savane.
     *
     * @return le nombre total d'animaux.
     */
    public int compterAnimaux() {
        return noms.size();
    }

    /**
     * Calcule la quantité totale de nourriture nécessaire par jour pour tous les animaux dans la savane.
     *
     * @return la quantité totale de nourriture en kilogrammes.
     */
    public int calculerKgsNourritureParJour() {
        return noms.size() * NOURRITURE_PAR_ANIMAL_PAR_JOUR_EN_KG;
    }
}
