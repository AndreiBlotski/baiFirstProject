package lesson5;

import static lesson5.Random.RandomCellNum.randomcellnum;
import static lesson5.Random.RandomCellNum.randomcell;

public class matrix  {
    public static void completionArray() {
        String[][] twoArray = new String[10][10];
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                if ( i % 3 == 2 || j % 3 == 2) twoArray[i][j] = String.valueOf(randomcellnum());
                else twoArray[i][j] = randomcell();
                System.out.print(twoArray[i][j] + " ");
            }
                System.out.println();
        }
                System.out.println();

                int maxi = twoArray.length - 1;

                System.out.println();

                String [] twoArray1 = mainDiagonal(twoArray, maxi);
                String [] twoArray2 = sideDiagonal(twoArray, maxi);

                System.out.println();

                System.out.println(twoArray1.equals(twoArray2));

                System.out.println();

    }
    private static String[] sideDiagonal(String[][] twoArray, int maxi) {
            for (int i = maxi; i >= 0; i--) {
                System.out.print(twoArray[i][maxi - i] + " ");
        }
                System.out.println();
            return new String[0];
    }
    private static String[] mainDiagonal(String[][] twoArray, int maxi) {
            for (int i = maxi; i >= 0; i--) {
                System.out.print(twoArray[i][i] + " ");
        }
                System.out.println();
            return new String[0];
    }

}
