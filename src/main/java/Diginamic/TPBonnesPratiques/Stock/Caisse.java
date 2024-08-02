package Diginamic.TPBonnesPratiques.Stock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Représente une caisse contenant des articles.
 */
public class Caisse {

    private String nom;
    private final List<Item> items;

    /**
     * Constructeur pour créer une caisse avec un nom.
     *
     * @param nom Le nom de la caisse.
     */
    public Caisse(String nom) {
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut nom.
     *
     * @return Le nom de la caisse.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom.
     *
     * @param nom Le nom à définir pour la caisse.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour les articles dans la caisse.
     * La liste retournée est une vue non modifiable des articles.
     *
     * @return Une liste non modifiable des articles dans la caisse.
     */
    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    /**
     * Ajoute un article à la caisse.
     *
     * @param item L'article à ajouter.
     */
    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }

    /**
     * Retire un article de la caisse.
     *
     * @param item L'article à retirer.
     */
    public void removeItem(Item item) {
        items.remove(item);
    }
}
