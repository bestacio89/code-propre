package Diginamic.TPBonnesPratiques.Stock;

/**
 * Représente un article avec un nom et un poids.
 */
public class Item {

    private final String nom;
    private final int poids;

    /**
     * Constructeur pour initialiser un article avec un nom et un poids.
     *
     * @param nom   Le nom de l'article.
     * @param poids Le poids de l'article.
     */
    public Item(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    /**
     * Getter pour l'attribut nom.
     *
     * @return Le nom de l'article.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter pour l'attribut poids.
     *
     * @return Le poids de l'article.
     */
    public int getPoids() {
        return poids;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'article.
     *
     * @return Une chaîne de caractères représentant l'article.
     */
    @Override
    public String toString() {
        return "Item{" +
                "nom='" + nom + '\'' +
                ", poids=" + poids +
                '}';
    }

    /**
     * Vérifie si deux articles sont égaux.
     *
     * @param obj L'objet à comparer avec l'article.
     * @return true si les articles sont égaux, sinon false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Item item = (Item) obj;

        if (poids != item.poids) return false;
        return nom != null ? nom.equals(item.nom) : item.nom == null;
    }

    /**
     * Retourne le code de hachage de l'article.
     *
     * @return Le code de hachage de l'article.
     */
    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + poids;
        return result;
    }
}
