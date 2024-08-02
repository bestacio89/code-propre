package Diginamic.TPBonnesPratiques.Comptes;

/**
 * Représente un livret A, un type spécifique de compte bancaire d'épargne.
 * Le livret A est un compte d'épargne offrant des intérêts sur le solde et n'autorise pas de découvert.
 *
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {

	private static final String TYPE_LIVRET_A = "Oui" ;

	/**
     * Constructeur pour créer un livret A avec le solde initial et le taux de rémunération spécifiés.
     * Le type de compte est automatiquement défini sur "LA" pour indiquer un livret A.
     * Le découvert est fixé à zéro pour les livrets A, car un livret A ne permet pas de découvert.
     *
     * @param solde le solde initial du livret A.
     * @param tauxRemuneration le taux de rémunération annuel pour le livret A.
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(TYPE_LIVRET_A, solde, 0);
        this.setTauxRemuneration(tauxRemuneration);
    }

    /**
     * Applique les intérêts annuels au solde pour le livret A.
     *
     * @see CompteBancaire#appliquerRemuAnnuelle()
     */
    @Override
    public void appliquerRemuAnnuelle() {
        this.solde += solde * this.getTauxRemuneration()/ 100;
    }
}
