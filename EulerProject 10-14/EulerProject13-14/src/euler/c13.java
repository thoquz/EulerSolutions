/*
Challenge 13
 */

package euler;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;

/*
 * @author phil
 */
public class c13 {
    public static void main(String[] args) throws FileNotFoundException {
        ReadData readData = new ReadData("c13.txt");
        
        String[] data = readData.getList();
        BigInteger total = new BigInteger("0");
        
        for (String string : data) {
            total = total.add(new BigInteger(string));
        }
        System.out.println("The total is: " + total.toString().substring(0,10));
    }
}

class ReadData {
    Scanner scan;
    ArrayList myList = new ArrayList();
    String moo[];
    
    public ReadData(String myFile) throws FileNotFoundException {
        scan = new Scanner(new File(myFile));
        
        while(scan.hasNext()) {
            myList.add(scan.nextLine());
        }
//        myList.size();
//        System.out.println( myList.size());
        
        moo = new String[myList.size()];
        
        for (int i = 0; i < myList.size(); i++) {
            moo[i] = myList.get(i).toString();
        }
    }
    
    public String[] getList() {
        return moo;
    }
    
}
