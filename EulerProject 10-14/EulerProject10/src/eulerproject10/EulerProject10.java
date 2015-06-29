/*
 Project euler 10
 Sum of primes below 2 000 000
 */
package eulerproject10;
/**
 * @author phil
 */
public class EulerProject10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long total = 0;
        for (int i = 0; i < 2000000; i++) {
            if (checkPrime(i)) {
                total += i;
            }
        }
        System.out.println("total = " + total);
    }

    private static boolean checkPrime(int test) {
        if (test == 2) {
            return true;
        }
        if (test % 2 == 0 || test < 2) {
            return false;
        }
        for (int i = 3; i < (test / 2) + 1; i++) {
            if (test % i == 0) {
                return false;
            }
        }
        return true;
    }

}
