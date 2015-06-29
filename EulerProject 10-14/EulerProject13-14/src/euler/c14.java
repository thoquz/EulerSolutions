/*
Collatz problem
 */

package euler;

/*
 * @author phil
 */
public class c14 {
    public static void main(String[] args) {
//        System.out.println(colCount(13));
        
        long high = 0;
        long number = 0;
        
        for (long i = 1; i < 1000000; i++) {
            long counts = colCount(i);
            
            if (counts > high) {
                high = counts;
                number = i;
            }
        }
        System.out.println("Number " + number + " and count: " + high);
    }
    
    private static long colCount(long start) {
        long counter = 1;
        
        while(start > 1) {
            if ((start%2) == 0) {
                start /= 2;
            }
            else {
                start *= 3;
                start++;
            }
            counter++;
        }
        
        return counter;
    }
}
