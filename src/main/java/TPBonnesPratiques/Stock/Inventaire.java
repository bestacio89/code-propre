package TPBonnesPratiques.Stock;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Représente un inventaire contenant plusieurs caisses.
 */
public class Inventaire {

    private static final Logger logger = Logger.getLogger(Inventaire.class.getName());

    private final List<Caisse> caisses;

    /**
     * Constructeur pour initialiser l'inventaire avec des caisses prédéfinies.
     */
    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    /**
     * Ajoute un article à la caisse appropriée en fonction de son poids.
     *
     * @param item L'article à ajouter.
     */
    public void addItem(Item item) {
        if (item == null) {
            logger.warning("Tentative d'ajout d'un article nul.");
            return;
        }

        Caisse caisse = determineCaisse(item.getPoids());
        if (caisse != null) {
            caisse.addItem(item);
            logger.info("Article ajouté à la caisse: " + caisse.getNom());
        } else {
            logger.warning("Aucune caisse appropriée trouvée pour l'article avec poids: " + item.getPoids());
        }
    }

    /**
     * Détermine la caisse appropriée pour un article en fonction de son poids.
     *
     * @param poids Le poids de l'article.
     * @return La caisse appropriée, ou null si aucune caisse ne correspond.
     */
    private Caisse determineCaisse(double poids) {
        if (poids < 5) {
            return caisses.get(0); // Petits objets
        } else if (poids >= 5 && poids <= 20) {
            return caisses.get(1); // Moyens objets
        } else if (poids > 20) {
            return caisses.get(2); // Grands objets
        } else {
            return null;
        }
    }

    /**
     * Calcule le nombre total d'articles dans toutes les caisses.
     *
     * @return La taille totale de l'inventaire.
     */
    public int taille() {
        int totalSize = 0;
        for (Caisse caisse : caisses) {
            totalSize += caisse.getItems().size();
        }
        return totalSize;
    }
}
