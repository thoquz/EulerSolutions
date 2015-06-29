package eulerproject11;

import java.util.Scanner;
import java.io.File;

/**
 *
 * @author phil
 */
public class EulerProject11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Running");
        readGrid readGrid = new readGrid("input.txt");
        int[][] grid = readGrid.getGrid();
        int high = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int calc = calc(grid, i, j, 4);
                if (calc > high) {
                    high = calc;
                }
            }
        }
        System.out.println("high = " + high);

//        System.out.println(grid[grid.length - 1][grid.length - 1]);
    }

    private static int calc(int[][] grid, int x, int y, int n) {
        int s = grid[y][x];
        int[] res = {s, s, s, s};
        for (int i = 1; i < n; i++) {
//            System.out.print("r" + grid[0][i+x] + " ");
            if ((i + x) < grid.length) {
                res[0] *= grid[y][i + x];
            }
            //right ->

//            System.out.print("d" + grid[i+y][0] + " ");
            if ((i + y) < grid.length) {
                res[1] *= grid[i + y][x];
            }
            //down \/

//            System.out.print("dd" + grid[i+y][i+x] + " ");
            if ((i + x) < grid.length && (i + y) < grid.length) {
                res[2] *= grid[i + y][i + x];
            }
            //diag down \

//            System.out.println(i);
//            System.out.print(grid[y-i][x +i] + " ");
            if ((i + x) < grid.length && (y - i) > 0) {
                res[3] *= grid[y - i][x + i];
            }
//            diag up /
        }

        int high = 0;
        int pos = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] > high) {
                high = res[i];
                pos = i;
            }
        }
        return high;
    }

}

class readGrid {

    Scanner file;
    String fileIn;

    public readGrid(String fileIn) {
        this.fileIn = fileIn;
    }

    public int[][] getGrid() {
        int z = getLength();
        int[][] gridRead = new int[z][z];
        int x = 0, y = 0; // -1
        try {
            file = new Scanner(new File(fileIn));

            while (file.hasNext()) {
                Scanner line = new Scanner(file.nextLine());
                y++;
                x = 0;
                while (line.hasNextInt()) {
                    x++;
                    gridRead[y - 1][x - 1] = line.nextInt();
                }
            }
            file.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return gridRead;
    }

    public int getLength() {
        try {
            Scanner count = new Scanner(new File(fileIn));
            int x = 0;
            while (count.hasNext()) {
                x++;
                count.nextLine();
            }
            count.close();
            return x;
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
    }
}
