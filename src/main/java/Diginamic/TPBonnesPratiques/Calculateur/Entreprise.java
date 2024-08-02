package Diginamic.TPBonnesPratiques.Calculateur;

import java.time.LocalDate;

/**
 * Represents an enterprise with various attributes including its SIRET number, name, address, and creation date.
 * The enterprise also has a maximum capital limit defined by the {@code CAPITAL_MAX} constant.
 */
public class Entreprise {

    /**
     * The SIRET number of the enterprise.
     */
    public int Siret;

    /**
     * The name of the enterprise.
     */
    public String nom;

    /**
     * The address of the enterprise.
     */
    public String adresse;

    /**
     * The creation date of the enterprise.
     */
    public LocalDate date_Creation;

    /**
     * The maximum allowed capital for the enterprise. This is a constant value set to 3,000,000.
     */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Gets the SIRET number of the enterprise.
     *
     * @return the SIRET number of the enterprise.
     */
    public int getSiret() {
        return Siret;
    }

    /**
     * Sets the SIRET number of the enterprise.
     *
     * @param siret the new SIRET number of the enterprise.
     */
    public void setSiret(int siret) {
        Siret = siret;
    }

    /**
     * Gets the name of the enterprise.
     *
     * @return the name of the enterprise.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the name of the enterprise.
     *
     * @param nom the new name of the enterprise.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets the address of the enterprise.
     *
     * @return the address of the enterprise.
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Sets the address of the enterprise.
     *
     * @param adresse the new address of the enterprise.
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Gets the creation date of the enterprise.
     *
     * @return the creation date of the enterprise.
     */
    public LocalDate getDate_Creation() {
        return date_Creation;
    }

    /**
     * Sets the creation date of the enterprise.
     *
     * @param date_Creation the new creation date of the enterprise.
     */
    public void setDate_Creation(LocalDate date_Creation) {
        this.date_Creation = date_Creation;
    }
}
