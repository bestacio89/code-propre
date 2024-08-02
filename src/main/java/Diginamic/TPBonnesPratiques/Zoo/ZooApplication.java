package Diginamic.TPBonnesPratiques.Zoo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe principale pour exécuter l'application du zoo.
 * Elle crée un zoo, ajoute des animaux et affiche la liste des animaux.
 *
 * @author DIGINAMIC
 */
public class ZooApplication {

    /** Logger pour la classe ZooApplication. */
    private static final Logger logger = LoggerFactory.getLogger(ZooApplication.class);

    /**
     * Point d'entrée principal de l'application.
     *
     * @param args les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        try {
            // Création d'une instance de Zoo avec le nom "Thoiry"
            Zoo zoo = new Zoo("Thoiry");

            // Ajout d'animaux au zoo
            zoo.addAnimal("Gazelle", TypeAnimal.MAMMIFERE, RegimeAlimentaire.HERBIVORE);
            zoo.addAnimal("Zèbre", TypeAnimal.MAMMIFERE, RegimeAlimentaire.HERBIVORE);
            zoo.addAnimal("Lion", TypeAnimal.MAMMIFERE, RegimeAlimentaire.CARNIVORE);
            zoo.addAnimal("Panthère", TypeAnimal.MAMMIFERE, RegimeAlimentaire.CARNIVORE);
            zoo.addAnimal("Requin blanc", TypeAnimal.POISSON, RegimeAlimentaire.CARNIVORE); // Correction pour un requin carnivore
            zoo.addAnimal("Truite dorée", TypeAnimal.POISSON, RegimeAlimentaire.HERBIVORE);
            zoo.addAnimal("Boa constrictor", TypeAnimal.REPTILE, RegimeAlimentaire.CARNIVORE);
            zoo.addAnimal("Python", TypeAnimal.REPTILE, RegimeAlimentaire.CARNIVORE);

            // Affichage de la liste des animaux dans le zoo
            logger.info("Liste des animaux dans le zoo {}:", zoo.getNom());
            zoo.afficherListeAnimaux();

        } catch (IllegalArgumentException e) {
            logger.error("Erreur : " + e.getMessage());
        }
    }
}
