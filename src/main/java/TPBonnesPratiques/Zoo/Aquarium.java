package TPBonnesPratiques.Zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un aquarium contenant des animaux avec différents types, noms et comportements.
 * Fournit des méthodes pour ajouter des animaux, afficher la liste des animaux et calculer la quantité de nourriture requise par jour.
 *
 * @author DIGINAMIC
 */
public class Aquarium {

    /** Liste des types d'animaux dans l'aquarium. */
    private List<String> types;

    /** Liste des noms des animaux dans l'aquarium. */
    private List<String> noms;

    /** Liste des comportements des animaux dans l'aquarium. */
    private List<String> comportements;

    /** Quantité de nourriture par jour pour un animal en kilogrammes. */
    private static final double NOURRITURE_PAR_ANIMAL_PAR_JOUR = 0.2;

    /**
     * Constructeur pour initialiser les listes des animaux.
     */
    public Aquarium() {
        this.types = new ArrayList<>();
        this.noms = new ArrayList<>();
        this.comportements = new ArrayList<>();
    }

    /**
     * Ajoute un animal à l'aquarium avec son type, son nom et son comportement.
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
     * Affiche la liste des noms des animaux dans l'aquarium.
     */
    public void afficherListeAnimaux() {
        if (noms.isEmpty()) {
            System.out.println("Aucun animal dans l'aquarium.");
            return;
        }
        for (String nom : noms) {
            System.out.println(nom);
        }
    }

    /**
     * Calcule la quantité totale de nourriture nécessaire par jour pour tous les animaux dans l'aquarium.
     *
     * @return la quantité totale de nourriture en kilogrammes.
     */
    public double calculerKgsNourritureParJour() {
        return noms.size() * NOURRITURE_PAR_ANIMAL_PAR_JOUR;
    }
}
