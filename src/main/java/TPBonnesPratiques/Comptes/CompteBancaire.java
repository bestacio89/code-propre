package TPBonnesPratiques.Comptes;

/**
 * Représente un compte bancaire pouvant être soit un compte courant (type "CC") soit un livret A (type "LA").
 * Fournit des méthodes pour manipuler le solde, définir les limites de découvert et appliquer les intérêts annuels pour les livrets A.
 * <p>
 * Un compte courant (CC) permet un découvert, tandis qu'un livret A (LA) génère des intérêts.
 * </p>
 *
 * @author DIGINAMIC
 */
public class CompteBancaire {

    /** Le solde du compte. */
    double solde;

    /** Le découvert autorisé, applicable uniquement pour les comptes courants. */
    private double decouvert;

    /** Le taux de rémunération pour un livret A, exprimé en pourcentage. */
    private double tauxRemuneration;

    /** Le type du compte. Les valeurs valides sont "CC" pour compte courant et "LA" pour livret A. */
    private String typeCompte;

    /** Constante pour le type de compte courant. */
    private static final String TYPE_COMPTE_COURANT = "CC";

    /** Constante pour le type de livret A. */
    private static final String TYPE_LIVRET_A = "LA";

    /**
     * Constructeur pour créer un compte avec le type, le solde et le découvert spécifiés.
     *
     * @param typeCompte le type du compte ("CC" ou "LA").
     * @param solde le solde initial du compte.
     * @param decouvert le découvert autorisé pour les comptes courants.
     * @throws IllegalArgumentException si le type de compte est invalide.
     */
    public CompteBancaire(String typeCompte, double solde, double decouvert) {
        verifierTypeCompte(typeCompte);
        this.typeCompte = typeCompte;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Constructeur pour créer un livret A avec le type, le solde, le découvert et le taux de rémunération spécifiés.
     *
     * @param typeCompte le type du compte, doit être "LA".
     * @param solde le solde initial du compte.
     * @param decouvert le découvert autorisé (devrait être zéro pour les livrets A).
     * @param tauxRemuneration le taux de rémunération annuel pour le livret A.
     * @throws IllegalArgumentException si le type de compte n'est pas "LA" ou si le découvert est non nul.
     */
    public CompteBancaire(String typeCompte, double solde, double decouvert, double tauxRemuneration) {
        this(typeCompte, solde, decouvert);
        if (!TYPE_LIVRET_A.equals(typeCompte) || decouvert != 0) {
            throw new IllegalArgumentException("Paramètres invalides pour un livret A.");
        }
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Ajoute le montant spécifié au solde du compte.
     *
     * @param montant le montant à ajouter au solde.
     * @throws IllegalArgumentException si le montant est négatif.
     */
    public void ajouterMontant(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant à ajouter doit être positif.");
        }
        this.solde += montant;
    }

    /**
     * Retire le montant spécifié du solde du compte, en tenant compte des limites de découvert pour les comptes courants.
     *
     * @param montant le montant à retirer.
     * @throws IllegalArgumentException si le montant est négatif ou si le retrait dépasse la limite autorisée.
     */
    public void debiterMontant(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant à retirer doit être positif.");
        }
        if (solde - montant < -decouvert) {
            throw new IllegalArgumentException("Fonds insuffisants ou limite de découvert dépassée.");
        }
        this.solde -= montant;
    }

    /**
     * Applique les intérêts annuels au solde, applicable uniquement pour les livrets A.
     */
    public void appliquerRemuAnnuelle() {
        if (TYPE_LIVRET_A.equals(typeCompte)) {
            this.solde += solde * tauxRemuneration / 100;
        }
    }

    /**
     * Obtient le solde actuel du compte.
     *
     * @return le solde.
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Définit le solde du compte.
     *
     * @param solde le nouveau solde à définir.
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Obtient le découvert autorisé du compte.
     *
     * @return le découvert autorisé.
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Définit le découvert autorisé du compte.
     *
     * @param decouvert le nouveau découvert à définir.
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * Obtient le taux de rémunération pour un livret A.
     *
     * @return le taux de rémunération.
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Définit le taux de rémunération pour un livret A.
     *
     * @param tauxRemuneration le nouveau taux de rémunération à définir.
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Obtient le type du compte.
     *
     * @return le type du compte.
     */
    public String getTypeCompte() {
        return typeCompte;
    }

    /**
     * Définit le type du compte.
     *
     * @param typeCompte le nouveau type à définir.
     * @throws IllegalArgumentException si le type est invalide.
     */
    public void setTypeCompte(String typeCompte) {
        verifierTypeCompte(typeCompte);
        this.typeCompte = typeCompte;
    }

    /**
     * Vérifie que le type de compte est valide.
     *
     * @param typeCompte le type de compte à vérifier.
     * @throws IllegalArgumentException si le type de compte est invalide.
     */
    private void verifierTypeCompte(String typeCompte) {
        if (!TYPE_COMPTE_COURANT.equals(typeCompte) && !TYPE_LIVRET_A.equals(typeCompte)) {
            throw new IllegalArgumentException("Type de compte invalide. Doit être 'CC' ou 'LA'.");
        }
    }
}
