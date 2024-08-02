package Diginamic.TPBonnesPratiques.Calculateur;

/**
 * Provides basic arithmetic operations.
 * This class includes methods to calculate the sum and the remainder of two integers.
 */
public class Calcul {

    /**
     * Calculates the sum of two integers.
     *
     * @param a the first integer to be added.
     * @param b the second integer to be added.
     * @return the sum of {@code a} and {@code b}.
     */
    public int somme(int a, int b) {
        return a + b;
    }

    /**
     * Calculates the remainder of the subtraction of two integers.
     *
     * @param a the minuend (the number from which another number is subtracted).
     * @param b the subtrahend (the number to be subtracted).
     * @return the result of {@code a} minus {@code b}.
     */
    public int reste(int a, int b) {
        return a - b;
    }
}
