package TPBonnesPratiques.Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 * Fournit des utilitaires pour le formatage des dates.
 */
public class DateUtils {

    private DateUtils() {
        //Constructeur vide pour cacher constructeur implicite
    }

    /**
     * Formate une date selon le motif spécifié.
     *
     * @param pattern Le motif de formatage (ex. "dd/MM/yyyy HH:mm:ss").
     * @param date    La date à formater.
     * @return La date formatée sous forme de chaîne de caractères.
     */
    public static String format(String pattern, Date date) {
        if (date == null) {
            throw new IllegalArgumentException("La date ne peut pas être nulle.");
        }
        if (pattern == null || pattern.isEmpty()) {
            throw new IllegalArgumentException("Le motif de formatage ne peut pas être nul ou vide.");
        }

        // Utilisation de DateTimeFormatter pour la compatibilité avec les versions Java 8+
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            LocalDateTime localDateTime = new java.sql.Timestamp(date.getTime()).toLocalDateTime();
            return localDateTime.format(formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Le motif de formatage est invalide : " + pattern, e);
        }
    }

    /**
     * Formate une date en utilisant le format par défaut "dd/MM/yyyy HH:mm:ss".
     *
     * @param date La date à formater.
     * @return La date formatée sous forme de chaîne de caractères.
     */
    public static String formatDefaut(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("La date ne peut pas être nulle.");
        }

        // Utilisation de DateTimeFormatter pour la compatibilité avec les versions Java 8+
        try {
            DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime localDateTime = new java.sql.Timestamp(date.getTime()).toLocalDateTime();
            return localDateTime.format(defaultFormatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Erreur lors du formatage de la date avec le format par défaut.", e);
        }
    }
}
