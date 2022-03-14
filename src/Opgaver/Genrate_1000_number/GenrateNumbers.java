package Opgaver.Genrate_1000_number;

import java.util.Arrays;

public class GenrateNumbers {

    public static int[] GenrateNumber(){
        int[] tabel = new int[1000];
        for (int i = 0; i < tabel.length; i++) {
          tabel[i] = (int) (Math.random()*200);
        }
    return tabel;
    }

}
