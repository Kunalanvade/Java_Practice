import java.util.*;

public class jagged_arry
{

    public static void main(String[] args) {

        int[][] jaggedarray = { { 1, 2, 3 }, { 4, 5 }, { 5, 6, 7, 8 } };
        System.out.println(" printthe jagged array");
        for (int i = 0; i < jaggedarray.length; i++) {
            for (int j = 0; j < jaggedarray[i].length; j++) {
                System.out.print(jaggedarray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
