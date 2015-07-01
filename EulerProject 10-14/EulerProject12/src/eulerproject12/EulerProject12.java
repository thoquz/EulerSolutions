/*
Euler project 12
 */

package eulerproject12;

/**
 *
 * @author phil
 */
public class EulerProject12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        for (long i = 1; i < 1000; i++) {
//            System.out.println(triangleNum(i) + " : " + countDivisors(triangleNum(i)) );
//        }
        
        boolean notDone = true;
//        notDone = false;
        
        long num = 2;
//Divisors: 192 Number: 1493856
//Divisors: 240 Number: 2031120
//Divisors: 320 Number: 2162160
//Divisors: 480 Number: 17907120
//Divisors: 576 Number: 76576500
//Found! : 76576500
        
        long div = 0;
        long oldDiv = 0;
        
        while (notDone) {
            num++;
            div = countDivisors(triangleNum(num));
            
            if (div > oldDiv) {
                oldDiv = div;
                System.out.println("Divisors: " + div + " Number: " + triangleNum(num));
            }
            
//            if ((num%1000) == 0) {
//                System.out.prlongln("Now at " + num);
//            }
            
            if (div > 500) {
                notDone = false;
            }
        }
        
        System.out.println("Found! : " + triangleNum(num));
    }
    
    private static long triangleNum(long n) {
//        long sum = 0;
//        
//        for (long i = 1; i <= n; i++) {
//            sum += i;
//        }
//        
//        return sum;
        // Tn = 0.5n^2 + 0.5n
        return ( (n*n)+n )/2;
    }
    
    private static long countDivisors(long x) {
        int count = 2;
        
        
        for (long i = 2; i <= (x/2)+1; i++) {
            if ((x%i) == 0) {
                count++;
            }
        }
        
        return count;
    }
    
}
