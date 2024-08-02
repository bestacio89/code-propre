package TPBonnesPratiques.Zoo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Représente un zoo contenant différentes zones et aquariums, avec des méthodes pour ajouter des animaux et afficher la liste des animaux.
 *
 * @author DIGINAMIC
 */
public class Zoo {

    /** Logger pour la classe Zoo. */
    private static final Logger logger = LoggerFactory.getLogger(Zoo.class);

    /** Nom du zoo. */
    private String nom;

    /** Zone dédiée aux animaux de la savane africaine. */
    private SavaneAfricaine savaneAfricaine;

    /** Zone dédiée aux animaux carnivores. */
    private ZoneCarnivore zoneCarnivore;

    /** Zone dédiée aux reptiles. */
    private FermeReptile fermeReptile;

    /** Aquarium du zoo. */
    private Aquarium aquarium;

    /**
     * Constructeur pour initialiser le zoo avec un nom.
     *
     * @param nom le nom du zoo.
     * @throws IllegalArgumentException si le nom est null ou vide.
     */
    public Zoo(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            logger.error("Le nom du zoo ne peut pas être nul ou vide.");
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être nul ou vide.");
        }
        this.nom = nom;
        this.savaneAfricaine = new SavaneAfricaine();
        this.zoneCarnivore = new ZoneCarnivore();
        this.fermeReptile = new FermeReptile();
        this.aquarium = new Aquarium();
    }

    /**
     * Ajoute un animal au zoo en fonction de son type et de son régime alimentaire.
     *
     * @param nomAnimal le nom de l'animal.
     * @param typeAnimal le type de l'animal (voir TypeAnimal).
     * @param regime le régime alimentaire de l'animal (voir RegimeAlimentaire).
     * @throws IllegalArgumentException si le typeAnimal ou le régime est null ou invalide.
     */
    public void addAnimal(String nomAnimal, TypeAnimal typeAnimal, RegimeAlimentaire regime) {
        if (nomAnimal == null || nomAnimal.trim().isEmpty()) {
            logger.error("Le nom de l'animal ne peut pas être nul ou vide.");
            throw new IllegalArgumentException("Le nom de l'animal ne peut pas être nul ou vide.");
        }
        if (typeAnimal == null) {
            logger.error("Le type d'animal ne peut pas être nul.");
            throw new IllegalArgumentException("Le type d'animal ne peut pas être nul.");
        }
        if (regime == null) {
            logger.error("Le régime alimentaire de l'animal ne peut pas être nul.");
            throw new IllegalArgumentException("Le régime alimentaire de l'animal ne peut pas être nul.");
        }

        switch (typeAnimal) {
            case MAMMIFERE:
                if (regime == RegimeAlimentaire.CARNIVORE) {
                    zoneCarnivore.addAnimal(typeAnimal.name(), nomAnimal, regime.name());
                } else if (regime == RegimeAlimentaire.HERBIVORE) {
                    savaneAfricaine.addAnimal(typeAnimal.name(), nomAnimal, regime.name());
                }
                break;
            case REPTILE:
                fermeReptile.addAnimal(typeAnimal.name(), nomAnimal, regime.name());
                break;
            case POISSON:
                aquarium.addAnimal(typeAnimal.name(), nomAnimal, regime.name());
                break;
            default:
                logger.error("Type d'animal inconnu: " + typeAnimal);
                throw new IllegalArgumentException("Type d'animal inconnu: " + typeAnimal);
        }
    }

    /**
     * Affiche la liste des animaux dans toutes les zones du zoo.
     */
    public void afficherListeAnimaux() {
        savaneAfricaine.afficherListeAnimaux();
        zoneCarnivore.afficherListeAnimaux();
        fermeReptile.afficherListeAnimaux();
        aquarium.afficherListeAnimaux();
    }

    /**
     * Getter pour le nom du zoo.
     *
     * @return le nom du zoo.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom du zoo.
     *
     * @param nom le nom du zoo à définir.
     * @throws IllegalArgumentException si le nom est null ou vide.
     */
    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            logger.error("Le nom du zoo ne peut pas être nul ou vide.");
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être nul ou vide.");
        }
        this.nom = nom;
    }
}
